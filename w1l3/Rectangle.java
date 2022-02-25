package w1l2.CS390_Assignments.w1l3;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width,double length) {
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double computeArea(){
        double area = (width * length);
        return area;
    }


}
