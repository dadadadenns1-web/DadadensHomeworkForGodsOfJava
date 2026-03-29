//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //part 1
        byte clientOS = 0; //0 — iOS, 1 — Android  изменяемая переменная
        boolean iOS = (clientOS == 0);
        if (iOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //part 2
        short clientDeviceYear = 2015;//изменяемая переменная
        boolean releasedBefore2015 = (clientDeviceYear < 2015);
        if (iOS && releasedBefore2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (iOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (releasedBefore2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //part 3
        short year = 2021; //изменяемая переменная
        short introductionOfLeapYear = 1584;
        boolean divisibleBy4 = (year % 4 == 0);
        boolean notDivisibleBy100 = (year % 100 != 0);
        boolean divisibleBy400 = (year % 400 == 0);
        boolean leapYear = divisibleBy4 && (divisibleBy400 || notDivisibleBy100) && (year > introductionOfLeapYear); //Если делится на 4 и (делится на 400 или не делится на 100) и больше 1584
        if (leapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        //part 4
        short deliveryDistance = 95; //изменяемая переменная
        short firstIntervalBoundary = 20;
        short maxDistance = 100;
        short secondIntervalBoundary = 60;
        byte daysToDeliver = 1;
        byte additionalDay = 1;
        if (deliveryDistance > firstIntervalBoundary) {
            daysToDeliver = (byte) (daysToDeliver + additionalDay);
        }
        if (deliveryDistance > secondIntervalBoundary) {
            daysToDeliver = (byte) (daysToDeliver + additionalDay);
        }
        if (deliveryDistance <= maxDistance) {
            System.out.println("Потребуется дней: " + daysToDeliver);
        } else {
            System.out.println("Доставки нет");
        }

        //part 5.

        byte monthNumber = 12; //изменяемая переменная 1 2 12 - зима; 3 4 5 - весна; 6 7 8 - лето; 9 10 11 - осень;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Сейчас зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас осень");
                break;
            default:
                System.out.println("Несуществующий месяц");
        }
    }
}