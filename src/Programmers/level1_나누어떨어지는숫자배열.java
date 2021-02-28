package Programmers;

import java.util.ArrayList;
import java.util.Collections;

public class level1_나누어떨어지는숫자배열 {

    public static void main(String[] args) {

        int arr[]={2,36,1,3};

        int divisor=1;

        ArrayList<Integer> answer = solution(arr,divisor);

        for(int k :answer){
            System.out.println(k);
        }

    }

    private static ArrayList solution(int[] arr, int divisor) {

        ArrayList<Integer> answer = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                answer.add(arr[i]);
            }
        }

        if(answer.size()==0){
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(-1);
            return ans;
        }else{
            Collections.sort(answer);
            return answer;
        }

    }


}
