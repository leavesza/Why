package org.example;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

/**
 * Hello world!
 * This is some outstanding code i should learn - Yaseen
 */
public class App {
    public static void main(String[] args) {

        int[] randomNumbers = IntStream.generate(
                                () -> ThreadLocalRandom.current().nextInt(0, 10000 + 1))
                                        .limit(100)
                                        .boxed()
                                        .mapToInt(i -> i)
                                        .toArray();

        int largestNumber = Arrays.stream(randomNumbers)
                                    .max()
                                    .getAsInt();

        int smallestNumber = Arrays.stream(randomNumbers)
                                    .min()
                                    .getAsInt();

        System.out.println("Printing the whole array...");
        Arrays.stream(randomNumbers)
                .forEach(System.out::println);

        System.out.println("\n\nThe largest number is: " + largestNumber);




    }
}
