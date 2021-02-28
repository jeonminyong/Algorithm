package Programmers_level2;

import java.util.LinkedList;
import java.util.Queue;

public class level2_프린터 {
    public static void main(String[] args) {

        int[] priorities={2,1,3,2};
        int location=2;

        int answer = solution(priorities,location);
        System.out.println(answer);

    }

    private static int solution(int[] priorities, int location) {

        Queue<print> q = new LinkedList<>();
        int idx=0;
        for(int i=0; i<priorities.length; i++){
                q.add(new print(priorities[i],idx++));
        }

        int answer=1;

        while (!q.isEmpty()){
            print print = q.poll();
            boolean chk=true;

            for(print p : q ) {
                int tmp = p.getPriorities();
                if(print.getPriorities()<tmp){
                      q.add(print);
                      chk=false;
                      break;
                }
            }

            if(chk){
                if(print.getLocation()==location){
                    break;
                }else{
                    answer++;
                }
            }
        }
        return answer;

    }

    static class print{
        int priorities;
        int location;

        public print(int priorities, int location) {
            this.priorities = priorities;
            this.location = location;
        }

        public int getPriorities() {
            return priorities;
        }

        public void setPriorities(int priorities) {
            this.priorities = priorities;
        }

        public int getLocation() {
            return location;
        }

        public void setLocation(int location) {
            this.location = location;
        }
    }

}


