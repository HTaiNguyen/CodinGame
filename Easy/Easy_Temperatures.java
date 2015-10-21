import java.util.*;
import java.io.*;
import java.math.*;

public class Easy_Temperatures {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        if (n == 0) {
            System.out.println(n);
            return;
        }

        in.nextLine();
        String temps = in.nextLine(); // the n temperatures expressed as integers ranging from -273 to 5526

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        //System.out.println("result");

        int[] temperatures = new int[n];
        for (int i = 0; i < temps.split(" ").length; i++) {
            temperatures[i] = Integer.parseInt(temps.split(" ")[i]);
        }

        int zero = 0;
        int closestSup = 5526;
        int closestInf = temperatures[0];

        for (int i = 1; i < temperatures.length; i++) {
            int currentTemperature = temperatures[i];
            if (currentTemperature >= zero) {
                if (currentTemperature <= closestSup) {
                    closestSup = currentTemperature;
                }
            } else {
                if (currentTemperature >= closestInf) {
                    closestInf = currentTemperature;
                }
            }
        }

        int closest = (closestSup - zero) > ((closestInf < 0 ? closestInf * -1 : closestInf)) ? closestInf : closestSup;
        if (closestSup + closestInf == zero) {
            closest = closestSup;
        }

        System.out.println(closest);
    }
}
/*
5
7 5 9 1 4
*/
