package Lesson8;

public class Triangle implements Figure {
    double a=4;
    double b=8;
    double c=10;
    double h=7.5;
    double S;
    double P;
    @Override
    public double areaFigure() {
        S = 0.5 * c * h;
        return S;
    }
    @Override
    public double perimeterFigure() {
        P = a + b + c;
        return P;
    }
    void showTriangleRezal() {
        System.out.println("S=" + S + " ; P=" + P);
    }
}
