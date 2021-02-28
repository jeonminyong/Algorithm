package Programmers;

public class level1_핸드폰번호가리기 {
    public static void main(String[] args) {

        String phone_number="01033334444";

        String tmp1 = phone_number.substring(phone_number.length()-4,phone_number.length());

        String tmp2="";

        for(int i=0; i<phone_number.length()-4; i++){
            tmp2+="*";
        }

        System.out.println(tmp2+tmp1);




    }

}
