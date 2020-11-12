package ru.izebit;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author <a href="mailto:izebit@gmail.com">Artem Konovalov</a> <br/>
 * Date: 19.10.2020
 */
public class Lab2nd {

    public static String repeat(String str, int n) {
        return IntStream
                .range(0, str.length())
                .mapToObj(index -> ("" + str.charAt(index)).repeat(n))
                .collect(Collectors.joining());
    }

    public static int differenceMaxMin(int[] numbers) {
        if (numbers.length == 0)
            return -1;

        if (numbers.length == 1)
            return numbers[0];

        Arrays.sort(numbers);
        return numbers[numbers.length - 1] - numbers[0];
    }

    public static boolean isAvgWhole(int[] numbers) {
        double average = Arrays
                .stream(numbers)
                .average()
                .orElseThrow();

        return average % 1 == 0;
    }

    public static int[] cumulativeSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            numbers[i] = sum;
        }

        return numbers;
    }

    public static int getDecimalPlaces(String value) {
        int index = value.indexOf(".");
        if (index == -1)
            return 0;

        return Integer.parseInt(value.charAt(index + 1) + "");
    }

    public static void main(String[] args) {
        System.out.println(repeat("mice", 5));
        System.out.println(differenceMaxMin(new int[] {10, 4, 1, 4, -10, -50, 32, 21}));
        System.out.println(isAvgWhole(new int[] {1, 5, 6}));
        System.out.println(Arrays.toString(cumulativeSum(new int[] {3, 3, -2, 408, 3, 3})));
        System.out.println(getDecimalPlaces("43.20"));
    }
}
