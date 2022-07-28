package Lesson9;

public class Sleep implements Flyble {


    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName()+ " Sleep fly");

    }
}
