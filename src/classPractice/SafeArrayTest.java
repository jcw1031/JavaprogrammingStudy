package classPractice;
class SafeArray{
    private int a[];
    public int length;

    public SafeArray(int lenth){
        this.length=lenth;
        a=new int[lenth];
    }
    public void put(int index, int value){
        if(index>(length-1)){
            System.out.println("인덱스 초과 : "+index);
            return;
        }
        a[index]=value;
    }

}
public class SafeArrayTest<i> {
    public static void main(String[] args) {
        SafeArray array=new SafeArray(3);
        for(int i=0;i<((array.length)+1);i++){
            array.put(i, i*10);
        }
    }
}
