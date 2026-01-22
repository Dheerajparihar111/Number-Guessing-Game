
import java.util.*;

import static java.lang.Math.random;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*******************Wel-Come****************");
        System.out.println("You Get Three Chances To Guess the Number ");
        System.out.println("Enter Your Choice");
        int choice = input.nextInt();
        int random[]={48,84,85,0,66};
        if (choice == random()){
            System.out.println("Correct Answer");
        }else {
            System.out.println("Better luck next time");
        }



    }
}


