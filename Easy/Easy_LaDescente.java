import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Easy_LaDescente {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            int spaceX = in.nextInt();
            int spaceY = in.nextInt();
            
            int index = 0;
            int highest = 0;
            
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain, from 9 to 0. Mountain heights are provided from left to right.
         
                if (mountainH >= highest) {
                    highest = mountainH;
                    index = i;
                }
            } 
           
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            if (index == spaceX) {
                System.out.println("FIRE");
            } else {
                System.out.println("HOLD"); // either:  FIRE (ship is firing its phase cannons) or HOLD (ship is not firing).
            }
        }
    }
}
