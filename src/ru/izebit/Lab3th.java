package ru.izebit;

/**
 * @author <a href="mailto:izebit@gmail.com">Artem Konovalov</a> <br/>
 * Date: 20.10.2020
 */
public class Lab3th {
    public static int solutions(int a,
                                int b,
                                int c) {
        final int value = b * b - 4 * a * c;
        if (value < 0)
            return 0;
        else if (value == 0)
            return 1;
        else
            return 2;
    }

    public static int findZip(String str) {
        final String zip = "zip";
        int index = str.indexOf(zip);
        if (index < 0)
            return -1;

        return str.indexOf(zip, index + 1);
    }

    public static boolean checkPerfect(long number) {
        long sum = 0;
        for (int i = 1; i < number; i++)
            sum += number % i;

        return sum == number;
    }

    public static String flipEndChars(String str) {
        if (str == null || str.length() < 2)
            return "Incompatible.";
        if (str.charAt(0) == str.charAt(str.length() - 1))
            return "Two's a pair.";

        return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
    }

    public static boolean isValidHexCode(String hex) {
        if (hex == null || hex.length() != 7 || hex.charAt(0) != '#')
            return false;

        for (int i = 1; i < hex.length(); i++)
            if ((hex.charAt(i) < 'A' || hex.charAt(i) > 'F') &&
                    (hex.charAt(i) < 'a' || hex.charAt(i) > 'f') &&
                    !Character.isDigit(hex.charAt(i)))
                return false;

        return true;
    }

    public static void main(String[] args) {
        System.out.println(solutions(1, 0, -1));
        System.out.println(findZip("all zip files are zipped"));
        System.out.println(checkPerfect(97));
        System.out.println(flipEndChars("Cat, dog, and mouse."));
        System.out.println(isValidHexCode("#CD5C&C"));
    }
}
