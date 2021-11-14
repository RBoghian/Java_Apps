package my.company;

public class Main {

    public static void main(String[] args) {
	HealthyBurger healthyBurger = new HealthyBurger("Bacon",5.67);
	healthyBurger.addHamburgerAddition1("Egg", 5.43);
	healthyBurger.addHealthAddition1("Lentils",3.41);

        System.out.println(healthyBurger.itemizeHamburger());


    }
}
