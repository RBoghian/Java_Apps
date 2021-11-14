public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int lastDigit = 0;
        int reversed = 0;
        int originalNumber = number;
        while (number !=0) {
            lastDigit = number % 10;
            reversed *= 10;
            reversed += lastDigit;

            number /= 10;
        }
        if (reversed == originalNumber) {
            return true;
        } else {
            return false;
        }
    }
}
