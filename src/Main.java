import java.util.*;

public class Main{
    long num = 0; //10진수 저장하는 변수
    private String bin = ""; //2진수 저장하는 변수
    private String hex = ""; //16진수 저장하는 변수
    private long temp=0; //hex, bin 문자열에 추가하기 전 정수형으로 저장하기 위한 용도
    private int count; //for문 반복 횟수 결정하기 위한 변수
    private String sub = ""; //입력받은 2진수, 16진수에서 계산할 일부분을 저장하는 용도
    private int exponent=0; //지수부로 사용

    public void hexToNum(String hex){
        count=hex.length();
        temp=0;
        exponent=0;
        for(int i=count;i>0;i--){ //hex 문자열 길이부터
            if(Character.isAlphabetic(hex.charAt(i-1))){ //hex 문자열의 i-1 인덱스에 있는 값이 알파벳이면 수행
                temp+=(hex.charAt(i-1)-55)*Math.pow(16, exponent); //아스키 코드 이용. 16의 exponent 승과 hex의 i-1 인덱스에 있는 값을 곱한 결과를 temp에 더함
                exponent++;
            }
            else{
                temp+=(hex.charAt(i-1)-48)*Math.pow(16, exponent); //아스키 코드 이용. 위와 동일
                exponent++;
            }
        }
        this.num=temp; //temp 값을 num에 저장
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Main m = new Main();
        m.hexToNum(s.next());
        System.out.println(m.num);
    }
}

