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
            System.out.println("Первая буква имени - 'М'\n");
        } else if (firstNameLetter == 'I') {
            System.out.println("Первая буква имени - 'I'\n");
        } else {
            System.out.println("Первая буква имени - ни 'M', ни 'I'\n");
        }

        System.out.println("2. Поиск большего числа");

        int a = 11;
        int b = 23;
        if (a > b) {
            System.out.printf("Число %d больше числа %d\n\n", a, b);
        } else if (a == b) {
            System.out.printf("Числа %d и %d равны\n\n", a, b);
        } else {
            System.out.printf("Число %d больше числа %d\n\n", b, a);
        }

        System.out.println("3. Проверка числа");

        int num = -121;
        if (num == 0) {
            System.out.printf("Число %d равно нулю\n\n", num);
        } else if (num != 0) {
            if (num < 0 && num % 2 == 0) {
                System.out.printf("%d является отрицательным и четным\n\n", num);
            } if (num < 0 && num % 2 != 0) {
                System.out.printf("%d является отрицательным и нечетным\n\n", num);
            } if (num > 0 && num % 2 != 0) {
                System.out.printf("%d является положительным и нечетным\n\n", num);
            } if (num > 0 && num % 2 == 0) {
                System.out.printf("%d является положительным и четным\n\n", num);
            }
        }

        System.out.println("4. Поиск одинаковых цифр в числах");

        int c = 123;
        int hundredsC = c / 100;
        int tensC = c % 100 / 10;
        int unitiesC = c % 10;
        
        int d = 156;
        int hundredsD = d / 100;
        int tensD = d % 100 /10;
        int unitiesD = d % 10;

        if (hundredsC == hundredsD || tensC == tensD || unitiesC == unitiesD) {
            System.out.printf("Исходные числа: %d и %d\n", c, d);
            System.out.print("Одинаковые цифры в числах:\n");
            if (hundredsC == hundredsD) {
                System.out.printf("%d и %d в разряде \"сотни\"\n", hundredsC, hundredsD);
            } if (tensC == tensD) {
                System.out.printf("%d и %d в разряде \"десятки\"\n", tensC, tensD);
            } if (unitiesC == unitiesD) {
                System.out.printf("%d и %d в разряде \"единицы\"\n", unitiesC, unitiesD);
            }
        } else {
            System.out.println("К сожалению, одинаковых цифр в разрядах у указанных чисел нет\n");
        }

        System.out.println("\n5. Определение символа по его коду");

        char ch = '\u0057';
        if (ch >= '0' && ch <= '9') {
            System.out.println("Символ " + ch + " является цифрой\n");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Символ " + ch + " является заглавной буквой\n");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Символ " + ch + " является строчной буквой\n");
        } else {
            System.out.println(ch + " - это не буква и не цифра\n");
        }

        System.out.println("6. Подсчет суммы вклада и начисленных банком %");

        int depositAmount = 301_000;
        int bankCharge = 0;
        int interestCharge = 0;
        if (depositAmount > 300_000) {
            bankCharge = 10;
            interestCharge = (depositAmount / 100) * bankCharge;
            System.out.println("Сумма вклада " + depositAmount +
                "\nСумма начисленного % " + interestCharge +
                "\nИтоговая сумма " + (interestCharge + depositAmount) + "\n");
        } else if (depositAmount >= 100_000 && depositAmount <= 300_000) {
            bankCharge = 7;
            interestCharge = (depositAmount / 100) * bankCharge;
            System.out.println("Сумма вклада " + depositAmount +
                "\nСумма начисленного % " + interestCharge +
                "\nИтоговая сумма " + (interestCharge + depositAmount) + "\n");
        } else if (depositAmount < 100_000) {
            bankCharge = 5;
            interestCharge = (depositAmount / 100) * bankCharge;
            System.out.println("Сумма вклада " + depositAmount +
                "\nСумма начисленного % " + interestCharge +
                "\nИтоговая сумма " + (interestCharge + depositAmount) + "\n");
        }

        System.out.println("7. Определение оценки по предметам");

        int historyPercent = 59;
        int historyScore = 0;
        if (historyPercent <= 60) {
            historyScore = 2;
            System.out.printf("История. Оценка %d\n", historyScore);
        } else if (historyPercent > 60 && historyPercent <= 73) {
            historyScore = 3;
            System.out.printf("История. Оценка %d\n", historyScore);
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyScore = 4;
            System.out.printf("История. Оценка %d\n", historyScore);
        } else if (historyPercent > 91) {
            historyScore = 5;
            System.out.printf("История. Оценка %d\n", historyScore);
        }
        int programmingPercent = 92;
        int programmingScore = 0;
        if (programmingPercent <= 60) {
            programmingScore = 2;
            System.out.printf("Программирование. Оценка %d\n", programmingScore);
        } if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingScore = 3;
            System.out.printf("Программирование. Оценка %d\n", programmingScore);
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingScore = 4;
            System.out.printf("Программирование. Оценка %d\n", programmingScore);
        } else if (programmingPercent > 91) {
            programmingScore = 5;
            System.out.printf("Программирование. Оценка %d\n", programmingScore);
        }
        System.out.printf("Средний балл оценок по предметам %d\n", (historyScore + programmingScore) / 2);
        System.out.printf("Средний %% по предметам %d\n\n", (historyPercent + programmingPercent) / 2);

        System.out.println("8. Расчет годовой прибыли");
        int salesMonth = 13_000;
        int rentMonth = 5_000;
        int productionCostMonth = 9_000;
        int salesYear = salesMonth * 12;
        int rentYear = rentMonth * 12;
        int productionCostYear = productionCostMonth * 12;
        int profit = salesYear - (productionCostYear + rentYear);
        if (profit <= 0) {
            System.out.printf("Прибыль за год: %d руб.\n", profit);
        } if (profit > 0) {
            System.out.printf("Прибыль за год: +%d руб.\n", profit);
        }
    }
}