package my.company;

public class Main {

    public static void main(String[] args) {


        calculateScore(true, 800, 5, 100);
        int highscore = calculateScore(true, 10000, 8, 200);
        //System.out.println("Highscore is " + highscore);
        int highScorePosition = calculatedHighScorePosition(1500);
        displayHihScorePosition("Razvan", highScorePosition);
        highScorePosition = calculatedHighScorePosition(900);
        displayHihScorePosition("Andrei", highScorePosition);
        highScorePosition = calculatedHighScorePosition(400);
        displayHihScorePosition("Alex", highScorePosition);
        highScorePosition = calculatedHighScorePosition(50);
        displayHihScorePosition("Tavi", highScorePosition);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            // System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;

    }

    public static void displayHihScorePosition(String name, int tablePosition) {
        System.out.println(name + " managed to get into position " + tablePosition + " on the high score table");
    }

    public static int calculatedHighScorePosition(int score) {
//        if (score >=1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        }
//            return 4;
int position = 4;
if ( score >=1000){
    position =1;}
    else if(score >=500){
        position =2;
    }else if(score>=100){
        position =3;
    }
return position;
    }
}
