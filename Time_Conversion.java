//Author@ Saketh Saridena
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    public static String timeConversion(String s) {
        if(s.charAt(8)=='P') {
            String k=s.substring(0,2);
            int i=(Integer.parseInt(k));
            i=i+12;
            if(i==24)
                i=12;
            String j=Integer.toString(i);
            String t=s.substring(0,2);
            s=s.replace(t,j);
            return s.substring(0,8);
        }
        else
            if(s.charAt(0)=='1' && s.charAt(1)=='2')
                s=s.replace(s.substring(0,2),"00");
            return s.substring(0,8);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
