//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //part 1 Поиск пятницы
        System.out.println("Задача 1");

        int daysInMonth = 31;
        int firstFriday = 5;
        int friday = firstFriday; //Для того чтобы firstFriday сохраняла свое значение от 1 до 7 в течении всей задачи
        for (int day = 1; day <= daysInMonth; day++) { //Это можно написать короче, но для задания нужно пройтись от 1 до 31
            if (day == friday) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
                friday += 7;//шаг в 7 дней
            }
        }

        //part 2
        //Часть с использованием do-while
        System.out.println("Задача 2 часть do-while");

        int distanceReached = 0;  //необходимо её использование по условию задачи
        int notificationDistance = 500;//каждые 500м
        int marathonDistance = 42195;
        int distanceLeft;
        do {
            distanceLeft = marathonDistance - distanceReached;
            System.out.println("Держитесь! Осталось " + distanceLeft + " метров");
            distanceReached += notificationDistance;
        } while (distanceReached < marathonDistance); //когда достигнет не надо увеличить. Меньше

        //Часть с использованием for
        System.out.println("Задача 2 часть for");


        for (distanceReached = 0; distanceReached < marathonDistance; distanceReached += notificationDistance) {
            distanceLeft = marathonDistance - distanceReached;
            System.out.println("Держитесь! Осталось " + distanceLeft + " метров");
        }

        //part 3

        //часть с использованием while
        System.out.println("Задача 3 часть while");

        int parkingDayNumber = 0; //более правильное значение, чтобы не писать -1 ко дню в выводе
        int budgetForParking = 700; //БЮДЖЕТ НЕОБХОДИМ ПО УСЛОВИЮ
        int moneySpent = 0;
        int parkingTariffForDay = 100;

        while (budgetForParking >= parkingTariffForDay) {
            if (parkingDayNumber % 5 == 0 && parkingDayNumber != 0) {
                parkingDayNumber++;
                continue;
            }
            moneySpent += parkingTariffForDay;
            budgetForParking -= parkingTariffForDay; //вычитание из суммы
            parkingDayNumber++;
        }
        if (parkingDayNumber > 0) {
            System.out.println("Не хватает бюджета на парковку");
        } else {
            System.out.println("Дней парковки: " + parkingDayNumber + " дней; стоимость: " + moneySpent + " рублей");
        }

        //Часть с использованием for
        System.out.println("Задача 3 часть for");

        parkingDayNumber = 0; //сброс с части while
        moneySpent = 0;//сброс с части while

        for (budgetForParking = 1000; budgetForParking >= parkingTariffForDay; parkingDayNumber++) {
            if (parkingDayNumber % 5 == 0 && parkingDayNumber != 0) {
                continue;
            }
            moneySpent += parkingTariffForDay;
            budgetForParking -= parkingTariffForDay; //вычитание из суммы
        }

        if (parkingDayNumber > 0) {
            System.out.println("Дней парковки: " + parkingDayNumber + " дней; стоимость: " + moneySpent + " рублей");
        } else {
            System.out.println("Не хватает бюджета на парковку");
        }


        //part 4
        System.out.println("Задача 4");

        int month = 0;
        int total = 0;

        while (true) {
            month++;
            total += 15_000; //Сумма вносится в начале месяца
            if (month % 6 == 0) {
                total = total + (total * 7) / 100; //ПО ПОСЛЕДОВАТЕЛЬНОСТИ (Если текущий месяц кратен 6, начисляйте 7% от накопленной суммы.) ЗДЕСЬ НЕ ИМЕЕТ ЗНАЧЕНИЯ СКОЛЬКО ЛЕЖАЛО 6 МЕСЯЦЕВ НАЗАД ДЕНЕГ НА СЧЕТЕ
            }
            System.out.println("Месяц: " + month + "; сумма: " + total + " рублей");//выводится в консоль в конце месяца
            if (total >= 12_000_000) {
                break;
            }
        }

        //part 5
        System.out.println("Задача 5");
        int charge = 20;//Текущий уровень заряда в процентах
        int minute = 0;//Счетчик времени зарядки
        int overheats = 0;//Количество перегревов

        while (charge < 100) {
            if (minute % 10 == 0 && minute != 0) { //Перегрев каждые 10 минут, первый перегрев на 10 минуте
                overheats++;
                if (overheats >= 3) {
                    System.out.println("Зарядка прекращена. Текущий заряд: " + charge + "%");//После трех таких перегревов зарядка прекращается и выводится сообщение «Зарядка прекращена. Текущий заряд: ...%».
                    break;
                }
                System.out.println("Перегрев! зарядка приостановлена на 2 минуты");
                minute += 2;
                continue;
            }
            minute++;
            charge += 2;
        }
        System.out.println("Время зарядки составило " + minute + " минут");//После завершения работы цикла выведите итоговое сообщение: «Время зарядки составило ... минут».

    }
}