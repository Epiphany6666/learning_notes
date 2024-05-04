package myconvertstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class demo1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("myio\\b.txt", Charset.forName("GBK"));
        FileWriter fw = new FileWriter("myio\\c.txt", Charset.forName("UTF-8"));
        int ch;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }
        fw.close();
        fr.close();
    }
}
