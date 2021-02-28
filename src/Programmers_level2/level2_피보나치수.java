package Programmers_level2;

public class level2_피보나치수 {

    public static void main(String[] args) {

        int n=5;

        int answer = solution(n);

        System.out.println(answer);



    }

    private static int solution(int n) {
        int dp[]= new int[n+1];
        dp[0]=0;
        dp[1]=1;


        for(int i=2; i<=n; i++){
            dp[i]=(dp[i-1]%1234567+dp[i-2]%1234567)%1234567;
        }

        int answer = dp[n];
        return answer;

    }


}

