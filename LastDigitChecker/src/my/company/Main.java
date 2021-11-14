package my.company;

public class Main {

    public static void main(String[] args) {
boolean test = hasSameLastDigit(9,99,999);
        System.out.println(test);
    }

    public static boolean isValid (int number){
        if(number>=10&&number<=1000){
            return true;
        }
        return false;
    }

    public static boolean hasSameLastDigit (int no1, int no2, int no3){
        if(isValid(no1)&&isValid(no2)&&isValid(no3)){
           int dig1 = no1%10;
           int dig2 = no2%10;
           int dig3 = no3%10;
           if((dig1==dig2)||(dig2==dig3)||(dig1==dig3)){
               return true;
            }else{
               return false;
            }
        }
        return false;
    }
}
