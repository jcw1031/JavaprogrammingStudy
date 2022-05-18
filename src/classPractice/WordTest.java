package classPractice;
import java.util.*;

import java.util.ArrayList;

class Word{
    String eng, kor;

    public Word(String eng, String kor){
        this.eng=eng; this.kor=kor;
    }

    public String getEng(){
        return eng;
    }
    public String getKor(){
        return kor;
    }
}
public class WordTest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String search;
        ArrayList<Word> list= new ArrayList<>();
        list.add(new Word("Java", "자바"));
        list.add(new Word("Network", "네트워크"));
        list.add(new Word("AI", "인공지능"));
        list.add(new Word("KNU", "공주대학교"));
        list.add(new Word("Korea", "대한민국"));

        while(true){
            System.out.println("searching(exit : quit) : ");
            search=s.next();
            if(search.equals("quit")) {
                System.out.println("종료 합니다.");
                break;
            }
            if(!list.contains(search)){
                System.out.println("사전에 없는 단어");
            }
            for(Word c : list){
                if(c.eng.equals(search))
                    System.out.println(c.eng+" -> "+c.kor);
            }
        }
    }

}
