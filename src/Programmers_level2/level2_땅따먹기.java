package Programmers_level2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class level2_땅따먹기 {

    public static void main(String[] args) {

        int[][] land={{4, 3, 2, 1}, {2, 2, 2, 1}, {6, 6, 6, 4}, {8, 7, 6, 5}};

        int answer = solution(land);
        System.out.println("answer = " + answer);

    }

    private static int solution(int[][] land) {

        int cont = land.length;
        int dp[][] = new int[cont][4];
        dp[0][0]=land[0][0];
        dp[0][1]=land[0][1];
        dp[0][2]=land[0][2];
        dp[0][3]=land[0][3];


        for(int i=1; i<cont; i++){
            dp[i][0]+=Math.max(dp[i-1][1],Math.max(dp[i-1][2],dp[i-1][3]))+land[i][0];
            dp[i][1]+=Math.max(dp[i-1][0],Math.max(dp[i-1][2],dp[i-1][3]))+land[i][1];
            dp[i][2]+=Math.max(dp[i-1][0],Math.max(dp[i-1][1],dp[i-1][3]))+land[i][2];
            dp[i][3]+=Math.max(dp[i-1][0],Math.max(dp[i-1][1],dp[i-1][2]))+land[i][3];
        }

        return Math.max(Math.max(Math.max(dp[cont-1][0],dp[cont-1][1]),dp[cont-1][2]),dp[cont-1][3]);
    }


}
