import java.util.*;
import static java.lang.Math.*;
class level{
    void level() {
        System.out.println("Choose You Your Desired Level of Hardness of Game");
        System.out.println("1)EASY");
        System.out.println("2)MEDIUM");
        System.out.println("3)HARD");
        System.out.println("4)EXIT");
    }
}
public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        level Level = new level();
        System.out.println("*******************Wel-Come****************");
        while (true) {
            Level.level();
            int levelChoice = input.nextInt();
            switch (levelChoice) {
                case 1:
                    System.out.println("You Get Three Chances To Guess the Number ");
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Enter Your Choice");
                        int choice = input.nextInt();
                        if (choice == Math.floor(random() * 100)) {
                            System.out.println("Correct Answer");
                        } else {
                            System.out.println("Try Again");
                        }
                    }
                    System.out.println("The Number Was =" + Math.floor(random() * 100));
                    System.out.println("Better Luck Next Time");
                    break;
                case 2:
                    System.out.println("You Get Six Chances To Guess the Number ");
                    for (int i = 0; i < 6; i++) {
                        System.out.println("Enter Your Choice");
                        int choice = input.nextInt();
                        if (choice == Math.floor(random() * 100)) {
                            System.out.println("Correct Answer");
                        } else {
                            System.out.println("Try Again");
                        }

                    }
                    System.out.println("The Number Was =" + Math.floor(random() * 100));
                    System.out.println("Better Luck Next Time");
                    break;
                case 3:
                    System.out.println("You Get Ten Chances To Guess the Number ");
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Enter Your Choice");
                        int choice = input.nextInt();
                        if (choice == Math.floor(random() * 100)) {
                            System.out.println("Correct Answer");
                        } else {
                            System.out.println("Try Again");
                        }

                    }
                    System.out.println("The Number Was =" + Math.floor(random() * 100));
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


