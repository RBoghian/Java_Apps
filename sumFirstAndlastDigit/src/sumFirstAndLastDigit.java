public class sumFirstAndLastDigit {

    public static int sumFirstAndLastDigit(int number) {

        int lastDigit = 0;
        int sum;
        if (number >= 0) {
            lastDigit = number % 10;
            while (number >= 10) {
                number /= 10;
            }

            sum = number + lastDigit;
            return sum;
        } else {
            return -1;

        }
    }
}
