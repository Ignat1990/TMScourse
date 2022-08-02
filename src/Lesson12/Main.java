package Lesson12;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("/Users/macbookpro/Downloads/TMScourse/src/test.txt");
        File fileToWrite = new File("/Users/macbookpro/Downloads/TMScourse/src/outputTest.txt");

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line1 = reader.readLine();
            reader.close();

            System.out.println(line1);

            FileWriter fileWriter = new FileWriter(fileToWrite);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.write(line1);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
