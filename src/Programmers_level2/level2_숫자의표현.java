package Programmers_level2;


public class level2_숫자의표현 {

    public static void main(String[] args) {


        int n = 15;


        int answer = solution(n);

        System.out.println(answer);




    }

    private static int solution(int n) {
        int answer=0;

        for(int i=1; i<=n; i++){
            int total=0;
            for(int j=i; j<=n; j++){
                total+=j;
                if(total==n){
                    answer++;
                    break;
                }
                if(total>n){
                    break;
                }
            }
        }
        return answer;
    }

}
