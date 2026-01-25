import java.util.*;
import static java.lang.Math.*;
class level{
    void level() {
        System.out.println("Choose You Your Desired Level of Hardness of Game");
        System.out.println("1)EASY(10)");
        System.out.println("2)MEDIUM(6)");
        System.out.println("3)HARD(3)");
        System.out.println("4)EXIT");
    }
}
public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        level Level = new level();
        System.out.println("*******************Wel-Come****************");
        String description = """ 
                             The Game Rules Are Simple 
                             You Have To Guess Number Between 1 To 100
                                """;
        System.out.println(description);
        while (true) {
            Level.level();
            int levelChoice = input.nextInt();
            switch (levelChoice) {
                case 1:
                    System.out.println("You Get Ten Chances To Guess the Number ");
                    int randomEasy = Math.incrementExact((int) (random()*100));
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Enter Your Guess");
                        int choice = input.nextInt();
                        if (choice == randomEasy) {
                            System.out.println("Correct Answer");
                            System.out.println("Congratulations You Won");
                            System.exit(0);
                        } else if (choice< randomEasy) {
                            System.out.println("The Number Is Greater Than Your Guess");
                            System.out.println("Hint ="+(randomEasy-10)+"&"+(randomEasy+10)+"The number Is In Between ");
                        } else if (choice > randomEasy) {
                            System.out.println("The Number Is Lesser Than Your Guess");
                            System.out.println("Hint ="+(randomEasy-10)+"&"+(randomEasy+10)+"The number Is In Between ");
                        } else {
                            System.out.println("Try Again");
                        }

                    }
                    System.out.println("The Number Was =" + randomEasy);
                    System.out.println("Better Luck Next Time");
                    break;
                case 2:
                    System.out.println("You Get Six Chances To Guess the Number ");
                    int randomMedium = Math.incrementExact((int) (random()*100));
                    for (int i = 0; i < 6; i++) {
                        System.out.println("Enter Your Choice");
                        int choice = input.nextInt();
                        if (choice == randomMedium) {
                            System.out.println("Correct Answer");
                            System.out.println("Congratulations You Won");
                            System.exit(0);
                        } else if (choice < randomMedium) {
                            System.out.println("The Number Is Greater Than Your Guess ");
                            System.out.println("Hint ="+(randomMedium-10)+"&"+(randomMedium+10)+"The number Is In Between ");
                        }else if (choice > randomMedium){
                            System.out.println("The Number Is Lesser Than Your Guess");
                            System.out.println("Hint ="+(randomMedium-10)+"&"+(randomMedium+10)+"The number Is In Between ");
                        }else {
                            System.out.println("Try Again");
                        }

                    }
                    System.out.println("The Number Was =" + randomMedium);
                    System.out.println("Better Luck Next Time");
                    break;
                case 3:
                    System.out.println("You Get Three Chances To Guess the Number ");
                    int randomHard = Math.incrementExact((int) (random()*100));
                    for (int i = 0; i < 3; i++) {

                        System.out.println("Enter Your Choice");
                        int choice = input.nextInt();
                        if (choice == randomHard) {
                            System.out.println("Correct Answer");
                            System.out.println("Congratulations You Won");
                            System.exit(0);
                        } else if (choice < randomHard) {
                            System.out.println("The Number Is Greater Than Your Guess ");
                        }else if (choice > randomHard){
                            System.out.println("The Number Is Lesser Than Your Guess");
                        }else {
                            System.out.println("Try Again");
                        }

                    }
                    System.out.println("The Number Was =" + randomHard);
                    System.out.println("Better Luck Next Time");
                    break;
                case 4:{
                    System.out.println("Thank You For Using Number Guessing Game");
                    System.exit(0);
                }
            }
        }

    }
}


