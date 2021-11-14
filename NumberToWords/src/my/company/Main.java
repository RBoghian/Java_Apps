package my.company;

public class Main {

    public static void main(String[] args) {
        numberToWords(0);
    }
public static int getDigitCount(int number){
        if(number<0){
            return -1;
        }else if(number==0){
    return 1;
    }
        int i=0;
        while(number>0){
           i++;
           number/=10;
        }
        return i;
}
public static int reverse(int number){
        int newNumber=0;
        int digit=0;
        while(number!=0){
           digit = number%10;
           newNumber+=digit;
           newNumber*=10;
           number/=10;
        }
        return newNumber/10;
}
public static void numberToWords(int number){
        int reversedNumber;
        int digit;
   if(number<0){
       System.out.println("Invalid Value");
   }
   reversedNumber=reverse(number);
  for(int i=1; i<=getDigitCount(number);i++){
      digit=reversedNumber%10;
      reversedNumber/=10;
      switch(digit){
          case 1:
              System.out.println("One");
              break;
          case 2:
              System.out.println("Two");
              break;
          case 3:
              System.out.println("Three");
              break;
          case 4:
              System.out.println("Four");
              break;
          case 5:
              System.out.println("Five");
              break;
          case 6:
              System.out.println("Six");
              break;
          case 7:
              System.out.println("Seven");
              break;
          case 8:
              System.out.println("Eight");
              break;
          case 9:
              System.out.println("Nine");
              break;
          default:
              System.out.println("Zero");
              break;
      }

  }

}
}
