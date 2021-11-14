package my.company;

public class Main {

    public static void main(String[] args) {
printSquareStar(10);
    }
    public static void printSquareStar(int number) {
        if (number < 5)
            System.out.println("Invalid Value");

        else {
            for (int rowNum = 1; rowNum <= number; rowNum++) {
                for (int colNum = 1; colNum <= number; colNum++) {
                    if ((rowNum == 1 || rowNum == number || colNum == 1 || colNum == number) || (rowNum == colNum) || (colNum == (number - rowNum + 1)))
                        System.out.print("*");
                    else
                        System.out.print(" ");

                    if (colNum == number)
                        System.out.println();
                }
            }
        }
    }
}
