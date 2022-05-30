package JavaJava;

interface Queue{
    boolean isEmpty(); //큐가 비어 있는지 검사
    void Enqueue(int x); //큐에 데이터 삽입
    int Dequeue(); //큐에서 데이터 삭제(출력)
}

class Structure implements Queue{
    int[] queue = new int[50];
    int index = 0;

    @Override
    public boolean isEmpty() {
        if(index==0) return true;
        else return false;
    }

    @Override
    public void Enqueue(int x) {
        queue[index++]=x;
    }

    @Override
    public int Dequeue() {
        return queue[--index];
    }
}
public class QueueTest {
    public static void main(String[] args) {
        Structure q = new Structure();
        for(int i=0;i<10;i++){
            q.Enqueue(i);
            System.out.println(i+" 삽입 : "+q.index+"개 데이터 존재");
        }
        for(int i=0;i<15;i++){
            if(q.isEmpty()) {
                System.out.println("데이터가 없습니다.");
                break;
            }
            else{
                System.out.println(q.Dequeue()+" 삭제 : "+q.index+"개 데이터 존재");
            }
        }
    }
}
