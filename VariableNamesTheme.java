import java.util.*;

public class VariableNamesTheme {
    public static void main(String[] args) {
        // разные переменные
        System.out.println("1. Разные переменные");
        int num = 1;
        System.out.println("Цифра " + num + "\n");
        int sum = 1 + 2;
        System.out.println("Сумма чисел " + sum + "\n");
        int multiplication = 1 * 2;
        System.out.println("Произведение цифр " + multiplication + "\n");
        int maxNum = Integer.MAX_VALUE;
        System.out.println("Максимальное число " + maxNum + "\n");
        int tensQuantity = 3;
        System.out.println("Количество десятков " + tensQuantity + "\n");
        float dogsWeight = 23;
        System.out.println("Вес собаки " + dogsWeight + "\n");
        int initialNum = 0;
        System.out.println("Исходное число " + initialNum + "\n");
        double interestOnDeposit = 12.45D;
        System.out.println("Процент по вкладу " + interestOnDeposit + "\n");
        char character = '\u0026';
        System.out.println("Переменная хранит символ " + character + "\n");
        String exception = "Exception in thread \"main\" java.io.FileNotFoundExcep" +
                "tion: C:\\Users\\Username\\Desktop\\test.txt (Системе не уд" +
                "ается найти указанный путь)";
        System.out.println("Код ошибки \"" + exception + "\"" + "\n");
        String typeOfMessage = "TextMessage";
        System.out.println("Тип сообщения " + typeOfMessage + "\n");
        int zeroQuantity = 34;
        System.out.println("Число нулей " + zeroQuantity + "\n");
        int uniqueNum = 7;
        System.out.println("Уникальное число " + uniqueNum + "\n");
        double randomNum = Math.random() * 100;
        System.out.println("Случайное число " + randomNum + "\n");
        String mathExpression = "(1 + 2) / 3 = 1";
        System.out.println("Математическое выражение " + mathExpression + "\n");
        String choice = "Выберите одну из опций: \n1)Да \n2)Нет \n3)Наверное";
        System.out.println(choice + "\n");
        int goalCounterTeamA = 3;
        int goalCounterTeamB = 8;
        System.out.println("Счет в игре: " + goalCounterTeamA + ":" + goalCounterTeamB + "\n");
        int stringLenght = 345;
        System.out.println("Максимальная длина строки " + stringLenght + "\n");
        String menuItem = "Главное меню";
        System.out.println("Пункт меню: " + menuItem + "\n");
        double coffeeToGoPrice = 159.99;
        System.out.println("Стоимость кофе на вынос " + coffeeToGoPrice + "₽" + "\n");
        String startDate = "01.01.1968г.";
        System.out.println("Дата начала " + startDate + "\n");
        String endOfRange = "9999999";
        System.out.println("Окончание диапазона [...-" + endOfRange + "]" + "\n");
        String bestSellersSurname = "Hydee";
        String bestSellersName = "Alex";
        String bestSellersMidName = "Ernestovich";
        System.out.printf("Полное имя работника месяца %s %s %s\n\n", 
                bestSellersSurname, bestSellersName, bestSellersMidName);
        String bookTitle = "Атомные Привычки - Джеймс Клир";
        System.out.println("Заголовок электронной книги: " + bookTitle + "\n");
        String size = "M";
        System.out.println("Размер " + size + "\n");
        int capacity = 33;
        System.out.println("Вместимость грузовика: " + capacity + " коровы\n");
        int counter = 3;
        System.out.println("Счетчик " + counter + "\n");
        String pathToFile = "/Users/keevo/Java/StartJava/VariableNamesTheme.java";
        System.out.println("Путь к файлу " + pathToFile + "\n");
        int numQuantityLine1 = 123;
        int numQuantityLine2 = 345;
        int numQuantityLine3 = 567;
        System.out.printf("Количество чисел в каждой строке:\nПервая строка %d\nВто" +
                "рая строка %d\nТретья строка %d\n\n", numQuantityLine1, numQuantityLine2, numQuantityLine3);

        //Булевые
        System.out.println("2. boolean-переменные");
        boolean isHundredsEqual = true;
        System.out.println("Сотни равны? " + isHundredsEqual + "\n");
        boolean isComputerOn = true;
        System.out.println("Компьютер включен? " + isComputerOn + "\n");
        boolean isThereEqualsNums = false;
        System.out.println("Есть равные цифры? " + isThereEqualsNums + "\n");
        boolean isCreated = true;
        System.out.println("Это создано? " + isCreated + "\n");
        boolean isEmpty = false;
        System.out.println("Это пустое? " + isEmpty + "\n");
        boolean isActive = false;
        System.out.println("Это активно? " + isActive + "\n");
        boolean isNew = true;
        System.out.println("Новый?" + isNew + "\n");
        boolean isEmailValid = true;
        System.out.println("Имейл действителен? " + isEmailValid + "\n");
        boolean isUniqueStrings = false;
        System.out.println("Имеются уникальные строки? " + isUniqueStrings + "\n");

        //Аббревиатуры
        System.out.println("3. Аббревиатуры");
        String oldUud = "blablabla1234";
        System.out.println("Старый universally unique identifier " + oldUud + "\n");
        String ramProducer = "Kingston";
        System.out.println("Производитель оперативной памяти " + ramProducer + "\n");
        String hddCapacity = "512 Gb";
        System.out.println("Емкость жесткого диска " + hddCapacity + "\n");
        String httpProtocol = "HyperText Transfer Protocol";
        System.out.println("Протокол передачи гипертекста " + httpProtocol + "\n");
        String abbreviationUrl = "www.t.me";
        System.out.println("Сокращенный uniform resource locator " + abbreviationUrl + "\n");
        String newClientId = "Ivanov777";
        System.out.println("Новый идентификатор клиента " + newClientId + "\n");
        String asciiEncoding = "ASCII";
        System.out.println("Кодировка " + asciiEncoding + "\n");
    }
}