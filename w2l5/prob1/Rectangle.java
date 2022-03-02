package w1l2.CS390_Assignments.w2l5.prob1;

public class Rectangle extends Shape{

    double width;
    double height;

    public Rectangle(String color,double width,double height) {
        super(color);
        this.width=width;
        this.height = height;
    }

    @Override
    public double calcualteArea() {
        return width*height;
    }

    @Override
    public double calculatePerimeter() {
        return 2* width + 2*height;
    }
}
