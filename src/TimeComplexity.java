public class TimeComplexity {
    int n;
    int[] a = new int[n];
    public static void function(int[] a, int n){
        System.out.println("hello");
        if(n == 0) return;
        function(new int[n/2], n/2);
    }
    public static void main(String[] args) {

    }
}
