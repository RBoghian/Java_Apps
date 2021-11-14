package my.company;

public class Main {

    public static void main(String[] args) {
boolean test = hasSharedDigit(12,23);
        System.out.println(test);
    }
    public static boolean hasSharedDigit(int num1, int num2) {
        if(num1<10 || num1>99 || num2<10 || num2>99){
            return false;
        }

        while (num1>0 && num2>0){
            if(num1%10 == num2%10 || num1%10 == num2/10){
                return true;
            }
            num1/=10;
        }
        return false;

    }
}
