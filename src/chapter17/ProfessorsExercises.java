package chapter17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ProfessorsExercises {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String[] input = {"Apple", "Banana", "Mango", "Pear", "Grape"};

        for(int i=0;i<input.length;i++){
            list.add(input[i]);
        }

        System.out.println(list.indexOf("Mango"));
    }
}
