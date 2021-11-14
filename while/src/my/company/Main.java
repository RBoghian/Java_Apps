package my.company;

public class Main {

    public static void main(String[] args) {
int number = 4;
int finishNumber=20;
int counter =0;
while(number<=finishNumber){
    number++;
    if(!isEvenNumber(number)){
        continue;
    }
    System.out.println("even number " + number);
    counter++;
    if(counter==5){
        break;
    }

}
        System.out.println("counter is " + counter);
    }
    public static boolean isEvenNumber (int number){
        if(number%2==0){
            return true;
        }
        return false;
    }

}
