package JavaJava;
import java.util.*;

abstract class Shape{
    private Shape next;
    public Shape(){next = null;}
    public void setNext(Shape obj){next = obj;} //링크 연결
    public Shape getNext(){return next;}
    public abstract void draw();
}

class Line extends Shape{
    public void draw(){
        System.out.println("Line");
    }
}

class Rect extends Shape{
    public void draw(){
        System.out.println("Rect");
    }
}

class Circle extends Shape{
    public void draw(){
        System.out.println("Circle");
    }
}

public class GraphicEditorTest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int input=0;
        Shape shape=null;
        Shape shapeStart=null;
        Shape tmp;
        int length=0;

        while(input!=4){
            System.out.print("삽입 (1), 삭제 (2), 모두 보기 (3), 종료 (4) : ");
            input=s.nextInt();
            switch(input){
                case 1 -> {
                    System.out.print("도형 종류 - Line (1), Rect (2), Circle (3) : ");
                    switch(s.nextInt()){
                        case 1-> {
                            if(shape==null) {
                                shape=new Line();
                                shapeStart=shape;
                            }
                            else{
                                shape.setNext(new Line());
                                shape=shape.getNext();
                            }
                            length++;
                        }
                        case 2-> {
                            if(shape==null) {
                                shape=new Rect();
                                shapeStart=shape;
                            }
                            else{
                                shape.setNext(new Rect());
                                shape=shape.getNext();
                            }
                            length++;
                        }
                        case 3-> {
                            if(shape==null) {
                                shape=new Circle();
                                shapeStart=shape;
                            }
                            else{
                                shape.setNext(new Circle());
                                shape=shape.getNext();
                            }
                            length++;
                        }
                        default -> System.out.println("입력 잘못 함");
                    }
                }

                case 2-> {
                    if (shapeStart != null) {
                        System.out.print("삭제할 도형 위치 : ");
                        Shape picker = shapeStart;
                        tmp=shapeStart;
                        int count=s.nextInt();
                        for(int i=0;i<count;i++){
                            picker=picker.getNext();
                        }
                        for(int i=0;i<count-1;i++){
                            tmp=tmp.getNext();
                        }
                        tmp.setNext(picker.getNext());
                        picker=null;
                        length--;
                    }
                    else{
                        System.out.println("삭제할 도형이 없습니다.");
                    }
                }

                case 3-> {
                    tmp = shapeStart;
                    if(shapeStart!=null){
                        for(int i=0;i<length;i++){
                            tmp.draw();
                            tmp=tmp.getNext();
                        }
                    }
                }
                case 4->{
                    break;
                }
                default -> System.out.println("입력 잘못 함");
            }
        }
        System.out.println("종료합니다.");
    }
}
