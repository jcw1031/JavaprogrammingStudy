package classPractice;
import java.util.*;

class Player{
    Scanner s = new Scanner(System.in);
    private String name;
    private String word;

    public Player(String n){
        this.name=n;
    }
    public void setWord(String w){
        this.word=w;
    }
    public void setName(String n){
        this.name=n;
    }
    public String getWord(){
        return word;
    }
    public String getName(){
        return name;
    }
    public void input(){
        System.out.print(this.name+" : ");
        setWord(s.next());
    }
}

public class WordGameApp {
    static Scanner s = new Scanner(System.in);

    Player[] p1;
    public WordGameApp(){}

    private void createPlayers(){
        int n;
        System.out.print("게임에 참가하는 인원 수 : ");
        n=s.nextInt();
        p1 = new Player[n];
        run(n);
    }

    public void run(int num){
        for(int i=0;i<num;i++){
            System.out.print("참가자 이름 : ");
            this.p1[i]=new Player(s.next());
        }
        String startWord = "와이파이", startText, endText, word;
        boolean con=true;
        System.out.println("시작 단어는 '"+ startWord +"'입니다.");
        endText = startWord.substring(startWord.length()-1);
        while(con){
            for (Player player : p1) {
                player.input();
                word = player.getWord();
                startText = word.substring(0, 1);
                if (!endText.equals(startText)) {
                    con = false;
                    System.out.println(player.getName() + "이(가) 졌습니다.");
                    break;
                }
                endText = word.substring(word.length() - 1);
            }
        }
    }
    public static void main(String[] args) {
        WordGameApp game1=new WordGameApp();
        game1.createPlayers();
    }
}

