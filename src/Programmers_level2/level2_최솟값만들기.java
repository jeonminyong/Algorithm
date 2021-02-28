package Programmers_level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class level2_최솟값만들기 {

    public static void main(String[] args) {
        int []A={1,4,2};
        int []B={5,4,4};

        int answer = solution(A,B);
        System.out.println(answer);





    }

    private static int solution(int[] a, int[] b) {

        Arrays.sort(a);
        Arrays.sort(b);

        ArrayList<Integer> ar = new ArrayList<>();

        for (int k :b) {
            ar.add(k);
        }

        Collections.reverse(ar);
        int answer=0;

        for(int i=0; i<a.length; i++){
           answer+=a[i]*ar.get(i);
        }


        return answer;
    }

}
