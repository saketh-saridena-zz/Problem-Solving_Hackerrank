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
    public static String dayOfProgrammer(int year) {
        String str;
        if(year>1919) {
            if(year%400==0) {
                str="12.09.";
            }
            else if(year%4==0 && year%100!=0) {
                str="12.09.";
            }
            else {
                str="13.09.";
            }  
        }
        else if(year==1918)
            str="26.09.";
        else {
            if(year%4==0) {
                str="12.09.";
            }
            else {
                str="13.09.";
            }
        }
        String s=Integer.toString(year);
        return str+s;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
