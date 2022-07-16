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
    public static void plusMinus(List<Integer> arr) {
        double p=0,n=0,z=0;
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i)>0)
                p=p+1;
            else if(arr.get(i)<0)
                n=n+1;
            else
                z=z+1;
        }
        double pp;
        pp=p/(arr.size());
        double pn;
        pn=n/(arr.size());
        double pz;
        pz=z/(arr.size());
        System.out.println(pp);
        System.out.println(pn);
        System.out.println(pz);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
