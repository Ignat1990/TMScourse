package Lesson11;

public class Main {
     static String str ="2345-tat-5543-hot-2t3h";
    private static Object ddd;

    public static void printFirstTwoBlocks(String[] args) {

      /*  System.out.println(str.substring(0, 4));
        System.out.print(str.substring(9, 13));*/

    }

    public static  void starsChange(String[] args) {
        String oldString = "2345-tat-5543-hot-2t3h";
        String newString = oldString.replace("2345-tat-5543-hot-2t3h", "2345-***-5543-***-2t3h");

        System.out.println("Old string :" + oldString);
        System.out.println("New string :" + newString);

        /*public static void printWithSlash(String str)
        {    
            String[] words = str.split("-");
            StringBuilder sb = new StringBuilder("Letters:");
            sb.append(words[1].toUpperCase()).append("/");  //xxxx-YYY-xxxx-yyy-xyxy
            sb.append(words[3].toUpperCase()).append("/");  //xxxx-yyy-xxxx-YYY-xyxy

            Character character = words[4].charAt(1);
            sb.append(character.toString().toUpperCase()).append("/"); //xxxx-yyy-xxxx-yyy-xYxy

            Character character1 = words[4].charAt(3);
            sb.append(character1.toString().toUpperCase()).append("/"); //xxxx-yyy-xxxx-yyy-xyxY

            System.out.println(sb);
*/

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






