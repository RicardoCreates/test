package de.ricardo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Erste Möglichkeit
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Zweite Möglichkeit");
        int[] numbers2 = {1, 2, 3, 4, 5};

        for (int number2 : numbers2) {
            System.out.println(number2);
        }

        System.out.println("Dritte Möglichkeit");
        int[] numbers3 = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(numbers3));

        // Vierte Möglichkeit - Verwendung der createArray-Methode
        int[] array = createArray();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    public static int[] createArray() {
        return new int[]{1, 2, 3, 4, 5};
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
