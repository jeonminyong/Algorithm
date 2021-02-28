package Programmers_level2;

public class level2_방금그곡_승진 {
    public static void main(String[] args) {

        String m ="ABC";
        String musicinfos[]={"23:40,22:50,HI,ABC#ABC"};

        String answer = solution(m,musicinfos);
        System.out.println("answer = " + answer);

    }
    public static String solution(String m, String[] musicinfos) {
        String answer = "";
        int cnt = 0;

        for(int i=0; i<m.length(); i++){
            if(m.charAt(i) == '#') ++cnt;
        }
        m = makeString(m.length()-cnt, m);


        int max = 0;
        for(int i=0; i< musicinfos.length; i++){
            String[] info = musicinfos[i].split(",");

            String s1 = info[0].substring(0,2);
            String s2 = info[1].substring(0,2);
            String bun1 =info[0].substring(info[0].length()-2,info[0].length());
            String bun2 =info[1].substring(info[1].length()-2,info[1].length());

            int a = Integer.parseInt(s2)*60+Integer.parseInt(bun2);
            int b = Integer.parseInt(s1)*60+Integer.parseInt(bun1);
            int totalTime = a-b;
            String make = makeString(totalTime, info[3]);
            make += make;


            if(make.contains(m)){
                if(max < totalTime){
                    max = totalTime;
                    answer = info[2];
                }
            }
        }

        if(answer.equals("")) answer = "(None)";

        return answer;
    }

    public static String makeString(int cnt, String s){
        int mod = s.length();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(cnt > 0){
            if(s.charAt((i+1)%mod) == '#') {
                sb.append(s.charAt(i%mod) - 'A');
                i++;
            }else{
                sb.append(s.charAt(i%mod));
            }
            ++i;
            --cnt;
        }
        return sb.toString();
    }


}
