package Lesson8;

import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Сircle сircle = new Сircle();
        сircle.areaFigure();
        сircle.perimeterFigure();
        сircle.showCirclePar();

        Rectangle rectangle = new Rectangle();
        rectangle.areaFigure();
        rectangle.perimeterFigure();
        rectangle.showRectanglePar();

        Triangle triangle = new Triangle();
        triangle.areaFigure();
        triangle.perimeterFigure();
        triangle.showTriangleRezal();


        int[][] figure = new int[5][3];
        int[] newFigure = new int[figure.length];

        for (int i = 0; i < figure.length; i++) {
            for (int j = 0; j < figure[i].length; j++) {
                figure[i][j] =(int)(Math.random()*10);
                newFigure[i] += figure[i][j];
            }
        }
        System.out.println(Arrays.deepToString(figure));
        System.out.println(Arrays.toString(newFigure));
    }
}

