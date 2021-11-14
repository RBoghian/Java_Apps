package my.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        double average = 0;
        long calculatedAvg=0;
        int sum = 0;
        int number;
        double counter = 0;
        while (true) {
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                number = scanner.nextInt();
                counter++;
                sum += number;
                average = (sum / counter);
                calculatedAvg = Math.round(average);

            } else {
                break;
            }


            scanner.nextLine();
        }

        System.out.println("SUM = "+sum+" AVG = "+calculatedAvg);

        scanner.close();
    }
}
