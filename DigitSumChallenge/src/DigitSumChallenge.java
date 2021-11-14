public class DigitSumChallenge {
    public static int sumDigits (int number){
        int sum = 0;
        int digit =0;
        if(number>=10){
            while(number>0){
               digit = number%10;
               sum += digit;
               number /=10;
            }
            return sum;
        }else{
            return -1;
        }
    }
}
