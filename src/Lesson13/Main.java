package Lesson13;



import javax.imageio.ImageReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {

          /*  String nameStudent1 = "Pavel";
            String nameStudent2 = "Grisha";
            String nameStudent3 = "Petia";
            String nameStudent4 = "Masha";
            String nameStudent5 = "Marina";
            String nameStudent6 = "Dasha";
            String nameStudent7 = "Jony";
            float markStudent1 = 5;
            float markStudent2 = 4;
            float markStudent3 = 3;
            float markStudent4 = 3;
            float markStudent5 = 4;
            float markStudent6 = 5;
            float markStudent7 = 2;*/

        Student student1 = new Student("Jara", 4.3f);
        Student student2 = new Student("Pavel", 5f);
        Student student3 = new Student("Grischa", 2f);
        List<Student> students = new ArrayList<>();
        students.add(0, student1);
        students.add(1, student2);
        students.add(2, student3);
        int i;
        System.out.println(students);
        for (i = 0; i < students.size(); i++)

        {
            if (students.get(i).getMark() < 4f) {
                students.remove(students.get(i));
                i--;


            }

        }
        System.out.println(students);
    }
}





