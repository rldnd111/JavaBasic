package rldnd.basic.day05;

public class Q54 {

	public static void main(String[] args) {
        char[] letter = { 'a', 'b', 'c' };
        for (int index = 0; index < letter.length; index++)
            System.out.print(letter[index] + ",");

        System.out.println("");

        double[] a = { 1.1, 2.2, 3.3 };
        System.out.println(a[0] + " " + a[1] + " " + a[2]);
        a[1] = a[2];
        System.out.println(a[0] + " " + a[1] + " " + a[2]);

        // int[] sampleArray = new int[10];
        // for (int index = 1; index <= sampleArray.length; index++)
        // sampleArray[index] = 3 * index;

        // 55번

        int[] num1 = new int[10];
        int[] num2 = new int[11];
        int[] num3 = { 1, 4, 9, 16, 9, 7, 4, 9, 11 };
        int[] num4 = { 0, 11, 2, 33, 4, 55, 6, 77, 8, 99 };

        for (int i = 0; i < 10; i++) {

            num1[i] = i + 1;
            System.out.print(" " + num1[i]);

        }

        System.out.println("");

        for (int i = 0; i < 11; i++) {
            num2[i] = i * 2;
            System.out.print(" " + num2[i]);
        }

        System.out.println("");

        for (int i = 0; i < 11; i++) {
            num2[i] = i * i;
            System.out.print(" " + num2[i]);
        }

        System.out.println("");

        for (int i = 0; i < 10; i++) {
            num1[i] = 0 * i;
            System.out.print(" " + num1[i]);
        }

        System.out.println("");

        for (int i = 0; i < 9; i++) {
            System.out.print(" " + num3[i]);
        }
        System.out.println("");

        for (int i = 9; i >= 0; i--) {
            System.out.print(" " + num4[i]);
        }


	}

}
