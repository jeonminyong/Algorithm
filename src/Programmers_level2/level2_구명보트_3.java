package Programmers_level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class level2_구명보트_3 {

    public static void main(String[] args) {

        int[] people={70, 50, 80, 50};
        int limit=100;

        int answer = solution(people,limit);
        System.out.println(answer);


    }

    private static int solution(int[] people, int limit) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());


        for (int person : people) {
            queue.add(person);
            priorityQueue.add(person);
        }

        int answer=0;
        while (!priorityQueue.isEmpty() && !queue.isEmpty()){
            int min= queue.peek();
            int max= priorityQueue.peek();

            if(min+max<=limit){
                queue.poll();
                priorityQueue.poll();
            }else{
                priorityQueue.poll();
            }
            answer++;
        }
       return answer;
    }


}
