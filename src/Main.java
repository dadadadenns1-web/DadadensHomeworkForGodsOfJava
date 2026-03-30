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
        for (int i = 0; ; i++) {
            if (i == massiveByte.length - 1) {
                System.out.println(massiveByte[i]);
                break;
            } else {
                System.out.print(massiveByte[i] + ", ");
            }
        }

        for (int i = 0; ; i++) {
            if (i == massiveFloat.length - 1) {
                System.out.println(massiveFloat[i]);
                break;
            } else {
                System.out.print(massiveFloat[i] + ", ");
            }
        }

        for (int i = 0; ; i++) {
            if (i == massiveShort.length - 1) {
                System.out.println(massiveShort[i]);
                break;
            } else {
                System.out.print(massiveShort[i] + ", ");
            }
        }
        //part 3
        for (int i = massiveByte.length - 1; ; i--) {
            if (i == 0) {
                System.out.println(massiveByte[i]);
                break;
            } else {
                System.out.print(massiveByte[i] + ", ");
            }
        }
        for (int i = massiveFloat.length - 1; ; i--) {
            if (i == 0) {
                System.out.println(massiveFloat[i]);
                break;
            } else {
                System.out.print(massiveFloat[i] + ", ");
            }
        }
        for (int i = massiveShort.length - 1; ; i--) {
            if (i == 0) {
                System.out.println(massiveShort[i]);
                break;
            } else {
                System.out.print(massiveShort[i] + ", ");
            }
        }
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