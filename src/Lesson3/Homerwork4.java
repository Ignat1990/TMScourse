package Lesson3;

import java.util.Scanner;

public class Homerwork4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        {

            int[] array = {2, 3, 4, 5, 6, 7};
            for (int x : array) {
                if (x == value) {
                    System.out.print(value);
                }
            }
        }
    }
}
//Scanner sc = new Scanner(System.in);
//String Couch = sc.nextLine();{
//String[] arrayMilan = new String[]{"Ibragimovic", "Theo", "Maldini", "Nesta", "Dida"};
// String[] Ibragimovic;
// if (arrayMilan == Ibragimovic) {
//  System.out.print("Ginias");
//}else if (arrayMilan == Theo) {
//System.out.print("Good Defender");