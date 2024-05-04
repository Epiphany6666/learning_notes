package mybytesstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myio\\a.txt"));
        String b;
        while ((b = br.readLine()) != null) {
            System.out.print(b);
        }
        br.close();
    }
}
