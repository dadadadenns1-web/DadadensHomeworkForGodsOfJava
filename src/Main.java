//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //part 1 С помощью цикла for выведите в консоль все целые числа от 1 до 10.
        System.out.println("Задача 1");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //part 2 С помощью цикла for выведите в консоль все целые числа от 10 до 1.
        System.out.println("Задача 2");

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //part 3 Выведите в консоль все четные числа от 0 до 17.
        System.out.println("Задача 3");

        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }

        //part 4 Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.
        System.out.println("Задача 4");

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        //part 5 Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096.
        // В консоль результат должен выводиться в формате: «… год является високосным».
        System.out.println("Задача 5");

        for (int year = 1904; year <= 2096; year += 4) {
            System.out.println(year + " год является високосным");
        }

        //part 6 Напишите программу, которая выводит в консоль последовательность чисел: 7 14 21 28 35 42 49 56 63 70 77 84 91 98
        System.out.println("Задача 6");

        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }

        //part 7 Напишите программу, которая выводит в консоль последовательность чисел: 1 2 4 8 16 32 64 128 256 512
        System.out.println("Задача 7");

        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }

        //part 8 Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете откладывать по 29 000 рублей «в банку».
        // Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».
        System.out.println("Задача 8");

        int saving = 0;
        for (int month = 1; month <= 12; month++) {
            saving += 29000;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + saving + " рублей");
        }

        //part 9 Перепишите решение задачи выше при условии, что деньги вы откладывать будете не «в банку», а в банк под проценты — 12% годовых.
        //Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».
        System.out.println("Задача 9");

        // ЛОГИКА РАБОТАЕТ ТОЛЬКО ЕСЛИ СУММА ВНОСИТСЯ В НАЧАЛЕ МЕСЯЦА, А СУММА НАКОПЛЕНИЙ ГОВОРИТСЯ В КОНЦЕ МЕСЯЦА
        float savingFloat = 0f;
        for (int month = 1; month <= 12; month++) {
            savingFloat += 29000;
            savingFloat *= 1.01f;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savingFloat + " рублей");
        }

        //part 10 Напишите программу, которая выводит в консоль таблицу умножения на 2
        System.out.println("Задача 10");

        int result;
        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            result = 2 * multiplier;
            System.out.println(2 + "*" + multiplier + "=" + result);
        }
    }
}