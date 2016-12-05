package dob.specialist;

import java.io.*;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) throws IOException {
        String s;
        out.println("YO!");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        out.print("Vvedika Имя, сволочь - ");
        try {
            s = reader.readLine();
//            System.out.println("You are entered:"+s);
            sb.append("Привет, ");
            sb.append(s);
            out.println(sb.toString());
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}
