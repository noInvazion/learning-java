package januaryclass;

import java.util.Random;

public class DiceGame {
    public static int rollDice(){
        Random rand = new Random();
        return rand.nextInt(1, 7);
    }

    public static void main(String[] args) {
        int firstDie = rollDice();
        int secondDie = rollDice();
        int point;
        int sum = firstDie + secondDie;

        System.out.printf("You rolled %d + %d = %d\n", firstDie, secondDie, sum);

        if (sum == 2 || sum == 3 || sum == 12){
            System.out.println("You lose the game.");
        } else if (sum == 7 || sum == 11){
            System.out.println("You win the game.");
        } else{
            point = sum;
            System.out.println("Point -> " + sum);
            while(sum != 7){
                firstDie = rollDice();
                secondDie = rollDice();
                sum = firstDie + secondDie;

                System.out.printf("You rolled %d + %d = %d\n", firstDie, secondDie, sum);

                if (sum == point){
                    System.out.println("You win!");
                    break;
                }
            }
            if (sum == 7){
                System.out.println("You lose!");
            }
        }
    }
}
