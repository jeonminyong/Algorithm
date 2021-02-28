package Programmers_level2;

public class level2_다음큰숫자 {
    public static void main(String[] args) {
        int n = 78;

        int answer = solution(n);
        System.out.println("answer = " + answer);


    }

    private static int solution(int n) {

        int answer = 0;
        int cnt =1; //몫이 1인거 계산
        int tmp=n;
        while (tmp>1){
           if(tmp%2==1){
               cnt++;
           }
            tmp=tmp/2;
        }



        for(int i=n+1; i<=1000000; i++){
           int count =1;
           int test = i;
           while (test>1){
               if(test%2==1){
                   count++;
               }
               test=test/2;
           }
           if(cnt==count){
               answer=i;
               break;
           }
        }

        return answer;

    }

}
