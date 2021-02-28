package Programmers;

public class level1_시저암호 {
    public static void main(String[] args) {

        String s = "Zz";
        int n=25;
        String str = solution(s,n);
        System.out.println(str);


    }

    private static String solution(String s, int n) {

        int arr[] = new int[s.length()];
        int idx=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=' '){
                int tmp = s.charAt(i);
                for(int j=1; j<=n; j++ ){
                    tmp +=1;
                    if(tmp==123){
                        tmp=97;
                    }
                    if(tmp==91){
                        tmp=65;
                    }
                }
                arr[idx++]=tmp;
            }else{
                arr[idx++]=' ';
            }
        }
        String answer ="";
        for (int i=0; i<arr.length; i++){
            int tmp = arr[i];
            answer+=(char)tmp;
        }
        return answer;

    }
}
