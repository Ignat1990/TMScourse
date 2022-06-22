package Lesson3;

import java.util.Scanner;

public class Homerwork4 {
    public static void main(String[] args) {
    /*    Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        {

            int[] array = {2, 3, 4, 5, 6, 7};
            for (int x : array) {
                if (x == value) {
                    System.out.print(value);
                }
            }
        }
    }*/

        Scanner sc = new Scanner(System.in);
        String arrayMilan = sc.next();


        switch (arrayMilan) {
            case ("Ibragimovic"):
                System.out.println("Ginias");
                break;
            case ("Theo"):
                System.out.println("Good Defender");
                break;
            case ("Nesta"):
                System.out.println("Legend Defender");
                break;
            case ("Maldini"):
                System.out.println("Legend");
                break;
            case ("Dida"):
                System.out.println("Good Goalkeeper");
                break;
            default:
                ;
                break;
        }



    }
}




