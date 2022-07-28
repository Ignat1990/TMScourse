package Lesson11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        //String passport = "1111-abc-8888-fgh-1f5t";
        StringUtil.printFirstTwoBlocks(str);
        StringUtil.changeCharToStar(str);
        StringUtil.checkAbc(str);
        StringUtil.starsChange(str);
        StringUtil.checkThreeLetters(str);
        StringUtil.checkStart(str);
        StringUtil.checkEnd(str);
        StringUtil.stringContainsOnlyLetters(str);
        StringUtil.stringContainsOnlyLetters1(str);
        StringUtil.printWithSlash(str);


    }
}






      /*  int sc = 4567;
        int sc1 = 5675;
        String word = "hai";
        String word1 = "loy";
        int sc3 = 2345;
        String vot = "Hot";
        String tes = "2f3g4j5l";


        System.out.println(sc + "-" + word + "-" + sc1 + "-" + word1 + "-" + sc3 + "-" + vot + "-" + tes);
    }*/






