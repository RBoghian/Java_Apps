public class Main {
    public static void main(String[] args) {
        double test = AreaCalculator.area(5.0);
        System.out.println(test);
        test = AreaCalculator.area(-1);
        System.out.println(test);
        test = AreaCalculator.area(5.0,4.0);
        System.out.println(test);
        test = AreaCalculator.area(-1.0,4.0);
        System.out.println(test);

    }
}
