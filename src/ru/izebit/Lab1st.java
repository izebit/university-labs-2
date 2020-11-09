package ru.izebit;

import java.util.Arrays;

/**
 * @author <a href="mailto:izebit@gmail.com">Artem Konovalov</a> <br/>
 * Date: 19.10.2020
 */
public class Lab1st {

    public static int remainder(int a, int b) {
        return a % b;
    }

    public static double triArea(double base, double height) {
        return 0.5 * height * base;
    }

    public static int animals(int chickens, int cows, int pigs) {
        return 2 * chickens + 4 * cows + 4 * pigs;
    }

    public static boolean profitableGamble(double prob,
                                           double prize,
                                           double pay) {
        return prob * prize > pay;
    }

    public static String operation(int N,
                                   int a,
                                   int b) {
        if (N == a + b)
            return "added";
        if (N == a - b)
            return "subtracted";
        if (N == a * b)
            return "multiplied";
        if (N == a / b)
            return "divided";
        return "none";
    }

    public static int ctoa(char s) {
        return s;
    }

    public static long addUpTo(int number) {
        return (long) (((1 + number) / 2.0) * number);
    }

    public static double nextEdge(double a, double b) {
        return (a + b) - 1;
    }

    public static int sumOfCubes(int[] numbers) {
        return Arrays.stream(numbers).map(n -> (int) Math.pow(n, 3)).sum();
    }

    public static boolean abcmath(int a, int b, int c) {
        int value = a;
        for (int i = 1; i <= b; i++)
            value *= 2;
        return value % c == 0;
    }

    public static void main(String[] args) {
        System.out.println(remainder(-9, 45));
        System.out.println(triArea(3, 2));
        System.out.println(animals(2, 3, 5));
        System.out.println(profitableGamble(0.9, 1, 2));
        System.out.println(operation(24, 15, 9));
        System.out.println(ctoa('A'));
        System.out.println(addUpTo(3));
        System.out.println(nextEdge(8, 10));
        System.out.println(sumOfCubes(new int[] {1, 5, 9}));
        System.out.println(abcmath(1, 2, 3));
    }
}
