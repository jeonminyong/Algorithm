package Programmers_level2;

public class level2_카펫 {
    public static void main(String[] args) {

        int brown =10;
        int yellow =2;

        int[] answer =solution(brown,yellow);



    }

    private static int[] solution(int brown, int yellow) {

        int[] answer = new int[2];

        for(int i=1; i<brown+yellow; i++){
            if((brown+yellow)%i==0){
                int a = i;
                int b = (brown+yellow)/i;
                if(brown==(a+b)*2-4){
                    answer[0]=Math.max(a,b);
                    answer[1]=Math.min(a,b);
                    break;
                }
            }
        }
        return answer;
    }
}
