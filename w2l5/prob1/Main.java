package w1l2.CS390_Assignments.w2l5.prob1;

public class Main {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle("red", 4, 2);
        Shape square = new Square("yellow", 4, 4);
        Shape circle = new Circle("white", 4);
        Shape circle2 = new Circle("black", 5);
        Rectangle rectangle2 = new Rectangle("blue", 3, 2);
        Square square2 = new Square("violet", 3, 3);
        Shape[] shapes = {rectangle,rectangle2,square,square2,circle,circle2};

        print(shapes);

    }
    public static void print(Shape[] shapes){
        double perimeter =0;
        double area = 0;
        for (Shape s: shapes) {
            perimeter+=s.calculatePerimeter();
           area+=s.calcualteArea();
        }
        System.out.println("The total area of shapes: "+area) ;
       System.out.println("The total perimeter of shapes: " +perimeter);

    }
}
