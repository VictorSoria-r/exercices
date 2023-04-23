import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class LeftRotation {
    public static List<Integer> rotateLeft(int n, List<Integer> arr) {
        // Write your code here
        // After making the rotations, it is displayed that the first "n" elements of the list go to the final part

        // we form a new array where the first n elements will be the final part of the list
        List<Integer> result = Stream.of(arr.subList(n,arr.size()), arr.subList(0,n))
                .flatMap(Collection::stream)
                .collect(toList());
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = rotateLeft(d, arr);

        result.stream()
                .forEach(System.out::println);
        bufferedReader.close();
    }

     /*  Link Description Problem
    https://www.hackerrank.com/challenges/array-left-rotation/problem
    */
}
