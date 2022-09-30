package chapter13;

import java.io.*;
import java.util.*;

public class Week2Practice {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Scanner s = new Scanner(new FileInputStream("/Users/jcw/Coding/words.txt"));

        Vector<String> wordVector = new Vector<>();

        while(s.hasNext()){
            wordVector.add(s.nextLine());
        }

        while(true){
            boolean flag;
            String search;
            System.out.print("단어 : ");
            search = br.readLine();
            if(Objects.equals(search, "그만")) {
                System.out.println("종료합니다.");
                break;
            }
            for(int i=0;i<wordVector.size();i++){
                flag = true;
                String tmp = wordVector.get(i);
                for(int j = 0;j<search.length();j++){
                    if(tmp.length() < search.length()){
                        flag = false;
                        break;
                    }
                    if(tmp.charAt(j) != search.charAt(j)){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    System.out.println(tmp);
                }
            }
        }
    }
}