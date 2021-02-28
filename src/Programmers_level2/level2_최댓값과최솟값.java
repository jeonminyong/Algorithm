package Programmers_level2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class level2_최댓값과최솟값 {


    public static void main(String[] args) {


        String s="-1 -2 -3 -4";

        String answer = solution(s);
        System.out.println(answer);

    }

    private static String solution(String s) {

        String[] arr = s.split(" ");
        int a[] = new int[arr.length];
        int idx=0;
        for (int i=0;i<arr.length; i++){
            a[idx++]=Integer.parseInt(arr[i]);
        }
/*
        int min=999999999;
        int max=-999999999;
        for(int i=0; i<a.length; i++){
            if(min>a[i]){
                min=a[i];
            }

            if(max<a[i]){
                max=a[i];
            }
        }
*/
        Arrays.sort(a);

        String answer ="";
        answer+=a[0]+" ";
        answer+=a[a.length-1];

        return answer;
    }


}
