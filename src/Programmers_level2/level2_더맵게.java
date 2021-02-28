package Programmers_level2;

import java.util.PriorityQueue;

public class level2_더맵게 {

    public static void main(String[] args) {

        int[] scoville ={3,4,1,9,10,12};
        int K =7;

        int answer = solution(scoville,K);
     System.out.println(answer);
    }

    private static int solution(int[] scoville, int K) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int i=0; i<scoville.length; i++){
            queue.add(scoville[i]);
        }
        int answer = 0;
        boolean chk =true;
        while (queue.peek()<K){
            if(queue.size()<2){
                answer=-1;
                break;
            }
            int s1 =queue.poll();
            int s2 =queue.poll();
            queue.add(s1+(s2*2));
            answer++;
        }
        return answer;
    }
}
