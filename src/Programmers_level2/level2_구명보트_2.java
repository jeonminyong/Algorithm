package Programmers_level2;

import java.util.ArrayList;
import java.util.Arrays;

public class level2_구명보트_2 {

    public static void main(String[] args) {

        int[] people={70, 80, 50};
        int limit=100;

        int answer = solution(people,limit);
        System.out.println(answer);


    }

    private static int solution(int[] people, int limit) {
        Arrays.sort(people);
        ArrayList<Integer> arr = new ArrayList<>();

        for (int person : people) {
            arr.add(person);
        }
        int answer=0;
        while (arr.size()>1){
            if((arr.get(0)+arr.get(arr.size()-1)<=limit)){
                arr.remove(0);
            }
            arr.remove(arr.size()-1);
            answer++;
        }
        if(arr.size()==1){
            answer++;
        }
       return answer;
    }


}
