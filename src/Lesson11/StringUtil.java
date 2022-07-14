package Lesson11;




public class StringUtil {
    //xxxx-yyy-xxxx-yyy-xyxy


    public static void printFirstTwoBlocks(String str) {


        System.out.println(str.substring(0, 4));
        System.out.print(str.substring(9, 13));
    }

    public static void changeCharToStar(String str) {
        char[] result = str.toCharArray();
        for (int i = 0; i < result.length; i++) {
            if (i > 4 && i <= 7) {
                result[i] = '*';
            } else if (i > 13 && i <= 16) {
                result[i] = '*';
            }
        }
        System.out.println(result);
    }


    public static void checkAbc(String str) {

        boolean contains = str.contains("ABC");
        boolean contains2 = str.contains("abc");
        if (contains || contains2) {
            System.out.println("String " + str + " contains abc");
        } else {
            System.out.println("String " + str + " not contains");
        }
    }

    public static void starsChange(String str) {
        String oldString = "1111-abc-8888-fgh-1f5t";
        String newString = oldString.replace("1111-abc-8888-fgh-1f5t", "1111-***-8888-***-1f5t");

        System.out.println("Old string :" + oldString);
        System.out.println("New string :" + newString);
    }

    public static void checkThreeLetters(String str) {
        String[] words = str.split("-");
        for (String word : words) {
            if (word.length() == 3 && stringContainsOnlyLetters(word)) {
                word = "***";
            }
            System.out.println(word + "-");
        }
    }

    public static void checkStart(String str) {
        System.out.println(str.startsWith("555", 1));
    }

    public static void checkEnd(String str) {
        System.out.println(str.endsWith("1a2b"));
    }


    public static boolean stringContainsOnlyLetters(String str) {
        char[] letters = str.toCharArray();
        for (Character letter : letters) {
            if (Character.isLetter(letter)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }


    public static boolean stringContainsOnlyLetters1(String str) {
        boolean b = false;
        return b;
    }


    public static void printWithSlash(String str) {
        String[] words = str.split("-");
        StringBuilder sb = new StringBuilder("Letters:");
        sb.append(words[1].toUpperCase()).append("/");  //xxxx-YYY-xxxx-yyy-xyxy
        sb.append(words[3].toUpperCase()).append("/");  //xxxx-yyy-xxxx-YYY-xyxy

        Character character = words[4].charAt(1);
        sb.append(character.toString().toUpperCase()).append("/"); //xxxx-yyy-xxxx-yyy-xYxy

        Character character1 = words[4].charAt(3);
        sb.append(character1.toString().toUpperCase()).append("/"); //xxxx-yyy-xxxx-yyy-xyxY

        System.out.println(sb);

    }
}

