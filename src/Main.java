import java.util.*;

public class Main{
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<10;i++){
            set.add(i);
        }
        System.out.println(set.add(4));
        System.out.println(set);
    }
}