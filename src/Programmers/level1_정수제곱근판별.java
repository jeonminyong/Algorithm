package Programmers;

public class level1_정수제곱근판별 {

    public static void main(String[] args) {
        long n = 121;

        long answer =0;
        for(long i=1; i<=n; i++){
            if(i*i==n){
                answer=(i+1)*(i+1);
                break;
            }else {
                answer =-1;
            }

        }

    }


}
