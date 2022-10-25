import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        System.out.println("Задание 1");
        int i = 1986;
        isYearLeap(i);

        System.out.println("Задание 2");

        int releaseYear = 2022;
        int clientOS = 0;
        whatIsOSVersion(clientOS, releaseYear);

        System.out.println("Задание 3");
        int deliveryDistance = 16;
        howMuchDaysOfDelivery(deliveryDistance);

        System.out.println("Задача к курсовой");
        int[] number = {23, 56, 78, 53, 47, 89, 144, 345};

        arrayCalculations(number);
    }


    //Урок Методы. Задание 1.
    public static void isYearLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    //Урок Методы. Задание 2.

    public static void whatIsOSVersion(int clientOS, int releaseYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && releaseYear == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");

        } else if (clientOS == 0 && releaseYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && releaseYear == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && releaseYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

    }

    //Урок Методы. Задание 3.
    public static void howMuchDaysOfDelivery(int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставка невозможна");
        }

    }


    //Задача к курсовой
    public static void arrayCalculations(int[] arr) {
        for (int i = 2; i < 7; i++) {
            if (arr[i] % 2 == 0 || arr[i] == 0) {
                arr[i]++;
                System.out.println(arr[i]);
            } else {
                System.out.println(arr[i]);
            }
        }
    }
}



