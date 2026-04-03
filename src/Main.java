
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.time.LocalDate;

public class Main {
    //part 1
    public static void checkLeapYear(int year) {
        int introductionOfLeapYear = 1584;
        boolean divisibleBy4 = (year % 4 == 0);
        boolean notDivisibleBy100 = (year % 100 != 0);
        boolean divisibleBy400 = (year % 400 == 0);
        boolean leapYear = divisibleBy4 && (divisibleBy400 || notDivisibleBy100) && (year > introductionOfLeapYear); //Если делится на 4 и (делится на 400 или не делится на 100) и больше 1584
        if (leapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    //part 2
    public static void suggestAppVersion(int clientDeviceYear, int clientOS) {
        if (clientOS < 0 || clientOS > 1) {
            System.out.println("Неизвестная операционная система");
            return;
        }
        int yearNow = LocalDate.now().getYear();
        boolean iOS = (clientOS == 0);//1 - android, 0 - iOS
        boolean isOlderThanCurrentYear = (clientDeviceYear < yearNow);
        if (iOS && isOlderThanCurrentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (iOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (isOlderThanCurrentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    //part 3
    public static int checkDeliveryTimeInDays(int deliveryDistance) {
        short firstIntervalBoundary = 20;
        short secondIntervalBoundary = 60;
        short maxDistance = 100;
        int daysToDeliver = 1;
        if (deliveryDistance > maxDistance) {
            daysToDeliver = -1;
        } else if (deliveryDistance > secondIntervalBoundary) {
            daysToDeliver += 2;
        } else if (deliveryDistance > firstIntervalBoundary) {
            daysToDeliver += 1;
        }
        return daysToDeliver;
    }


    public static void main(String[] args) {

        //part 1
        System.out.println("Задача 1");
        checkLeapYear(2021);

        //part 2
        System.out.println("Задача 2");
        int clientDeviceYear = 2020;
        int clientOS = 1;
        suggestAppVersion(clientDeviceYear, clientOS);

        //part 3
        System.out.println("Задача 3");
        int distance = 60;
        int daysToDeliver = checkDeliveryTimeInDays(distance);
        if (daysToDeliver < 0) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + daysToDeliver);
        }
    }
}