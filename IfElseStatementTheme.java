public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");

        boolean isMale = true;
        if (!isMale) {
            System.out.println("Женщина");
        } else {
            System.out.println("Мужчина");
        }

        int age = 19;
        if (age > 18) {
            System.out.println("Уже можно");
        } else {
            System.out.println("Еще нельзя");
        }

        float height = 1.7f;
        if (height < 1.8) {
            System.out.println("Невысокий");
        } else {
            System.out.println("Высокий");
        }

        char firstNameLetter = "Maksim".charAt(0);
        if (firstNameLetter == 'M') {
            System.out.println("Первая буква имени - 'М'");
        } else if (firstNameLetter == 'I') {
            System.out.println("Первая буква имени - 'I'");
        } else {
            System.out.println("Первая буква имени - ни 'M', ни 'I'");
        }

        System.out.println("\n2. Поиск большего числа");

        int a = 11;
        int b = 23;
        if (a > b) {
            System.out.printf("Число %d больше числа %d", a, b);
        } else if (a == b) {
            System.out.printf("Числа %d и %d равны", a, b);
        } else {
            System.out.printf("Число %d больше числа %d", b, a);
        }

        System.out.println("\n\n3. Проверка числа");

        int num = 122;
        if (num == 0) {
            System.out.printf("Число %d равно нулю", num);
        } else {
            System.out.printf("%d является ", num);
            if (num < 0) {
                System.out.print("отрицательным и ");
            } else {
                System.out.print("положительным и ");
            }
            if (num % 2 != 0) {
                System.out.print("нечетным");
            } else {
                System.out.print("четным");
            }
        }

        System.out.println("\n\n4. Поиск одинаковых цифр в числах");

        int c = 123;
        int hundredsC = c / 100;
        int tensC = c % 100 / 10;
        int onesC = c % 10;
        
        int d = 123;
        int hundredsD = d / 100;
        int tensD = d % 100 /10;
        int onesD = d % 10;

        if (hundredsC == hundredsD || tensC == tensD || onesC == onesD) {
            System.out.printf("Исходные числа: %d и %d\n", c, d);
            System.out.print("Одинаковые цифры в числах: \n");
            if (hundredsC == hundredsD) {
                System.out.printf("%d и %d в разряде \"сотни\"\n", hundredsC, hundredsD);
            }
            if (tensC == tensD) {
                System.out.printf("%d и %d в разряде \"десятки\"\n", tensC, tensD);
            }
            if (onesC == onesD) {
                System.out.printf("%d и %d в разряде \"единицы\"\n", onesC, onesD);
            }
        } else {
            System.out.println("К сожалению, одинаковых цифр в разрядах у указанных чисел нет\n");
        }

        System.out.println("\n5. Определение символа по его коду");

        char symbol = '\u0057';
        if (symbol >= '0' && symbol <= '9') {
            System.out.println("Символ " + symbol + " является цифрой");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("Символ " + symbol + " является заглавной буквой");
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("Символ " + symbol + " является строчной буквой");
        } else {
            System.out.println(symbol + " - это не буква и не цифра");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");

        int depositAmount = 301_000;
        int bankCharge = 5;
        if (depositAmount > 300_000) {
            bankCharge = 10;
        } else if (depositAmount >= 100_000 && depositAmount <= 300_000) {
            bankCharge = 7;
        }
        int interestCharge = (depositAmount / 100) * bankCharge;
        System.out.println("Сумма вклада " + depositAmount +
                "\nСумма начисленного % " + interestCharge +
                "\nИтоговая сумма " + (interestCharge + depositAmount));

        System.out.println("\n7. Определение оценки по предметам\n");

        int historyPercent = 59;
        int historyScore = 2;
        if (historyPercent > 91) {
            historyScore = 5;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyScore = 4;
        } else if (historyPercent > 60 && historyPercent <= 73) {
            historyScore = 3;
        }
        System.out.printf("История. Оценка %d\n", historyScore);
        int programmingPercent = 92;
        int programmingScore = 2;
        if (programmingPercent > 91) {
            programmingScore = 5;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingScore = 4;
        } else if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingScore = 3;
        }
        System.out.printf("Программирование. Оценка %d\n", programmingScore);
        System.out.printf("Средний балл оценок по предметам %d\n", (historyScore + programmingScore) / 2);
        System.out.printf("Средний %% по предметам %d", (historyPercent + programmingPercent) / 2);

        System.out.println("\n\n8. Расчет годовой прибыли");
        int salesMonth = 13_000;
        int rentMonth = 5_000;
        int productionCostMonth = 9_000;
        int profit = salesMonth * 12 - (productionCostMonth + rentMonth ) * 12;
        System.out.print("Прибыль за год: ");
        if (profit <= 0) {
            System.out.printf("%d руб.\n", profit);
        } else {
            System.out.printf("+%d руб.\n", profit);
        }
    }
}