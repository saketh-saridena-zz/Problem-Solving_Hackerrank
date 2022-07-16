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
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int app=0;
        int ora=0;
        ArrayList<Integer> l1= new ArrayList<Integer>(a); 
        ArrayList<Integer> l2= new ArrayList<Integer>(b);
        for(int i=0;i<apples.size();i++) {
            l1.add(a+apples.get(i));
            if(l1.get(i)>=s &&l1.get(i)<=t)
                app=app+1;
        } 
        for(int j=0;j<oranges.size();j++) {
            l2.add(b+oranges.get(j));
            if(l2.get(j)>=s &&l2.get(j)<=t)
                ora=ora+1;
        }
        System.out.println(app);
        System.out.println(ora);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int s = Integer.parseInt(firstMultipleInput[0]);

        int t = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int a = Integer.parseInt(secondMultipleInput[0]);

        int b = Integer.parseInt(secondMultipleInput[1]);

        String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(thirdMultipleInput[0]);

        int n = Integer.parseInt(thirdMultipleInput[1]);

        List<Integer> apples = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> oranges = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.countApplesAndOranges(s, t, a, b, apples, oranges);

        bufferedReader.close();
    }
}
