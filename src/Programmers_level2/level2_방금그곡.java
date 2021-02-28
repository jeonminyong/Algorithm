package Programmers_level2;

public class level2_방금그곡 {

    public static void main(String[] args) {

        String m ="ABC";
        String musicinfos[]={"23:40,22:50,HI,ABC#ABC"};

        String answer = solution(m,musicinfos);
        System.out.println("answer = " + answer);

    }

    private static String solution(String m, String[] musicinfos) {
        String m1= changeString(m);
        int answer_time=0;
        String answer ="";

        for(int i=0; i<musicinfos.length; i++){
            String arr[] = musicinfos[i].split(",");
            String s1 = arr[0].substring(0,2);
            String s2 = arr[1].substring(0,2);
            String bun1 =arr[0].substring(arr[0].length()-2,arr[0].length());
            String bun2 =arr[1].substring(arr[1].length()-2,arr[1].length());
            int a = Integer.parseInt(s2)*60+Integer.parseInt(bun2);
            int b = Integer.parseInt(s1)*60+Integer.parseInt(bun1);
            int tmp = a-b;

            String text = changeString(arr[3]);
            String total="";

            for (int j =0; j <tmp; j++) {
                total+=text.charAt(j%text.length());
            }


            if(total.contains(m1)){
                if(answer_time<tmp){
                    answer_time=tmp;
                    answer=arr[2];
                }
            }

        }
        if(answer.length()==0){
            return "(None)";
        }else {
            return answer;
        }
    }

    private static String changeString(String m) {
        //C, C#, D, D#, E, F, F#, G, G#, A, A#, B
        //   H      I         J      k      l
        m=m.replace("C#","H");
        m=m.replace("D#","I");
        m=m.replace("F#","J");
        m=m.replace("G#","K");
        m=m.replace("A#","L");

        return m;
    }


}
