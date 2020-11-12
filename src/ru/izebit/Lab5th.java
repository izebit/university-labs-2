package ru.izebit;

import java.util.Arrays;
import java.util.List;

/**
 * @author <a href="mailto:izebit@gmail.com">Artem Konovalov</a> <br/>
 * Date: 20.10.2020
 */
public class Lab5th {
    public static int[] encrypt(String str) {
        int[] result = new int[str.length()];

        result[0] = str.charAt(0);
        for (int i = 1; i < str.length(); i++)
            result[i] = str.charAt(i) - str.charAt(i - 1);

        return result;
    }

    public static String decrypt(int[] array) {
        StringBuilder result = new StringBuilder();
        result.append((char) array[0]);
        for (int i = 1; i < array.length; i++)
            result.append((char) (result.charAt(i - 1) + array[i]));

        return result.toString();
    }


    public static boolean canMove(final String chessPiece,
                                  final String currentLocationStr,
                                  final String targetLocationStr) {
        class Position {
            private int x;
            private int y;

            public Position(String position) {
                this.x = Character.toUpperCase(position.charAt(0)) - 'A';
                this.y = position.charAt(1) - '1';
            }
        }

        final Position currentLocation = new Position(currentLocationStr);
        final Position targetLocation = new Position(targetLocationStr);

        switch (chessPiece) {
            case "конь":
                return Math.abs(currentLocation.x - targetLocation.x) + Math.abs(currentLocation.y - targetLocation.y) == 3;
            case "слон":
                //по диагонали
                return Math.abs(currentLocation.x - targetLocation.x) == Math.abs(currentLocation.y - targetLocation.y);
            case "ладья":
                // по горизонтали
                return currentLocation.x == targetLocation.x || currentLocation.y == targetLocation.y;
            case "ферзь":
                //по диагонали и горизонтали
                return canMove("слон", currentLocationStr, targetLocationStr) ||
                        canMove("ладья", currentLocationStr, targetLocationStr);
            case "король":
                return Math.max(currentLocation.x, targetLocation.x) - Math.min(currentLocation.x, targetLocation.x) == 1
                        && Math.max(currentLocation.y, targetLocation.y) - Math.min(currentLocation.y, targetLocation.y) == 1;
            case "пешка":
                return targetLocation.y - currentLocation.y == 1 && targetLocation.x == currentLocation.x;
            default:
                throw new IllegalArgumentException(String.format("can't recognize a chess piece: %s", chessPiece));
        }
    }

    public static void main(String[] args) {
        final int[] array = encrypt("Hello");
        System.out.println(decrypt(array));

        System.out.println(canMove("ладья", "A8", "H8"));
        System.out.println(canMove("слон", "A7", "G1"));
        System.out.println(canMove("ферзь", "C4", "D6"));
    }
}
