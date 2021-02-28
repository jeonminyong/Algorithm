package Programmers;

public class level1_문자열을정수로바꾸기 {
    public static void main(String[] args) {

        String s = "-1234";
        int answer = solution(s);
        System.out.println(answer);



    }

    private static int solution(String s) {

        if(s.charAt(0)=='-'){
            String str="";
            for(int i=1; i<s.length(); i++){
                str+=s.charAt(i);
            }
            return Integer.parseInt(str)*-1;
        }else if(s.charAt(0)=='+'){
            String str="";
            for(int i=1; i<s.length(); i++){
                str+=s.charAt(i);
            }
            return Integer.parseInt(str);
        }else{
            String str="";
            for(int i=0; i<s.length(); i++){
                str+=s.charAt(i);
            }
            return Integer.parseInt(str);
        }

    }

}
