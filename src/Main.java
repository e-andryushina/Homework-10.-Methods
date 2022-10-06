import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        System.out.println("Задание 1");
        int i = 1986;
        isYearLeap(i);

        System.out.println("Задание 2");

        int releaseYear = 2022;
        int clientOS = 0;
        whatIsOSVersion(clientOS,releaseYear);

        System.out.println("Задание 3");
        int deliveryDistance = 16;
        howMuchDaysOfDelivery(deliveryDistance);

    }


    //Урок Методы. Задание 1.
    public static int isYearLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
            return (year);
        }
        else {
            System.out.println(year + " год не является високосным");
            return (year);
        }
    }

    //Урок Методы. Задание 2.

    public static int whatIsOSVersion (int clientOS, int releaseYear) {
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
        return(clientOS);

    }

    //Урок Методы. Задание 3.
    public  static int howMuchDaysOfDelivery (int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1" );
        }
        else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        }
        else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        }
        else {
            System.out.println("Доставка невозможна");
        }
        return (deliveryDistance);

    }


}