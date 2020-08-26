abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();
}

class Triangle extends Shape {

    private final double a;
    private final double b;
    private final double c;

    Triangle(double a, double b, double c) {

        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getPerimeter() {
        return a+b+c;
    }

    @Override
    double getArea() {
        double p = getPerimeter()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
class Rectangle extends Shape {

    private final double a;
    private final double b;

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double getPerimeter() {
        return (a+b)*2;
    }

    @Override
    double getArea() {
        return a*b;
    }
}
class Circle extends Shape {

    private final double a;

    Circle(double a) {
        this.a = a;
    }

    @Override
    double getPerimeter() {
        return Math.PI*2*a;
    }

    @Override
    double getArea() {
        return Math.PI*a*a;
    }
}