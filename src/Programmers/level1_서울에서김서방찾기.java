package Programmers;

public class level1_서울에서김서방찾기 {

    public static void main(String[] args) {
        String s="Kim";
        String ss[]={"Jane", "Kim"};
        System.out.println(solution(ss));


    }

    private static String solution(String[] ss) {
        String answer = "";
        for(int i=0; i<ss.length; i++){
            if(ss[i].equals("Kim")){
                 answer="김성방은 "+i+"에 있다";
            }

        }

        return answer;
    }
}
