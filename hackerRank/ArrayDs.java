import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class ArrayDs {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> res = reverseArray(arr);


        res.stream()
                .map(Object::toString)
                .forEach(System.out::println);


        bufferedReader.close();

    }
    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        Collections.reverse(a);
        return a;
    }

  /*  Link Description Problem
    https://www.hackerrank.com/challenges/arrays-ds/problem
    */
}
