package src.ch05_Decorator;

import org.junit.jupiter.api.Test;
import src.ch05_Decorator.javaIO.ReverseReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JavaIOTest {

    @Test
    public void test() throws IOException {
        System.out.println("==========FileReader讀取檔案==========");
        FileReader reader = new FileReader("test.txt");

        //讀取一個字元
        for (int c = reader.read(); c >= 0; c = reader.read()) {
            System.out.println((char) c);
        }

        //讀取一行
        System.out.println("==========BufferReader讀取檔案==========");
        BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));

        for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
            System.out.println(line);
        }

        System.out.println("==========Reverse Reader反轉讀入的內容==========");
        ReverseReader reverseReader = new ReverseReader(new FileReader("test.txt"));

        //當讀取到空的那一行時, 就不會印
        for (String rLine = reverseReader.reverseLine(); rLine != null; rLine = reverseReader.reverseLine()) {
            System.out.println(rLine);
        }

    }
}
