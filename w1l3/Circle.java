package w1l2.CS390_Assignments.w1l3;

 final public class Circle {
     private double radius;

     public Circle(double radius) {
         this.radius = radius;
     }

     public double getRadius() {
         return radius;
     }
     public double computeArea(){
         double area = Math.PI * radius*radius;
         return area;
     }


 }
