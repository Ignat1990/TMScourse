package Lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Homework8 {
    private static int j;
    private static int i;

    public static void main(String[] args) {
        int[] arr = {3, 1, 6, 5, 2, 8, 4};
        int[] newArr = null;
        int elementToBeDeleted = 5;
        System.out.println("Original Arrays is:" + Arrays.toString(arr));


        for (int i = 0; i < arr.length - 1; i++) ;
        {


            if (arr[i] == elementToBeDeleted) {
                newArr = new int[arr.length - 1];

                for (int index = 0; index < i; index++) ;
                {
                    int index = 0;

                    newArr[index] = arr[index];
                }
                for (int j = i; j < arr.length - 1; j++) ;
                {
                    newArr[j] = arr[j + 1];
                }

            }
        }
        System.out.println("New Array after deleting element = " + elementToBeDeleted + " and shifting:"
                + Arrays.toString(newArr));
    }
}




