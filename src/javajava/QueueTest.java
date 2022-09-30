package javajava;
import java.util.*;

interface Queue{
    boolean isEmpty(); //큐가 비어 있는지 검사
    void enQueue(int x); //큐에 데이터 삽입
    int deQueue(); //큐에서 데이터 삭제(출력)
}

class Structure implements Queue{
    int[] queue = new int[50];
    int front=0;
    int rear=0;

    @Override
    public boolean isEmpty() {
        if(front==rear) return true;
        else return false;
    }

    @Override
    public void enQueue(int x) {
        queue[rear++]=x;
    }

    @Override
    public int deQueue() {
        int tmp = queue[front];
        queue[front++]=0;
        return tmp;
    }
}

public class QueueTest {
    public static void main(String[] args) {
        Structure q = new Structure();
        Scanner s = new Scanner(System.in);

        String input;
        boolean w = true;
        while(w){
            System.out.print("(삽입 : 삽입할 수 입력, 삭제 : 'delete' 입력, 전체 삭제 : 'delete all' 입력, 종료 : 'exit' 입력  >>  ");
            input=s.nextLine();

            switch(input){
                case "delete" -> {
                    if(q.isEmpty()){
                        System.out.println("데이터 없음");
                    }
                    else
                        q.deQueue();
                }
                case "delete all" -> {
                    for(int i=q.front;i<q.rear;i++){
                        if(q.isEmpty()) {
                            System.out.println("데이터가 없습니다.");
                            break;
                        }
                        else{
                            System.out.println(q.deQueue()+"\t삭제 : "+(q.rear-q.front)+"개 데이터 존재");
                        }
                    }
                }
                case "exit" ->{w=false;}
                default -> {
                    q.enQueue(Integer.parseInt(input));
                }
            }
        }
        /*for(int i=0;i<10;i++){
            q.enQueue((int)(Math.random()*100));
            System.out.println(q.queue[i]+"\t삽입 : "+(q.rear-q.front)+"개 데이터 존재");
        }
        for(int i=q.front;i<q.rear;i++){
            if(q.isEmpty()) {
                System.out.println("데이터가 없습니다.");
                break;
            }
            else{
                System.out.println(q.deQueue()+"\t삭제 : "+(q.rear-q.front)+"개 데이터 존재");
            }
        }*/
    }
}