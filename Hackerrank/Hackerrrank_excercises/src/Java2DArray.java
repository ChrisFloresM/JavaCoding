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



public class Java2DArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        int testSum = 0;
        int maxNum = Integer.MIN_VALUE;

        for(int c = 0; c < 4; c++) {
            for (int k = 0; k < 4; k++) {
                testSum = 0;
                for (int i = c; i < 3 + c; i++) {
                    if (i == 1 + c) {
                        testSum += arr.get(i).get(1 + k);
                        continue;
                    }
                    for (int j = k; j < 3 + k; j++) {
                        testSum += arr.get(i).get(j);
                    }
                }
                maxNum = Math.max(testSum, maxNum);
            }
        }
        System.out.println(maxNum);
    }
}
