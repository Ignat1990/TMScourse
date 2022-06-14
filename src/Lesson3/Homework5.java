package Lesson3;

import java.util.Arrays;

public class Homework5 {
    public static void main(String[] args) {
        int mas[] = new int[]{11, 3, 14, 16, 7};

        boolean isSorted = false;

        int buf;

        while (!isSorted) {
            isSorted = true;
            int i;
            for (i = 0; i < mas.length - 1; i++) {

                if (mas[i] > mas[i + 1]) {
                    isSorted = false;
                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }

            System.out.println(Arrays.toString(mas));

        }
    }}
