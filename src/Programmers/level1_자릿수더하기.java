package Programmers;

public class level1_자릿수더하기 {

    public static void main(String[] args) {

        long N = 10000000000L;

        String N1 = N+"";
        int total[] = new int[N1.length()];

        for(int i=0; i<N1.length(); i++){
            String tmp = N1.charAt(i)+"";
            total[i]=Integer.parseInt(tmp);
        }


        int answer[] = new int[total.length];

        int idx=0;

        for(int i=total.length-1; i>=0; i--){
            answer[idx++]=total[i];
        }




    }

}
