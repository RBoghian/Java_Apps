package my.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(1010,10));
    }

    public static int getGreatestCommonDivisor(int n1, int n2) {
        int min;
        int max;
        int div = 0;
        if ((n1 < 10) || (n2 < 10)) {
            return -1;
        } else {
            if (n1 < n2) {
                min = n1;
                max = n2;
            } else {
                min = n2;
                max = n1;
            }
            for (int i = 2; i <= min; i++) {
                if ((min%i==0)&&(max%i==0)){
                   div =i;
                }
            }
            return div;
        }
    }
}
