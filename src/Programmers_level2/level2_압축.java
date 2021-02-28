package Programmers_level2;

import java.util.ArrayList;

public class level2_압축 {

    public static void main(String[] args) {

        String msg ="KAKAO";
        ArrayList<Integer> answer = solution(msg);
        for (int i : answer) {
            System.out.println("답 = " + i);
        }
    }

    private static ArrayList solution(String msg) {
        ArrayList<String> arrayList = new ArrayList<String>();
        //1부터니까 쓰레기 값 넣어주고
        arrayList.add("0");
        int tmp='A';
        for(int i=1; i<=26; i++){
            arrayList.add(String.valueOf((char) tmp++));
        }
        ArrayList<Integer> answer = new ArrayList<>();

        String temp="";
        int idx =0;
        for(int i=0; i<msg.length(); i++){
            idx++;
            temp += String.valueOf(msg.charAt(i));
            boolean chk =false;
            for (String s : arrayList) {
                if(s.equals(temp)){
                    chk=true;
                    break;
                }
            }

            if(chk==false){
                String k = temp.substring(0,temp.length()-1);
                for(int j=0; j<arrayList.size(); j++){
                    if(k.equals(arrayList.get(j))){
                        answer.add(j);
                    }
                }
                arrayList.add(temp);
                temp="";
                System.out.println("i = " + i);
                System.out.println("idx = " + idx);
                i=i-idx+1;
                idx=0;
            }
        }

        return answer;
    }


}
