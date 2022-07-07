package Lesson9;

public class Crown implements Flyble {

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName()+" Crown fly");

    }
}
