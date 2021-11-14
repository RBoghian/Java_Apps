package my.company;

public class Main {

    public static void main(String[] args) {
boolean test= canPack(1,0,5);
        System.out.println(test);
    }
    public static boolean canPack (int bigCount, int smallCount, int goal){
        if((bigCount<0)||(smallCount<0)||(goal<0)||(bigCount*5+smallCount<goal)){
            return false;
        }
return (goal%5<=smallCount);
    }
}
