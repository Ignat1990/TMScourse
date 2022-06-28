package Lesson8;

public class Rectangle implements Figure {
    double a=7;
    double b=6;
    double P;
    double S;

    @Override
    public double areaFigure() {
        S = a * b;
        return S;
    }

    @Override
    public double perimeterFigure() {
        P = (2 * a) + (2 * b);

        return P;
    }

    void showRectanglePar() {
        System.out.println("S=" + S + " ; P=" + P);
    }
}
