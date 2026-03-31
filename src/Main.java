import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //part 1
        byte[] massiveByte = new byte[]{1, 2, 3};

        float[] massiveFloat = {1.57f, 7.654f, 9.986f};

        short[] massiveShort = new short[]{111, 222, 333, 444, 555, 666, 777, 888, 999};

        //part 2
        for (int i = 0; i < massiveByte.length - 1; i++) {//i начинается с первого элемента, если длина больше 2-ух
            System.out.print(massiveByte[i] + ", ");
        }
        System.out.println(massiveByte[massiveByte.length - 1]); //Последний элемент массива

        for (int i = 0; i < massiveFloat.length - 1; i++) {
            System.out.print(massiveFloat[i] + ", ");
        }
        System.out.println(massiveFloat[massiveFloat.length - 1]);

        for (int i = 0; i < massiveShort.length - 1; i++) {
            System.out.print(massiveShort[i] + ", ");
        }
        System.out.println(massiveShort[massiveShort.length - 1]);

        //part 3
        for (int i = massiveByte.length - 1; i > 0; i--) {//i начинается с последнего элемента, если длина больше 2-ух
            System.out.print(massiveByte[i] + ", ");
        }
        System.out.println(massiveByte[0]);//первый элемент массива

        for (int i = massiveFloat.length - 1; i > 0; i--) {
            System.out.print(massiveFloat[i] + ", ");
        }
        System.out.println(massiveFloat[0]);

        for (int i = massiveShort.length - 1; i > 0; i--) {
            System.out.print(massiveShort[i] + ", ");
        }
        System.out.println(massiveShort[0]);

        //part 4 Только первый массив
        for (int i = 0; i < massiveByte.length; i++) {
            if (massiveByte[i] % 2 != 0) {
                massiveByte[i]++;
            }
        }
        //Проверка
        System.out.println(Arrays.toString(massiveByte));

    }
}