package com.company;

public class Main {

    public static void main(String[] args) {
//command option l to align the code

        calculateScore(true, 800,5, 100);
        boolean gameOver = true;
        int score= 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver , score,levelCompleted,bonus);
        System.out.println("your final score was " + highScore);


        gameOver = true;
        score = 10000;
        levelCompleted =8;
        bonus =200;

        //challenge

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("player1", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("player2", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("player3", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("player4", position);



    }



    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + "managed to get into position" +
                position + "on the highScore table");
    }

    public static int calculateHighScorePosition(int score){
//        if (score >= 1000){
//            return 1;
//        }
//        else if (score >= 500){
//            return 2;
//        }
//        else if (score >= 100){
//            return 3;
//        }
//            return 4;
        int position = 4;

        if (score>=1000){
            position= 1;
        } else if (score>=500){
            position=2;
        }else if (score>=100){
            position=3;
        }
        return position;
    }

    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus){
        if (gameOver){
            int finalScore = score + (levelCompleted*bonus);
            finalScore+=2000;
            return finalScore;
        }
        return -1;

    }

}
