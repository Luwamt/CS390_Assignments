package w1l2.CS390_Assignments.w2l5.prob1;

public class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius=radius;
    }

    @Override
    public double calcualteArea() {
        double area = Math.PI*radius*radius;
        return  area ;
    }

    @Override
    public double calculatePerimeter() {
        double area = Math.PI* 2 * radius;
        return  area;
    }
}
