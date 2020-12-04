package com.company;

public class Main {

    // driver code
    public static void main(String[] args) {
        primeNumbers(3, 17);
    }

    public static void primeNumbers(int first, int second) {
        int min, max, count;
        if (first >= second) {
            max = first;
            min = second;
        } else {
            max = second;
            min = first;
        }

        System.out.printf("\nPrime numbers between %d and %d are:\n", min, max);

        for (int i = min; i <= max; i++) {
            if (i == 1 || i == 0)
                continue;

            count = 1;

            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    count = 0;
                    break;
                }
            }

            if (count == 1)
                System.out.println(i);
        }
    }
}



