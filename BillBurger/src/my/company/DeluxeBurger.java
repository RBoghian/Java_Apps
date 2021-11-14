package my.company;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("deluxe", "sausage and bacon", 14.54, "white");
        super.addHamburgerAddition1("Chips",2.75);
        super.addHamburgerAddition2("Drink",1.81);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("nothing added");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("nothing added");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("nothing added");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("nothing added");
    }
}
