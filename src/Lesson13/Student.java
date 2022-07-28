package Lesson13;

public class Student {
    private String name;
    private float mark;

    public Student(String name, float mark) {
        this.name = name;
        this.mark = mark;
    }



    public String getName() {
        return name;
    }

    public float getMark() {
        return mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}

