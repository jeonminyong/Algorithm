package Programmers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class level1_문자열내림차순으로배치하기 {
    public static void main(String[] args) {
        String s="ABDCEFvr";
        System.out.println(solution(s));
    }

    private static String solution(String s) {

        ArrayList<Character> arr = new ArrayList<Character>();

        for(int i=0; i<s.length(); i++){
            System.out.println(s.charAt(i)-'0');
            arr.add(s.charAt(i));
        }
        Collections.sort(arr);
        Collections.reverse(arr);
        String answer="";

        for(int i=0; i<arr.size(); i++){
            answer+=arr.get(i);
        }


        return answer;
    }

}
