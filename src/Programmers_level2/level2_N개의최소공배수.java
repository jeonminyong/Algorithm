package Programmers_level2;

import java.util.Arrays;

public class level2_N개의최소공배수 {

    public static void main(String[] args) {


        int arr[]={2,6,8,14};
        int result = solution(arr);
        System.out.println(result);

    }

    private static int solution(int[] arr) {
        int lcmcnt =arr[0];
        for(int i=1; i<arr.length; i++){
            lcmcnt=lcm(arr[i],lcmcnt);
        }
        return lcmcnt;
    }

    private static int lcm(int i, int lcmcnt) {
        return i*lcmcnt/gdc(i,lcmcnt);
    }

    private static int gdc(int i, int lcmcnt) {
        while (lcmcnt!=0){
            int tmp =i%lcmcnt;
            i=lcmcnt;
            lcmcnt=tmp;
        }
        return i;
    }

}
