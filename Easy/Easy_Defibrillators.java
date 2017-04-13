import java.util.*;
import java.io.*;
import java.math.*;

public class Easy_Defibrillators {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String LON = in.next();
        String LAT = in.next();
        int N = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }

        double nearest = 6371;
        String nearestDefibName = "";

        for (int i = 0; i < N; i++) {
            String DEFIB = in.nextLine();
            String[] defib = DEFIB.split(";");

            int id = Integer.parseInt(defib[0]);
            String name =  defib[1];
            String address = defib[2];
            String phoneNumber = defib[3];
            String longitude = defib[4];
            String latitude = defib[5];

            double x = (Double.parseDouble(longitude.replace(",",".")) - Double.parseDouble(LON.replace(",",".")))
                    *  Math.cos((Double.parseDouble(latitude.replace(",",".")) + Double.parseDouble(LAT.replace(",","."))/2));

            double y = (Double.parseDouble(latitude.replace(",",".")) - Double.parseDouble(LAT.replace(",",".")));

            double d = Math.sqrt((x*x) +  (y*y)) * 6371;

            if (d < nearest) {
                nearest = d;
                nearestDefibName = name;
            }
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(nearestDefibName);
    }
}
