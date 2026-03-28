//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //part 1
        short userAgePart1 = 23; //изменяемая переменная
        byte ageOfMajority = 18;
        if (userAgePart1 >= ageOfMajority) {
            System.out.println("Если возраст человека равен " + userAgePart1 + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + userAgePart1 + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        //part 2
        byte airTemperatureDegrees = 2; //изменяемая переменная
        byte minTemperatureWithoutHat = 5;
        if (airTemperatureDegrees < minTemperatureWithoutHat) {
            System.out.println("На улице " + airTemperatureDegrees + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + airTemperatureDegrees + " градусов, можно идти без шапки");
        }

        //part 3
        short carSpeed = 100; //изменяемая переменная
        short speedLimit = 60;
        if (carSpeed > speedLimit) {
            System.out.println("Если скорость " + carSpeed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + carSpeed + ", то можно ездить спокойно");
        }

        //part 4
        byte minAgeForWork = 25;
        byte minAgeForUniversity = 18;
        byte minAgeForSchool = 7;
        byte minAgeForKindergarten = 2;
        short userAgePart4 = 17; //изменяемая переменная
        if (userAgePart4 >= minAgeForWork) {
            System.out.println("Если возраст человека равен " + userAgePart4 + ", то ему нужно ходить на работу");
        } else if (userAgePart4 >= minAgeForUniversity) {
            System.out.println("Если возраст человека равен " + userAgePart4 + ", то ему нужно ходить в университет");
        } else if (userAgePart4 >= minAgeForSchool) {
            System.out.println("Если возраст человека равен " + userAgePart4 + ", то ему нужно ходить в школу");
        } else if (userAgePart4 >= minAgeForKindergarten) {
            System.out.println("Если возраст человека равен " + userAgePart4 + ", то ему нужно ходить в детский сад");
        }

        //part 5
        byte noRestrictionAge = 15;
        byte minAgeForAttraction = 6;
        byte childAge = 6; //изменяемая переменная
        if (childAge >= noRestrictionAge) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        } else if (childAge >= minAgeForAttraction) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        }

        //part 6
        short passengerCarriageCapacity = 102;
        short passengerCarriageSeats = 60;
        short passengersInCarriage = 60; //изменяемая переменная
        if (passengersInCarriage >= passengerCarriageCapacity) {
            System.out.println("В вагоне нет места для новых пассажиров");
        } else if (passengersInCarriage >= passengerCarriageSeats) {
            System.out.println("В вагоне есть только стоячие места");
        } else {
            System.out.println("В вагоне есть сидячие места");
        }

        //part 7
        int one = 213; //изменяемая переменная
        int two = 25; //изменяемая переменная
        int three = 24; //изменяемая переменная
        if (one >= two && one >= three) {
            System.out.println(one + " - самое большое число");
        } else if (two >= three) {
            System.out.println(two + " - самое большое число");
        } else {
            System.out.println(three + " - самое большое число");
        }
    }
}