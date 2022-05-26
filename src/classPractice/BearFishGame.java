package classPractice;
import java.util.*;

abstract class GameObject{
    protected int distance; //한 번 이동 거리
    protected int x, y; //현재 위치 (화면 맵 상의 위치)
    static int count=0;

    public GameObject(int startX, int startY, int distance){ //초기 위치와 이동 거리
        this.x=startX;
        this.y=startY;
        this.distance=distance;
    }
    public int getX(){return x;}
    public int getY(){return y;}

    public boolean collide(GameObject p){ //이 객체가 객체 p와 충돌했으면 true 리턴
        if(this.x==p.getX() && this.y==p.getY()){
            return true;
        }
        else
            return false;
    }
    protected abstract void move(); //이동한 후의 새로운 위치로 x, y 변경
    protected abstract char getShape(); //객체의 모양을 나타내는 문자 리턴
}

class Bear extends GameObject{
    String c;
    public Bear(int startX, int startY, int distance) {
        super(startX, startY, distance);
    }
    @Override
    protected void move() {
        if(c.equals("d") && x<19){
            x+=distance;
        }
        else if(c.equals("a") && x>0){
            x-=distance;
        }
        else if(c.equals("w") && y>0){
            y-=distance;
        }
        else if(c.equals("s") && y<9){
            y+=distance;
        }
        else{
            System.out.print("\n\n키 제대로 누르셈");
        }
        count++;
    }

    @Override
    protected char getShape() {
        return 'B';
    }
}

class Fish extends GameObject{
    public Fish(int startX, int startY, int distance) {
        super(startX, startY, distance);
    }
    @Override
    protected void move() {
        if (count % 5 == 4 || count % 5 == 0) {
            int ran = (int) (Math.random() * 4);
            switch (ran) {
                case 0: {
                    if (x < 20) x += distance;
                    break;
                }
                case 1: {
                    if (x > 0) x -= distance;
                    break;
                }
                case 2: {
                    if (y < 10) y += distance;
                    break;
                }
                case 3: {
                    if (y > 0) {
                        y -= distance;
                        break;
                    }
                }
            }
        }
    }

    @Override
    protected char getShape() {
        return '@';
    }
}

public class BearFishGame {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        Bear b=new Bear(0, 0, 1);
        Fish f=new Fish((int)(Math.random()*20), (int)(Math.random()*10), 1);

        while(!b.collide(f)){
            for(int i=0;i<10;i++){
                for(int j=0;j<20;j++){
                    if(b.getX()==j && b.getY()==i) System.out.print(b.getShape());
                    else if(f.getX()==j && f.getY()==i) System.out.print(f.getShape());
                    else System.out.print('-');
                }
                System.out.println();
            }

            System.out.print("→ : d\t ← : a\t ↑ : w\t ↓ : s\t\t 입력 : ");
            b.c=s.next();
            b.move();
            f.move();
            System.out.println("\n");
        }
        System.out.println("냠냠 성공");
    }
}