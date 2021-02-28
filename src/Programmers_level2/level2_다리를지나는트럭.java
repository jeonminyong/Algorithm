package Programmers_level2;

import java.util.LinkedList;
import java.util.Queue;

public class level2_다리를지나는트럭 {
    public static void main(String[] args) {

        int bridge_length=100;
        int weight = 10;
        int[] truck_weights ={7,4,5,6};

        int answer = solution(bridge_length,weight,truck_weights);
        System.out.println(answer);
    }

    private static int solution(int bridge_length, int weight, int[] truck_weights) {

        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();

        int total= 0;
        for(int i=0; i<truck_weights.length; i++){
            while (true){
                if(queue.isEmpty()){
                    queue.add(truck_weights[i]);
                    answer++;
                    total+=truck_weights[i];
                    break;
                }else if(queue.size()==bridge_length){
                    int k=queue.poll();;
                    answer++;
                    total-=k;
                }else {
                    if(total+truck_weights[i]>weight){
                        queue.add(0);
                    }else{
                        queue.add(truck_weights[i]);
                        answer++;
                        total+=truck_weights[i];
                        break;
                    }
                }
            }
        }
        return answer;
    }

}
