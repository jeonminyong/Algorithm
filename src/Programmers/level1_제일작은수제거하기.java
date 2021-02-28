package Programmers;

import java.util.ArrayList;
import java.util.Collections;

public class level1_제일작은수제거하기 {
    public static void main(String[] args) {

        int arr[]={4,3,2,1,1,5,6,7,8,9,10,11,12};

        int ans[]= solution(arr);
        for (int i=0; i<ans.length; i++){
            System.out.println(ans[i]);
        }


    }

    private static int[] solution(int[] arr) {
        ArrayList<Integer> array = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            array.add(arr[i]);
        }
        Collections.sort(array);
        Collections.reverse(array);

        ArrayList<Integer> array2 = new ArrayList<>();

        int tmp = array.get(array.size()-1);

        array = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            array.add(arr[i]);
        }


        for(int i=0; i<array.size(); i++){
            if(tmp!=array.get(i)){
                array2.add(array.get(i));
            }
        }

        if(array2.size()!=0){
            int answer[]=new int[array2.size()];
            int idx=0;
            for(int i=0; i<array2.size(); i++){
                answer[idx++]=array2.get(i);
            }
            return answer;
        }else{
            int answer[]={-1};
            return answer;
        }
    }

}
