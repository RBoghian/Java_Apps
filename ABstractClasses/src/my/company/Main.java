package my.company;

public class Main {

    public static void main(String[] args) {
	//Dog dog = new Dog("Odin");
	//dog.eat();
	//dog.breathe();
	Parrot bird = new Parrot("Lulu");
	Penguin penguin = new Penguin("Happy");
	bird.breathe();
	bird.eat();
	bird.fly();
	penguin.fly();
    }
}
