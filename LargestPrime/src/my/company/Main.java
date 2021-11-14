package my.company;

public class Main {

    public static void main(String[] args) {
       int test = getLargestPrime(20);
        System.out.println(test);
    }
    public static int getLargestPrime(int number) {
        if(number <= 1){
            return -1;
        }
        for(int i = number/2; i >= 2; i--) {
            if(number % i == 0) {
                number = i;
            }
        }
        return number;
    }
}
