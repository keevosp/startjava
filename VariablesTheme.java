public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        // Объявление и присвоение значений для 8ми примитивных типов данных: 
        // boolean, byte, short, char, int, long, float и double. 
        boolean isRamExpandable = true;
        System.out.println("Возможность расширения оперативной памяти " + isRamExpandable);
        byte quantityOfCores = 8;
        System.out.println("Количество ядер " + quantityOfCores + "шт.");
        short cpuRate = 2500;
        System.out.println("Базовая тактовая частота процессора " + cpuRate + "МГц");
        char usbTypeA = 'A';
        System.out.println("Количество USB портов типа " + usbTypeA + ": 2");
        float usbTypeC = 3.2f;
        System.out.println("Количество USB портов типа " + usbTypeC + ": 4");
        long price = 9_223_372_036_854_775_807L;
        System.out.println("Стоимость " + price + " Тугриков");
        int ramVolume = 16;
        System.out.println("Объем оперативной памяти " + ramVolume + "Гб");
        double osVersion = 12.23;
        System.out.println("Версия Операционной Системы Shliop-Shliop OS " + osVersion + "\n");
        
        System.out.println("2. Расчет стоимости товара со скидкой");
        int bookPrice = 200;
        int discount = 11;
        int penPrice = 100;
        int totalPrice = penPrice + bookPrice;
        int discountPrice = totalPrice - (totalPrice / 100 * discount);
        System.out.println("Общая стоимость товаров без скидки = " + totalPrice + "₽");
        System.out.println("Сумма скидки = " + (totalPrice - discountPrice) + "₽");
        System.out.println("Общая стоимость товаров со скидкой = " + discountPrice + "₽\n");

        System.out.println("3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a\n" + 
                "   J   a a  v   v  a a\n" + 
                "J  J  aaaaa  V V  aaaaa\n" + 
                " JJ  a     a  V  a     a\n");

        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte byteMaxValue =  Byte.MAX_VALUE;
        short shortMaxValue = Short.MAX_VALUE;
        int intMaxValue = Integer.MAX_VALUE;
        long longMaxValue = Long.MAX_VALUE;
        System.out.println("byte. Максимальное значение " + byteMaxValue);
        System.out.println("byte. Инкремент на единицу " + ++byteMaxValue);
        System.out.println("byte. Декремент на единицу " + --byteMaxValue);
        System.out.println("short. Максимальное значение " + shortMaxValue);
        System.out.println("short. Инкремент на единицу " + ++shortMaxValue);
        System.out.println("short. Декремент на единицу " + --shortMaxValue);
        System.out.println("int. Максимальное значение " + intMaxValue);
        System.out.println("int. Инкремент на единицу " + ++intMaxValue);
        System.out.println("int. Декремент на единицу " + --intMaxValue);
        System.out.println("long. Максимальное значение " + longMaxValue);
        System.out.println("long. Инкремент на единицу " + ++longMaxValue);
        System.out.println("long. Декремент на единицу " + --longMaxValue + "\n");

        System.out.println("5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        System.out.println("a. Перестановка с помощью третьей переменной");
        System.out.printf("Исходные значения переменных: %d, %d\n", a, b);
        int tmp = a;
        a = b;
        b = tmp;
        System.out.printf("Новые значения переменных с помощью третьей переменной: %d, %d\n", a, b);
        System.out.printf("b. Перестановка с помощью арифметических операций\n" +
                 "Исходные значения переменных: %d, %d\n", a, b);
        System.out.println("Новые значения переменных с помощью вычисления и сложения: " + 
                + (a - (a - b)) + ", " + (b + (a - b)));
        System.out.printf("c. Перестановка с помощью побитовой операции ^\n" + 
                "Исходные значения переменных: %d, %d\n", a, b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("Новые значения переменных с помощью побитовой операции ^: " +
                + a + ", " + b + "\n");

        System.out.println("6. Вывод символов и их кодов");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';
        System.out.println("Код символа - Символ\n" +
                "\t" + (int) dollar + " - " + dollar + "\n" +
                "\t" + (int) asterisk + " - " + asterisk + "\n" +
                "\t" + (int) atSign + " - " + atSign + "\n"+
                "\t" + (int) verticalBar + " - " + verticalBar + "\n" +
                "\t" + (int) tilde + " - " + tilde + "\n");

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