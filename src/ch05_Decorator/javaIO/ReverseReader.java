package src.ch05_Decorator.javaIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class ReverseReader extends BufferedReader {
    public ReverseReader(Reader in) {
        super(in);
    }

    public String reverseLine() throws IOException {
        //BufferReader繼承而來的方法readLine, 一次讀取一行
        String line = super.readLine();

        //讀取到空的那一行就返回null
        return line == null ? null : this.reverse(line);
    }

    private String reverse(String source) {
        String result = "";

        //將讀取的這一行內容反轉result
        //1. "a" + "" = "a"
        //2. "p" + "a" = "pa"
        //3. "p" + "l" = "lpa"
        //...依此類推
        for (int i = 0; i < source.length(); i++) {
            result = source.charAt(i) + result;
        }
        System.out.println("反轉後 result " + result);

        return result;
    }
}
