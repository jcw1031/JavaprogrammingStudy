package classPractice;

class Shape{

}
class Rectangle extends Shape{
    double length;
    double width;
    public Rectangle(double l, double w){
        this.length=l;
        this.width=w;
    }
    double getArea(){
        return length*width;
    }
}
class Circle1 extends Shape{
    double radius;
    public Circle1(double radius){
        this.radius=radius;
    }
    double getArea(){
        return radius*radius*3.141592;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape obj1=new Rectangle(10, 20);
        Shape obj2 = new Circle1(10);

        System.out.println(((Rectangle)obj1).getArea());
        System.out.println(((Circle1)obj2).getArea());
    }
}