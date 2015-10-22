import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Easy_ChuckNorris {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String MESSAGE = in.nextLine();

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

//        System.out.println("answer");

        String binaryMessage = "";
        StringBuilder sb = new StringBuilder();

        for (char c: MESSAGE.toCharArray()) {
            String tmp = (Integer.toBinaryString((int) c));

            while (tmp.length() < 7) {
                tmp = '0' + tmp;
            }

            binaryMessage += tmp;
        }

        char currentChar;
        int index = 0;
        while (index < binaryMessage.length()) {
            if (binaryMessage.charAt(index) == '1') {
                sb.append("0 ");
                currentChar = '1';
            } else {
                sb.append("00 ");
                currentChar = '0';
            }

            while (currentChar == binaryMessage.charAt(index)) {
                sb.append("0");
                index++;

                if (binaryMessage.length() == index) {
                    break;
                }
            }
            if (index < binaryMessage.length()) {
                sb.append(" ");
            }
        }

        System.out.print(sb.toString());

        in.close();
    }
}