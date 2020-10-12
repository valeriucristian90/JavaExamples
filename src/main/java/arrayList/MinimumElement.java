package arrayList;

import java.util.Scanner;

public class MinimumElement {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count:");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnArray = readIntegers(count);
        int returnedMin = findMin(returnArray);
        System.out.println("min = " + returnedMin);
    }

    private static int findMin(int[] returnArray) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < returnArray.length; i++) {
            int value = returnArray[i];
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }
}
