package Programmers;

public class level1_문자열다루기기본 {
    public static void main(String[] args) {
        String s="1374";
        boolean chk =solution(s);
        System.out.println(chk);
    }

    private static boolean solution(String s) {
        boolean answer = true;

        if(s.length()==4 || s.length()==6 ){
            for (int i=0; i<s.length(); i++){
                if(s.charAt(i)<'0' || s.charAt(i)>'9'){
                    answer=false;
                }
            }
        }else {
            answer=false;
        }

        return answer;

    }
}
