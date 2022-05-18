package classPractice;
class Box{
    public int width;
    public int height;
    public int depth;
    public Box(int w, int h, int d){
        width=w;
        height=h;
        depth=d;
    }
    public boolean equals(Box box){
        return (this.width==box.width && this.height==box.height && this.depth==box.depth);
    }
}
class A{
    private int i;
    protected char c;
    public int f;
    private void testA(){
        i=3;
        c='a';
        f=1;
    }
}
class B extends A{
    int j;
    void testB(){


    }
}
public class IngeritanceTest {
    public static void main(String[] args) {
        Box b1=new Box(10, 20, 30);
        Box b2 = new Box(10, 20, 30);
        Box b3=b2;
        System.out.println(b1.equals(b2)?"b1과 b2는 논리적 같음":"b1과 b2는 논리적 안 같음");
        System.out.println(b1==b2?"b1 and b2 physically same": "b1 and b2 physically not same");
        System.out.println(b2.equals(b3)?"b2 and b3 logically same":"b2 and b3 logically not same");
        System.out.println(b2==b3?"b2 and b3 physically same":"b2 and b3 physically not same");
    }
}
