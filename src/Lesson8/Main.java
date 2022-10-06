package Lesson8;

import java.io.File;
import java.io.IOException;
import java.net.PasswordAuthentication;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        /*File file = new File ("test.txt");
        if(file.exists()) {
            file.createNewFile();

        }
      */
       /* Path path;
        File Files;
        path =Path.of ("test.txt").toAbsolutePath();
        System.out.println(path.getFileName());
        System.out.println(path.getParent());
        System.out.println(path.getRoot());
        System.out.println(path.isAbsolute());*/
        File file = new File("test.txt");
        if (!file.exists()) {
            file.createNewFile();
            file.delete();


        }
    }
}








