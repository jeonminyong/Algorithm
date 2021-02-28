package Programmers;

public class level1_하샤드수 {
    public static void main(String[] args) {
        int x = 10;

        String tmp =x+"";
        boolean answer = true;
        int total=0;
        for(int i=0; i<tmp.length(); i++){
            total+=tmp.charAt(i)-'0';
        }

        if(x%total==0){
            answer=true;
        }else {
            answer=false;
        }



    }


}
