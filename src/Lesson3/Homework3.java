package Lesson3;

import java.util.Arrays;

public class Homework3 {


    public static void main(String[] args) {

        int[] arrys = new int[4];
        arrys[0] = (2);
        arrys[1] = (3);
        arrys[2] = (4);
        arrys[3] = (5);

        arrys[1] = 0;


        for (int i = 2; i < arrys.length - 1; i++) {
            arrys[i - 1] = arrys[i];
            arrys[i] = 0;

        }
        System.out.println(Arrays.toString(arrys));


    }
}
