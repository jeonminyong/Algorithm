package Programmers;

public class level1_이상한문자만들기 {
    public static void main(String[] args) {

        String s ="try hello world";
        String answer = solution(s);
        System.out.println(answer);
    }

    private static String solution(String s) {
        int idx=1;
        String answer = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                idx=1;
                answer+=" ";
                continue;
            }

            if(idx%2==1){
                String tmp =s.charAt(i)+"";
                answer+=tmp.toUpperCase();
                idx++;
            }else{
                String tmp =s.charAt(i)+"";
                answer+=tmp.toLowerCase();
                idx++;
            }
        }

        return answer;
    }

}
