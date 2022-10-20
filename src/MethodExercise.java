public class MethodExercise {
    public static void main(String[] args) {
        int playerPosition = calculateHighScorePosition(1500);
        displayHighScorePosition("bob", playerPosition);

         playerPosition = calculateHighScorePosition(900);
        displayHighScorePosition("rob", playerPosition);

         playerPosition = calculateHighScorePosition(400);
        displayHighScorePosition("tim", playerPosition);

         playerPosition = calculateHighScorePosition(50);
        displayHighScorePosition("tam", playerPosition);

    }

    //create a method called displayHighScorePosition
    public static void displayHighScorePosition(String playerName, Integer playerPosition){
        System.out.println(playerName + " Managed to get into position "+ playerPosition + " on the high score table.");
    }

    //method to calculate high score position
    public static int calculateHighScorePosition(int playerScore){
        int position = 4;
        if (playerScore >= 1000){
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;

    }
}
