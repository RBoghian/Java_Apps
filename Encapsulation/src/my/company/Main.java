package my.company;

public class Main {

    public static void main(String[] args) {

       /* Player player = new Player();
        player.name = "Tim";
        player.health = 20;
        player.weapon = "sword";

        int damage =10;
        player.loseHealth(damage);
        System.out.println( player.healthRemaining());

        damage =11;
        player.loseHealth(damage);
        System.out.println( player.healthRemaining());*/
        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Tim",200,"Sword");
        System.out.println(enhancedPlayer.getHealth());
    }
}
