package Programmers;

import java.util.ArrayList;

public class level1_같은숫자는싫어 {

    public static void main(String[] args) {
        int arr[] = {1,1,3,3,0,1,1};

        ArrayList<Integer> answer = solution(arr);
        for(int i=0; i<answer.size(); i++){
            System.out.println(answer.get(i));
        }

    }

    private static ArrayList solution(int[] arr) {

        ArrayList<Integer> ans = new ArrayList<>();
        int tmp = arr[0];
        ans.add(tmp);
        int idx=1;
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=tmp){
                ans.add(arr[i]);
                tmp=arr[i];
            }
        }
        return ans;
    }

}
