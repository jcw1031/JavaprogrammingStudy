package classPractice;
class Circle2{
    int x, y, radius;

    public Circle2(int x, int y, int radius){
        this.x=x; this.y=y; this.radius=radius;
    }

    public void move(int dx, int dy){
        x+=dx; y+=dy;
    }

    public String toString(){
        return "Circle [x="+x+", y="+y+", radius="+radius+"]";
    }
}
public class CircleTest2 {
    public static void main(String[] args) {
        Circle2 c[]=new Circle2[3];
        for(int i=0;i<c.length;i++) {
            c[i]=new Circle2((int)(Math.random()*100), (int)(Math.random()*100), (int)(Math.random()*100));
        }

        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }

    }
}
