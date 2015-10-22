import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
public class Easy_AsciiArt {

    static String DICO = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        in.nextLine();
        int H = in.nextInt();
        in.nextLine();
        String T = in.nextLine();
        T = T.toUpperCase();

        ArrayList<String> ascii = new ArrayList<>();

        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();
            ascii.add(ROW);
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

//        System.out.println("answer");

        ArrayList<Integer> indexes = new ArrayList<>();
        for (char c: T.toCharArray()) {
            if (c < 'A' || c > 'Z') {
                indexes.add(26);
            } else {
                for (char letter: DICO.toCharArray()) {
                    if (c == letter) {
                        indexes.add(DICO.indexOf(letter));
                    }
                }
            }
        }

        for (int k = 0; k < H; k++) {
            for (int l = 0; l < indexes.size(); l++) {
                System.out.print(ascii.get(k).substring(indexes.get(l) * L, indexes.get(l) * L + L));
            }
            System.out.println();
        }
        in.close();
    }
}
