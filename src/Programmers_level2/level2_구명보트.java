package Programmers_level2;

import java.util.ArrayList;
import java.util.Arrays;

public class level2_구명보트 {

    public static void main(String[] args) {

        int[] people={70, 50, 80, 50,10,20,30,40};
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

        int max=0;
        int answer=0;

        boolean check[] = new boolean[arr.size()];

        for(int i=0; i<arr.size(); i++){
            boolean chk =true;
            int idx = 0;
            int idy = 0;
            max=0;
            if(check[i]){
                continue;
            }
            for(int j=i+1; j<arr.size() ; j++){
                if(check[j]){
                    continue;
                }
                int total=arr.get(i)+arr.get(j);
                if(total<=limit){
                    chk=false;
                    if(total>max){
                        max=total;
                        idx=i;
                        idy=j;
                    }
                }
            }
            if(chk){
                check[i]=true;
                answer++;
            }else{
                check[idx]=true;
                check[idy]=true;
                answer++;
            }
        }

        return answer;
    }


}
