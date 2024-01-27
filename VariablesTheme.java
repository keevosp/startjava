public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        byte quantityOfCores = 8;
        System.out.println("Количество ядер " + quantityOfCores + "шт.");
        short cpuRate = 2500;
        System.out.println("Базовая тактовая частота процессора " + cpuRate + "МГц");
        byte ramVolume = 16;
        System.out.println("Объем оперативной памяти " + ramVolume + "Гб");
        short hddVolume = 512;
        System.out.println("Объем жесткого диска " + hddVolume + "Гб");
        float usbType = 3.2f;
        char usbTypeA = 'A';
        System.out.println("Тип USB портов " + usbType + ", Type " + usbTypeA);
        byte netSpeed = 1;
        System.out.println("Скорость сетевого адаптера " + netSpeed + "Гбит/с");
        long price = 9_223_372_036_854_775_807L;
        System.out.println("Стоимость " + price + " Тугриков");
        boolean isRamExpandable = true;
        System.out.println("Возможность расширения оперативной памяти " + isRamExpandable);
        double osVersion = 12.23;
        System.out.println("Версия Операционной Системы Shliop-Shliop OS " + osVersion + "\n");
        System.out.println("2. Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        int discount = 11;
        int summaryPrice = penPrice + bookPrice;
        int discountedSummaryPrice = summaryPrice - ((penPrice + bookPrice) / 100 * discount);
        System.out.println("Общая стоимость товаров без скидки = " + (penPrice + bookPrice) + "₽");
        System.out.println("Сумма скидки = " + discount + "%");
        System.out.println("Общая стоимость товаров со скидкой = " + discountedSummaryPrice + "₽\n");

        System.out.println("3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a    \n" + 
                "   J   a a  v   v  a a  \n" + 
                "J  J  aaaaa  V V  aaaaa \n" + 
                " JJ  a     a  V  a     a\n");

        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte b =  Byte.MAX_VALUE;
        short s = Short.MAX_VALUE;
        int i = Integer.MAX_VALUE;
        long l = Long.MAX_VALUE;
        System.out.println("byte. Максимальное значение " + b);
        System.out.println("byte. Инкремент на единицу " + (b + 1));
        System.out.println("byte. Декремент на единицу " + (b - 1));
        System.out.println("short. Максимальное значение " + s);
        System.out.println("short. Инкремент на единицу " + (s + 1));
        System.out.println("short. Декремент на единицу " + (s - 1));
        System.out.println("int. Максимальное значение " + i);
        System.out.println("int. Инкремент на единицу " + (i + 1));
        System.out.println("int. Декремент на единицу " + (i - 1));
        System.out.println("long. Максимальное значение " + l);
        System.out.println("long. Инкремент на единицу " + (l + 1));
        System.out.println("long. Декремент на единицу " + (l - 1));

        System.out.println("\n5. Перестановка значений переменных");
        int digit1 = 7;
        int digit2 = 5;
        System.out.println("a. Перестановка с помощью третьей переменной");
        System.out.printf("Исходные значения переменных: %d, %d\n", digit1, digit2);
        int temp = digit1;
        digit1 = digit2;
        digit2 = temp;
        System.out.printf("Новые значения переменных с помощью третьей переменной: %d, %d\n", digit1, digit2);
        System.out.printf("b. Перестановка с помощью арифметических операций\n" +
                "Исходные значения переменных: %d, %d\n", digit1, digit2);
        System.out.println("Новые значения переменных с помощью вычисления и сложения: " + 
                + (temp = digit1 - (digit1 - digit2)) + ", " + (digit2 + (digit1 - digit2)));
        System.out.printf("c. Перестановка с помощью побитовой операции ^\n" + 
                "Исходные значения переменных: %d, %d\n", digit1, digit2);
        digit1 ^= digit2;
        digit2 ^= digit1;
        digit1 ^= digit2;
        System.out.println("Новые значения переменных с помощью побитовой операции ^: " +
                + digit1 + ", " + digit2 + "\n");

        System.out.println("6. Вывод символов и их кодов");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';
        System.out.println("Код символа - Символ\n" +
                "         " + (int)dollar + " - " + dollar + "\n" +
                "         " + (int)asterisk + " - " + asterisk + "\n" +
                "         " + (int)atSign + " - " + atSign + "\n"+
                "        " + (int)verticalBar + " - " + verticalBar + "\n" +
                "        " + (int)tilde + " - " + tilde + "\n");

        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char underline = '_';
        char leftParanthesis = '(';
        char rightParanthesis = ')';
        System.out.println("    " + slash + backSlash + "    \n" +
                "   " + slash + "  " + backSlash + "   \n" +
                "  " + slash + underline + leftParanthesis + " " + rightParanthesis + backSlash + "  \n" +
                " " + slash + "      " + backSlash + " \n" +
                "" + slash + underline + underline + underline + 
                underline + slash + backSlash + underline + underline + backSlash + "\n");

        System.out.println("8. Вывод количества сотен, десятков и единиц числа");
        int num = 123;
        int hundreds = num / 100;
        int tens = (num % 100)/ 10;
        int ones = num % 10;
        System.out.println("Число " + num + "содержит: \n" +
                "  сотен - " + hundreds + "\n" +
                "  десятков - " + tens + "\n" +
                "  единиц - " + ones + "\n" +
                "Сумма его цифр = " + (hundreds + tens + ones) + "\n" +
                "Произведение = " + (hundreds * tens * ones) + "\n");

        System.out.println("9. Вывод времени");
        int seconds = 86399;
        int hours = seconds / 3_600;
        int minutes = (seconds / 60) % 60;
        int finalSeconds = seconds % 60;
        System.out.printf("%d:%d:%d", hours, minutes, finalSeconds);
    }
}










