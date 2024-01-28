public class VariableNamesTheme {
    public static void main(String[] args) {
        System.out.println("1. Разные переменные");
        // цифра
        int num = 1;
        System.out.println("Цифра " + num + "\n");
        // сумма чисел
        int sum = 1 + 2;
        System.out.println("Сумма чисел " + sum + "\n");
        // произведение цифр
        int multiplication = 1 * 2;
        System.out.println("Произведение цифр " + multiplication + "\n");
        // максимальное число
        int maxNum = Integer.MAX_VALUE;
        System.out.println("Максимальное число " + maxNum + "\n");
        // количество десятков
        int tensQuantity = 3;
        System.out.println("Количество десятков " + tensQuantity + "\n");
        // вес собаки
        float dogsWeight = 23;
        System.out.println("Вес собаки " + dogsWeight + "\n");
        // исходное число
        int initialNum = 0;
        System.out.println("Исходное число " + initialNum + "\n");
        // процент по вкладу
        double interestOnDeposit = 12.45D;
        System.out.println("Процент по вкладу " + interestOnDeposit + "\n");
        // переменная хранит символ &
        char character = '\u0026';
        System.out.println("Переменная хранит символ " + character + "\n");
        // код ошибки
        String exception = "Exception in thread \"main\" java.io.FileNotFoundExcep" +
                "tion: C:\\Users\\Username\\Desktop\\test.txt (Системе не уд" +
                "ается найти указанный путь)";
        System.out.println("Код ошибки \"" + exception + "\"" + "\n");
        // тип сообщения
        String typeOfMessage = "TextMessage";
        System.out.println("Тип сообщения " + typeOfMessage + "\n");
        // число нолей
        int zeroQuantity = 34;
        System.out.println("Число нулей " + zeroQuantity + "\n");
        // уникальное число
        int uniqueNum = 7;
        System.out.println("Уникальное число " + uniqueNum + "\n");
        // случайное число
        double randomNum = Math.random() * 100;
        System.out.println("Случайное число " + randomNum + "\n");
        // математическое выражение
        String mathExpression = "(1 + 2) / 3 = 1";
        System.out.println("Математическое выражение " + mathExpression + "\n");
        // выбор (чего-либо)
        String choice = "Выберите одну из опций: \n1)Да \n2)Нет \n3)Наверное";
        System.out.println(choice + "\n");
        // счет(в игре)
        String scores = "3 : 8";
        System.out.println("Счет в игре: " + scores + "\n");
        // максимальная длина (строки)
        int stringLenght = 345;
        System.out.println("Максимальная длина строки " + stringLenght + "\n");
        // пункт меню
        String menuItem = "Главное меню";
        System.out.println("Пункт меню: " + menuItem + "\n");
        // стоимость кофе на вынос
        double coffeeToGoPrice = 159.99;
        System.out.println("Стоимость кофе на вынос " + coffeeToGoPrice + "₽" + "\n");
        // дата начала (чего-либо)
        String startDate = "01.01.1968г.";
        System.out.println("Дата начала " + startDate + "\n");
        // окончание диапазона
        String endOfRange = "9999999";
        System.out.println("Окончание диапазона [...-" + endOfRange + "]" + "\n");
        // полное имя работника месяца
        String bestSellerFullName = "Hydee Alex Ernetstovich";
        System.out.printf("Полное имя работника месяца %s\n\n", 
                bestSellerFullName);
        // заголовок электронной книги
        String bookTitle = "Атомные Привычки - Джеймс Клир";
        System.out.println("Заголовок электронной книги: " + bookTitle + "\n");
        // размер
        String size = "M";
        System.out.println("Размер " + size + "\n");
        // вместимость
        int capacity = 33;
        System.out.println("Вместимость грузовика: " + capacity + " коровы\n");
        // счетчик
        int counter = 3;
        System.out.println("Счетчик: " + counter + "\n");
        // путь до файла
        String pathToFile = "/Users/keevo/Java/StartJava/VariableNamesTheme.java";
        System.out.println("Путь к файлу: " + pathToFile + "\n");
        // количество чисел в каждой строке
        int numbersQuantityInLine = 567;
        System.out.printf("Количество чисел в каждой строке: %d\n\n", numbersQuantityInLine);

        System.out.println("2. boolean-переменные");
        // сотни равны?
        boolean isHundredsEqual = true;
        System.out.println("Сотни равны? " + isHundredsEqual + "\n");
        // компьютер включен?
        boolean isComputerOn = true;
        System.out.println("Компьютер включен? " + isComputerOn + "\n");
        // есть равные цифры?
        boolean isThereEqualsNums = false;
        System.out.println("Есть равные цифры? " + isThereEqualsNums + "\n");
        // (что-либо) создано?
        boolean isCreated = true;
        System.out.println("Это создано? " + isCreated + "\n");
        // (что-либо) пустое?
        boolean isEmpty = false;
        System.out.println("Это пустое? " + isEmpty + "\n");
        // (что-либо) активное?
        boolean isActive = false;
        System.out.println("Это активно? " + isActive + "\n");
        // новый?
        boolean isNew = true;
        System.out.println("Новый?" + isNew + "\n");
        // электронная почта действительная?
        boolean isEmailValid = true;
        System.out.println("Имейл действителен? " + isEmailValid + "\n");
        // имеются уникальные строки?
        boolean isUniqueStrings = false;
        System.out.println("Имеются уникальные строки? " + isUniqueStrings + "\n");

        System.out.println("3. Аббревиатуры");
        // старый universally unique identifier
        String oldUud = "blablabla1234";
        System.out.println("Старый universally unique identifier: " + oldUud + "\n");
        // производитель оперативной памяти
        String ramProducer = "Kingston";
        System.out.println("Производитель оперативной памяти: " + ramProducer + "\n");
        // емкость жесткого диска
        String hddCapacity = "512 Gb";
        System.out.println("Емкость жесткого диска: " + hddCapacity + "\n");
        // протокол передачи гипертекста
        String httpProtocol = "HyperText Transfer Protocol";
        System.out.println("Протокол передачи гипертекста: " + httpProtocol + "\n");
        // сокращенный uniform resource locator
        String abbreviationUrl = "www.t.me";
        System.out.println("Сокращенный uniform resource locator: " + abbreviationUrl + "\n");
        // новый идентификатор клиента
        String newClientId = "Ivanov777";
        System.out.println("Новый идентификатор клиента: " + newClientId + "\n");
        // кодировка american standard code for information interchange
        String asciiEncoding = "ASCII";
        System.out.println("Кодировка: " + asciiEncoding + "\n");
    }
}