
import java.util.*;

import static java.lang.Math.*;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*******************Wel-Come****************");
        System.out.println("You Get Three Chances To Guess the Number ");
        for (int i = 0;i<3;i++){
            System.out.println("Enter Your Choice");
            int choice = input.nextInt();
            if (choice == Math.floor(random()*100)) {
                System.out.println("Correct Answer");
            } else {
                System.out.println("try again");
            }


        }
        System.out.println("the number was ="+Math.floor(random()*100));
        System.out.println("Better luck next time");
    }
}


