package Programmers_level2;

public class level2_조이스틱 {
    public static void main(String[] args) {

        String name = "AABAAAAAAABBB";

        int answer = solution(name);
        System.out.println(answer);


    }

    private static int solution(String name) {

        char[] ch = new char[name.length()];
        char[] a = new char[name.length()];

        int idx=0;
        int idy=0;
        for(int i=0; i<name.length(); i++){
            ch[idx++]=name.charAt(i);
            a[idy++]='A';
        }

        String tocopyname ="";

        int answer=0;

        //수정해야하는 문자 선택하는 방법 <  > 커서로 최소 횟수

        int cur =0; //현재 커서의 위치
        for(int i=0; i<name.length(); i++){
            int minsideleft = 0;
            int minsideright = 0;

            int minup = 0;
            int mindown = 0;

            if(ch[i]!=a[i]){//만약 A가 아니면
                //i 변경해야하는 커서의 위치  cur 에서 i 까지 갈수 있는 최소의 걸이가 answer 저장되면 된다.
                int tmp1 =cur;
                while(cur!=i){ // 오른쪽으로 가는 경우
                    cur+=1;
                    minsideright++;
                }
                cur=tmp1;
                while(cur!=i){ // 왼쪽으로 가는 경우
                    cur-=1;
                    if(cur<0){
                        cur=name.length()-1; //음수가 되면 마지막으로 이동
                    }
                    if(ch[cur]!=a[cur]){

                    }
                    minsideleft++;
                }

                if(minsideleft>minsideright){
                    answer+=minsideright;
                }else {
                    answer+=minsideleft;
                }
                //수정하야하는 문자 최소 선택 ^ 다운키로
                char tmp = a[i];

                while(tmp!=ch[i]){ //위쪽으로
                    tmp+=1;
                    minup++;
                }
                tmp = a[i];
                while(tmp!=ch[i]){ //아래 쪽으로
                    if(tmp=='A'){
                        tmp='Z';
                    }else{
                        tmp-=1;
                    }
                    mindown++;
                }

                if(minup>mindown){
                    answer+=mindown;
                }else {
                    answer+=minup;
                }
            }
        }

        //AABAAAAAAABBB  -> -> ^ B 만들고 <- <- <- ^ <- ^ <- ^  이렇게 가야하는데
        //-> -> ^ <-  <- <- <- <- ^ -> ^ -> ^ 이렇게 감 ㅠ ㅠ  처리를 못하겠어..




        return answer;

    }

}
