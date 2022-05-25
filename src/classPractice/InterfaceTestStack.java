package classPractice;
import java.util.*;

interface Istack{
    void push(int item);
    int pop();
}
class FixedStack implements Istack{
    private int stack[];
    private int tos;
    FixedStack(int size){
        stack=new int[size];
        tos=-1;
    }
    public void push(int item){
        if(tos==stack.length-1){
            System.out.println("overflow");
        }
        else
            stack[++tos]=item;
    }
    public int pop(){
        if(tos<0){
            System.out.println("underflow");
            return 0;
        }
        else
            return stack[tos--];
    }
}
public class InterfaceTestStack {
    public static void main(String[] args) {
        Random r=new Random();
        FixedStack mystack1=new FixedStack(10);
        for(int i=0;i<10;i++){
            mystack1.push(r.nextInt(10));
        }
        System.out.println("스택 : mystack1");
        for(int i=0;i<10;i++){
            System.out.print(mystack1.pop()+"\t");
        }
    }
}
