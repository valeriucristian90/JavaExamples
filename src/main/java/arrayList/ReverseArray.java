package arrayList;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));

        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    private static void reverse(int[] arrayReverse) {

        int maxIndex = arrayReverse.length - 1;
        int halfLenght = arrayReverse.length / 2;
        for (int i = 0; i < halfLenght; i++) {
            int x = arrayReverse[i];
            arrayReverse[i] = arrayReverse[maxIndex - i];
            arrayReverse[maxIndex - i] = x;
        }
    }
}
