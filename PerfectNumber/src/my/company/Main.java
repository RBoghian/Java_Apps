package my.company;

public class Main {

    public static void main(String[] args) {
boolean test = isPerfectNumber(-1);
        System.out.println(test);
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        if (number < 1) {
            return false;
        }
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if(sum==number){
            return true;
        }
        return false;
    }
}
