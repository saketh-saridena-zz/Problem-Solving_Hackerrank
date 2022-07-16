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
    public static List<Integer> breakingRecords(List<Integer> scores) {
        int c1=0;
        int c2=0;
        int min=scores.get(0);
        int max=scores.get(0);
        List<Integer> l=new ArrayList<Integer>();
        for(int i=0;i<scores.size();i++) {
            if(scores.get(i)>max) {
                max=scores.get(i);
                c1++;
            }
            if(scores.get(i)<min) {
                min=scores.get(i);
                c2++;
            }
        }
        l.add(c1);
        l.add(c2);
        return l;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.breakingRecords(scores);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
