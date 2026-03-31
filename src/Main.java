import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //part 1
        System.out.println("Задача 1");
        int[] inputArray1 = {15555, 22222, 33333, 25111, 12121};
        int maxPay = inputArray1[0];
        int sum = 0;
        int minPay = inputArray1[0];
        for (int input : inputArray1) {
            sum += input;
            if (maxPay < input) {
                maxPay = input;
            }
            if (minPay > input) {
                minPay = input;
            }
        }
        float average = (float) sum / inputArray1.length;
        float[] outputArray1 = {sum, maxPay, minPay, average};
        System.out.println(Arrays.toString(inputArray1) + " - input array; выплаты авторам");
        System.out.println(Arrays.toString(outputArray1) + " - output array. Сумма, макс, мин, средне-арифметическая.");

        //part 2
        System.out.println("Задача 2");
        int[] inputArray2 = {23232, 35254, 50000, 70000, 99999};
        float[] outputArray2 = new float[inputArray2.length];
        int indexPart2 = 0;
        for (int salary : inputArray2) {
            outputArray2[indexPart2++] = salary * 0.13f;//Нужно записать налог 13%
        }
        System.out.println(Arrays.toString(inputArray2) + " - input array; значение зарплаты");
        System.out.println(Arrays.toString(outputArray2) + " - output array; значение налога 13%");

        //part 3
        System.out.println("Задача 3");
        int[] inputArray3 = {1500, 2322, 7501, 2312, 12312};//Бонусы
        boolean[] outputArray3 = new boolean[inputArray3.length];
        int bonusSeparator = 5000;
        int indexPart3 = 0;
        for (int bonus : inputArray3) {
            outputArray3[indexPart3++] = bonus > bonusSeparator;
        }
        System.out.println(Arrays.toString(inputArray3) + " - input array; бонусы");
        System.out.println(Arrays.toString(outputArray3) + " - output array; true если больше " + bonusSeparator);

        //part 4
        System.out.println("Задача 4");
        int[] inputArray4 = {12312, 2562, -1231, 5233, 6233};//Остаток на кредитном счете
        boolean[] outputArray4 = {true};
        for (int balance : inputArray4) {
            if (balance < 0) {
                outputArray4[0] = false;
                break;
            }
        }
        System.out.println(Arrays.toString(inputArray4) + " - input array; все остатки в начале месяцев");
        System.out.println(Arrays.toString(outputArray4) + " - output array; false - есть отрицательный остаток, true - все положительные");

        //part 5
        System.out.println("Задача 5");
        int[] inputArray5 = {1234, 12512, -3231, -10000, 1000};//чистая прибыль
        int[] outputArray5 = {0};//Количество месяцев рентабельности

        for (int profit : inputArray5) {
            if (profit > 0) {
                outputArray5[0]++;
            }

        }
        System.out.println(Arrays.toString(inputArray5) + " - input array; чистая прибыль за месяцы");
        System.out.println(Arrays.toString(outputArray5) + " - output array; количество месяцев рентабельности");
    }
}