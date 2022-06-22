package Lesson3;

import java.util.Arrays;

public class Homework3 {


    public static void main(String[] args) {

        int[] arrys = {2,3,4,5};
        int nuberToDelete = 3;



        for (int i = 0; i < arrys.length; i++) {
            if (arrys[i]==nuberToDelete) {
                arrys[i] = 0;

            }

        }
        System.out.println(Arrays.toString(arrys));


    }
}
