package Programmers;

public class level1_x만큼간격이있는n개의숫자 {

    public static void main(String[] args) {

        int x =2;
        int n=5;

        long[] answer = new long[n];
        int idx=0;
        int tmp=x;
        for(int i=0; i<n; i++){
            answer[idx++]=x;
            x=x+tmp;
        }

        for(int i=0; i<n; i++){
            System.out.println(answer[i]);
        }






    }

}
