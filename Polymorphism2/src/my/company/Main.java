package my.company;
class Car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels =4;
        this.engine=true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Car-> startEngine()";
    }
    public String accelerate(){
        return "Car-> accelerate()";
    }
    public String brake(){
        return "Car-> brake()";
    }
}
class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }
}
class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Holden -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + "vrumv rum";
    }
}

 class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford -> brake()";
    }
}

public class Main {

    public static void main(String[] args) {
Car newCar = new Car(8,"basecar");
        System.out.println(newCar.startEngine());
        Mitsubishi mitsubishi = new Mitsubishi(8,"Lancer");
        System.out.println(mitsubishi.brake());
        Ford ford = new Ford(8,"Mustang");
        System.out.println(ford.brake());
        Holden Holden = new Holden(8,"Xtype");
        System.out.println(Holden.brake());
    }


}
