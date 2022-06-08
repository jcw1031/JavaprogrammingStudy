import java.util.*;

abstract class Stack{
    abstract int length();
    abstract String pop();
    abstract boolean push(String ob);
}

class StringStack extends Stack{
    String[] stack=new String[length()];
    int tos=-1;
    int length(){
        return 5;
    }
    String pop(){
        if(tos<0) {
            System.out.println("스택 비어있음");
            return "";
        }
        else{
            String tmp=stack[tos];
            stack[tos--]=null;
            return tmp;
        }
    }
    boolean push(String ob){
        if(tos==length()){
            System.out.println("스택 꽉 참");
            return false;
        }
        else{
            stack[++tos]=ob;
            return true;
        }
    }
}

public class LegalPad {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringStack stack = new StringStack();

        System.out.println("문자열 입력 : ");
        for(int i=0;i<stack.length();i++){
            stack.push(s.next());
        }
        for(int i=0;i<stack.length();i++){
            System.out.print(stack.pop()+" ");
        }
    }
}