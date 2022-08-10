package a;
public class Circle {
    private double radius;
    private String color;
    public Circle(){
        radius=1.0;
        color="red";
    }
     Circle(double radius){
        this.radius=radius;
        color="red";
    }
      public double getRadisus(){
        return radius;
    }
     public double getArea(){
        return Math.PI*radius*radius;
    }
}
