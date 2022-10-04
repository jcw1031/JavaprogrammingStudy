package chapter13;

public class ExceptionExercises2 {
    public static void main(String[] args) {
        int[] arr = new int[3];

        try{
            arr[0] = 0;
            arr[1] = 1;
            arr[2] = 2;
            arr[3] = 3;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("배열의 인덱스 범위를 벗어났습니다.");
        }
    }
}
