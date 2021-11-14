package my.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(-252));
    }

    public static int getEvenDigitSum(int number) {
        int digit;
        int sum = 0;
        if (number >= 0) {
            while (number > 0) {
                digit = number % 10;
                number /= 10;
                if (digit % 2 == 0) {
                    sum += digit;
                }

            }
            return sum;
        } else {
            return -1;
        }

    }
}
