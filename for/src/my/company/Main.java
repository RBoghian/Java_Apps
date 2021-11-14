package my.company;

public class Main {

    public static void main(String[] args) {
int counter =0;
        for (int i =8; i>=2;i--){
            System.out.println("10,000 at "+i+"% interest = " + String.format("%.2f", calculateInterest(10000.0,i)));

        }
        System.out.println("*********************");
        for (int i = 5; i<50;i++){
            if(isPrime(i)){
                System.out.println(i);
                counter++;
            }
            if(counter==3){
                break;
            }
        }
    }
    public static double calculateInterest (double amount, double interestRate){
        return (amount*(interestRate/100));
    }
    public static boolean isPrime (int n){
        if(n==1){
            return false;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            System.out.println("looping "+i);
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
