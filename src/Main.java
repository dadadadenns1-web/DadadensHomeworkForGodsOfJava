//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // part 1
        float flota = 33.1234567f;
        double doblota = 10.123456789101214156;
        long longota = 1234567891012141619L;
        short shrota = 15000;
        byte bytota = 100;
        int intota = 1000000000;
        System.out.println("Значение переменной flota с типом <<float>> = " + flota + ", значение переменной longota с типом <<long>> = " + longota + ", значение переменной shrota с типом <<short>> = " + shrota + ", значение переменной bytota с типом <<byte>> = " + bytota + ", значение переменной intota с типом <<int>> = " + intota + ", значение переменной doblota с типом <<double>> = " + doblota);

        //part 2
        flota = 27.12f;
        longota = 987678965549L;
        float flota2 = 2.786f;
        shrota = 569;
        short shrota2 = -159;
        short shrota3 = 27897;
        bytota = 67;
        System.out.println("flota <<float>> = " + flota + ", longota <<long>> = " + longota + ", flota2 <<float>> = " + flota2 + ", shrota <<short>> = " + shrota + ", shrota2 <<short>> = " + shrota2 + ", shrota3 <<short>> = " + shrota3 + ", bytota <<byte>> = " + bytota);

        //part 3
        byte ludmillaStudents = 23;
        byte annaStudents = 27;
        byte ekaterinaStudents = 30;
        short sheetsOfPaper = 480;
        //Конец условных данных
        System.out.println("Учеников у Людмилы " + ludmillaStudents + ", Анны " + annaStudents + ", Екатерины " + ekaterinaStudents + "; а также было закуплено " + sheetsOfPaper + " листов бумаги");
        short sumStudents = (short) (ludmillaStudents + ekaterinaStudents + annaStudents);
        byte sheetsPerPerson = (byte) (sheetsOfPaper / sumStudents);
        System.out.println("Всего учеников " + sumStudents + " и на каждого будет по " + sheetsPerPerson + " листа бумаги");

        //part 4
        byte bottlesPerTwoMinutes = 16;//условие кол-во бутылок за 2 минуты
        byte bottlesPerMinute = 16 / 2;
        System.out.println("Производительность машины для бутылок - " + bottlesPerTwoMinutes + " бутылок за две минуты, или " + bottlesPerMinute + " за минуту");
        int time = 20;//условие за 20 минут
        int bottlesProduced = bottlesPerMinute * time;
        System.out.println("За " + time + " минут машина произвела " + bottlesProduced + " штук бутылок");
        time = 24 * 60;//условие за день
        bottlesProduced = bottlesPerMinute * time;
        System.out.println("За " + time + " минут или день машина произвела " + bottlesProduced + " штук бутылок");
        time = time * 3;//условие за 3 дня
        bottlesProduced = bottlesPerMinute * time;
        System.out.println("За " + time + " минут или 3 дня машина произвела " + bottlesProduced + " штук бутылок");
        time = time * 10;//условие за месяц
        bottlesProduced = bottlesPerMinute * time;
        System.out.println("За " + time + " минут или 30 дней, или месяц машина произвела " + bottlesProduced + " штук бутылок");

        //part 5
        byte cansOfPaintRequired = 120;
        byte whitePaintPerClass = 2;
        byte brownPaintPerClass = 4;
        //Конец условных данных
        System.out.println("Для покраски 1-го класса нужно " + whitePaintPerClass + " банок белой краски и " + brownPaintPerClass + " банок коричневой, а всего банок нужно " + cansOfPaintRequired);
        float ratioBrownToWhitePaint = ((float) brownPaintPerClass / whitePaintPerClass);
        byte whitePaintRequired = (byte) Math.ceil(cansOfPaintRequired / (1 + ratioBrownToWhitePaint));
        byte brownPaintRequired = (byte) Math.ceil(whitePaintRequired * ratioBrownToWhitePaint);
        byte numberOfClasses = (byte) (cansOfPaintRequired / (whitePaintPerClass + brownPaintPerClass));
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + whitePaintRequired + " банок белой краски и " + brownPaintRequired + " банок коричневой краски");

        //part 6
        byte bananasAmount = 5;
        byte gramsPerBanana = 80;
        short milkMl = 200;
        float milkInGramsPer100Ml = 105f;
        byte iceCreamBarAmount = 2;
        byte gramsPerIceCreamBar = 100;
        byte rawEggsAmount = 4;
        byte gramsPerEgg = 70;
        //Конец условных данных
        System.out.println("Кол-во и масса ингредиентов: " + bananasAmount + " бананов по " + gramsPerBanana + "г/шт; " + milkMl + "мл молока по " + milkInGramsPer100Ml + "г/100 мл; " + iceCreamBarAmount + " брикетов мороженного по " + gramsPerIceCreamBar + " г/шт; " + rawEggsAmount + " сырых яиц по " + gramsPerEgg + " г/шт.");
        float totalWeightInGrams = (gramsPerBanana * bananasAmount + milkMl * milkInGramsPer100Ml / 100 + gramsPerIceCreamBar * iceCreamBarAmount + rawEggsAmount * gramsPerEgg);
        float totalWeightInKg = (totalWeightInGrams / 1000);
        System.out.println("Вес коктейля в граммах " + totalWeightInGrams + ", вес в кг " + totalWeightInKg);

        //part 7
        byte weightToLoseKg = 7;
        short minGramsPerDayToLose = 250;
        short maxGramsPerDayToLose = 500;
        //Конец условных данных
        System.out.println("Нужно сбросить - " + weightToLoseKg + " кг, Тренел дал рацион который в лучше случае даст худеть на " + maxGramsPerDayToLose + " грамм за день, в худшем " + minGramsPerDayToLose + " грамм");
        short weightToLoseGrams = (short) (weightToLoseKg * 1000);
        byte maxDaysToLoseWeight = (byte) (weightToLoseGrams / minGramsPerDayToLose);
        byte minDaysToLoseWeight = (byte) (weightToLoseGrams / maxGramsPerDayToLose);
        float averageDaysToLoseWeight = ((float) (maxDaysToLoseWeight + minDaysToLoseWeight) / 2);
        System.out.println("Максимально быстро можно похудеть спортсмену за " + minDaysToLoseWeight + " дней, максимально долго " + maxDaysToLoseWeight + " дней, в среднем " + averageDaysToLoseWeight + " дней");

        //part 8
        int mashaPerMonth = 67760;//Текущие зарплаты masha, denis, kristina в месяц
        int denisPerMonth = 83690;
        int kristinaPerMonth = 76230;
        float salaryIncrease = 1.1f;
        //Конец условных данных
        int mashaPerYearOld = mashaPerMonth * 12;
        int denisPerYearOld = denisPerMonth * 12;
        int kristinaPerYearOld = kristinaPerMonth * 12;
        System.out.println("Маша в месяц получает " + mashaPerMonth + " руб, Денис - " + denisPerMonth + ", Кристина - " + kristinaPerMonth);
        mashaPerMonth = (int) (mashaPerMonth * salaryIncrease);// Зарплаты в месяц после повышения
        denisPerMonth = (int) (denisPerMonth * salaryIncrease);
        kristinaPerMonth = (int) (kristinaPerMonth * salaryIncrease);
        System.out.println("Их зарплата в месяц увеличится в " + salaryIncrease + ". Итого Маша будет получать в месяц " + mashaPerMonth + " руб, Денис - " + denisPerMonth + ", Кристина - " + kristinaPerMonth);
        int salaryDifferencePerYearMasha = mashaPerMonth * 12 - mashaPerYearOld;//Разница годовых зарплат, новой минус старой
        int salaryDifferencePerYearDenis = denisPerMonth * 12 - denisPerYearOld;
        int salaryDifferencePerYearKristina = kristinaPerMonth * 12 - kristinaPerYearOld;
        System.out.println("Годовой доход вырос у Маши - " + salaryDifferencePerYearMasha + ", у Дениса - " + salaryDifferencePerYearDenis + ", Кристины - " + salaryDifferencePerYearKristina);
    }
}