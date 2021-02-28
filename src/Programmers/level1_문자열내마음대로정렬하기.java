package Programmers;

public class level1_문자열내마음대로정렬하기 {
    public static void main(String[] args) {
        String s="pPoooyY";
        boolean chk = solutin(s);

    }

    private static boolean solutin(String s) {
        int p=0;
        int y=0;
        boolean answer = true;

        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='P' || s.charAt(i)=='p' ){
                p++;
            }else if(s.charAt(i)=='y'||s.charAt(i)=='Y'){
                y++;
            }
        }
        if(p!=y){
            answer=false;
        }
        return answer;
    }
}
