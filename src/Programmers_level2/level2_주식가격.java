package Programmers_level2;

import java.util.ArrayList;

public class level2_주식가격 {
    public static void main(String[] args) {


        int prices[]={1,2,3,2,3};
        ArrayList<Integer> arr =solution(prices);
        for(int k : arr){
            System.out.println(k);
        }

    }

    private static ArrayList solution(int[] prices) {
        int answer =0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<prices.length; i++){
            answer =0;
            for (int j=i+1; j<prices.length; j++){
                if(prices[i]<=prices[j]){
                    answer++;
                }else{
                    answer++;
                    break;
                }
            }
            if(i==prices.length-1){
                answer=0;
            }

            arr.add(answer);
        }
        return arr;

    }


}
