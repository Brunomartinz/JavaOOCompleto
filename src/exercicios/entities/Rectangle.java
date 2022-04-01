package exercicios.entities;

public class Rectangle {
    public double width;
    public  double height;

    public double area() {
        return width * height;
    }
    public double Perimeter() {
        return 2 * (width + height);
    }
    public double Diagonal() {
        double diagonal =  Math.sqrt(width ^ 2 + height ^ 2);
    }
}
