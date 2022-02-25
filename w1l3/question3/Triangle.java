package w1l2.CS390_Assignments.w1l3.question3;

final public class Triangle {
    private double base;
    private double height;

    public Triangle(double base,double height) {
        this.base=base;
        this.height=height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double computeArea(){
        double area = (0.5 * base * height);
        return area;
    }

}
