package Programmers;

public class level1_수박수박수박수박수박수 {

    public static void main(String[] args) {

        String answer="";
        int n=3;
        for(int i=1; i<=n; i++){
            if(i%2==1){
                answer+="수";
            }else{
                answer+="박";

            }
        }

        System.out.println(answer);


    }

}
