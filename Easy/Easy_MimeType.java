import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Easy_MimeType {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.

        HashMap<String, String> hmap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            String MT = in.next(); // MIME type.

            hmap.put(EXT.toLowerCase(), MT);
        }

        in.nextLine();

        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine(); // One file name per line.

            String currentFile = null;

            String[] parts = FNAME.split("\\.");

            if (parts.length > 0) {
                if (hmap.get(parts[(parts.length-1)].toLowerCase()) != null && parts.length > 1 && FNAME.charAt(FNAME.length()-1) != '.') {
                    System.out.println(hmap.get(parts[(parts.length - 1)].toLowerCase()));
                } else {
                    System.out.println("UNKNOWN");
                }
            } else {
                System.out.println("UNKNOWN");
            }
        }

        System.err.println(hmap);
    }
}