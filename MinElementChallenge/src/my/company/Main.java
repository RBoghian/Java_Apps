package my.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count : ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        int returnedMin= findMin(returnedArray);
        System.out.println("min = " + returnedMin);
    }

    private static int[] readIntegers(int count) {

        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }

        //System.out.println("Element at " + i + " has a value of " + array[i]);
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;


        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}

