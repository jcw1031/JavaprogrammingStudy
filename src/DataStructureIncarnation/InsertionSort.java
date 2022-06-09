package DataStructureIncarnation;

public class InsertionSort {
    final int count=10;
    int[] array_data = {14, 5, 43, 27, 18, 31, 37, 88, 6, 35};

    public void insertSort(){
        int i;
        int tmp;
        int interCnt;
        for(i=1;i<count;i++){
            tmp=array_data[i];
            interCnt=i-1;
            while(interCnt>=0 && tmp<array_data[interCnt]){
                array_data[interCnt+1]=array_data[interCnt];
                interCnt=interCnt-1;
            }
            array_data[interCnt+1]=tmp;
            System.out.print("pass = "+i);
            write_2();
        }
    }

    public void write_head_1(){
        System.out.println("\n           ---------------------------");
        System.out.println("           Source data  printing .....");
        System.out.println("           ---------------------------");
    }
    public void write_head_2(){
        System.out.println("\n           ---------------------------");
        System.out.println("           Insertion sort result .....");
        System.out.println("           ---------------------------\n");
    }

    public void write_1(){
        int i;
        System.out.print("         ");
        for(i=0;i<count;i++){
            System.out.print("\t"+array_data[i]);
        }
        System.out.println();
    }
    public void write_2(){
        int i;
        for(i=0;i<count;i++){
            System.out.print("\t"+array_data[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        is.write_head_1();
        is.write_1();
        is.insertSort();
        is.write_head_2();
        is.write_2();
    }
}
