package chapter16;

import java.util.Stack;

class GStack<T>{
    Stack<T> stack = new Stack<>();

    public void push(T t){
        stack.add(t);
    }
    public T pop(){
        return stack.pop();
    }

    public boolean isEmpty(){
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}

public class PracticeStack {
    public static void main(String[] args) {
        GStack<String> stringStack = new GStack<>();
        stringStack.push("asdf");
        stringStack.push("zxcv");
        stringStack.push("qwer");

        while(!stringStack.isEmpty()){
            System.out.println(stringStack.pop());
        }

        GStack<Integer> intStack = new GStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        while(!intStack.isEmpty()){
            System.out.println(intStack.pop());
        }
    }
}
