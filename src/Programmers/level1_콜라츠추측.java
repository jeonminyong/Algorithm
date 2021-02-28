package Programmers;

public class level1_콜라츠추측 {

    public static void main(String[] args) {


        long n=1;
        boolean chk=true;
        int answer=0;
        if(n==1) {
        }
        while (chk){
            if(n%2==0){
                n=n/2;
            }else {
                n=n*3+1;
            }
            System.out.println(n);
            answer++;
            if(n==1){
                chk=false;
            }
            if(answer==500){
                answer=-1;
                chk=false;
            }
        }
        System.out.println(answer);
    }

}
