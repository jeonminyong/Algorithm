package Programmers_level2;

import java.util.ArrayList;

public class level2_JadenCase문자열만들기 {
    public static void main(String[] args) {


        String s = "for the last week";
        String answer = solution(s);
        System.out.println("answer = " + answer);

    }

    private static String solution(String s) {
        String lowers =s.toLowerCase();
        Boolean chk =false;
        String answer="";
        String tmp1 =lowers.charAt(0)+"";
        answer+=tmp1.toUpperCase();
        for(int i=1; i<lowers.length(); i++){
            if(lowers.charAt(i)==' '){
                answer+=" ";
                chk=true;
            }else if(chk==true){
                String tmp = lowers.charAt(i)+"";
                answer+=tmp.toUpperCase();
                chk=false;
            }else{
                answer+=lowers.charAt(i)+"";
            }
        }

    return answer;



    }

}
