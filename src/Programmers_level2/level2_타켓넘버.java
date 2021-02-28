package Programmers_level2;

public class level2_타켓넘버 {

    static int answer;

    public static void main(String[] args) {

        int[] numbers ={1,1,1,1,1};
        int target = 3;

        solution(numbers,target);
        System.out.println(answer);


    }

    private static int solution(int[] numbers, int target) {
        int total=0;
        int idx=0;
        dfs(numbers,total,target,idx,numbers.length);
        return 1;
    }

    private static void dfs(int[] numbers,int total,int target,int idx,int numberlen) {
        if(idx==numberlen){
            if(total==target){
                answer++;
            }
            return;
        }else{
            dfs(numbers,total+numbers[idx],target,idx+1,numberlen);
            dfs(numbers,total-numbers[idx],target,idx+1,numberlen);
        }
    }
}
