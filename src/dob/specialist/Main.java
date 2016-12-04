package dob.specialist;

/**
 * Created by User on 27.11.2016.
 */

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String s;
        System.out.println("YO!");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Vvedika - ");
        try {
            s = reader.readLine();
            System.out.println("You are entered:"+s);
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}
