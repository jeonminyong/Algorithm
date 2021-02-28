package Programmers_level2;

public class level2_전화번호목록 {

    public static void main(String[] args) {

        String[] phone_book={"12", "123", "1235"};

        boolean answer = solution(phone_book);
        System.out.println(answer);
    }

    private static boolean solution(String[] phone_book) {

        boolean answer = false;
        for(int i=0; i<phone_book.length; i++){
            String tmp = phone_book[i];
            for(int j=i+1; j<phone_book.length; j++){
                String s = phone_book[j];
                    boolean chk = true;
                    for(int k=0; k<Math.min(s.length(),tmp.length()); k++){
                        if(s.charAt(k)==tmp.charAt(k)){
                            chk=true;
                        }else {
                            chk=false;
                            break;
                        }
                    }
                    if(chk){
                        return false;
                    }
                }
           }
        return true;
    }
}
