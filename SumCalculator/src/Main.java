public class Main {
    public static void main(String[] args) {
//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(5);
//        calculator.setSecondNumber(3);
//        System.out.println( calculator.getFirstNumber());
//        System.out.println(calculator.getSecondNumber());
//
//        System.out.println("adunare " + calculator.getAdditionResult());
//
//        System.out.println("inmultire " + calculator.getMultiplicationResult());
//
//        System.out.println("impartire  "+calculator.getDivisionResult());
//
//        System.out.println("diferenta " + calculator.getSubtractionResult());

        Person om = new Person();
        om.setFirstName("");
        om.setLastName("Razvan");
        om.setAge(30);
        System.out.println(om.isTeen());
        System.out.println(om.getFullName());

    }
}
