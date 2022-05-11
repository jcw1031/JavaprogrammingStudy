package classPractice;
class Circle{
    int x, y;
    int radius;
    public Circle(int x, int y, int radius){
        this.x=x; this.y=y; this.radius=radius;
    }
    public void move(Circle c, int dx, int dy){
        c.x+=dx; c.y+=dy;
    }
    public String toString(){
        return "Circle [x = "+x+", y = "+y+", radius = "+radius+"]";
    }
}
public class CircleTest {
    public static void main(String[] args) {
        Circle c=new Circle(10, 10, 5);
        System.out.println("move() 전");
        System.out.println(c);
        c.move(c, 10, 20);
        System.out.println("move() 후");
        System.out.println(c);
    }
}
