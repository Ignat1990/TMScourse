package Lesson19;

import com.sun.source.tree.UsesTree;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    private static final Pattern PATTERN = Pattern.compile("^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");

    public static void main(String[] args) {


        Scanner sr = new Scanner(System.in);
        String ipAddress = sr.nextLine();
        System.out.println(validate(ipAddress));

    }


    public static boolean validate(final String ip) {
        return PATTERN.matcher(ip).matches();
    }

}


