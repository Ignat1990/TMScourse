package Lesson12;

 public class Main {
     public static void main(String[] args) throws CloneNotSupportedException {
         Person man1 = new Person ("Pasha",34);
         Person man2 = new Person ("Yra",25);
         Person man3 = new Person ("Ignat",32);
         Person man4 = new Person ("Dima",25);
         Person man5 = new Person ("pasha",34);
         System.out.println(man1.equals(man5));
         System.out.println(man4.hashCode());
         System.out.println(man1.hashCode());
         System.out.println(man2.toString());
         System.out.println(man2.clone());

    }
}
