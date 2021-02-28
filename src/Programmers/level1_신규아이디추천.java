package Programmers;

public class level1_신규아이디추천 {
    public static void main(String[] args) {
    String str ="...!@BaT#*..y.abcdefghijklm";

    String new_id=solution(str);

    }

    private static String solution(String str) {

        for(int i=1; i<=7; i++){
            if(i==1){
                str=str.toLowerCase();
            }else if(i==2){
                String tmp="";
                for(int j=0; j<str.length(); j++){
                    int k = str.charAt(j);
                    int h = str.charAt(j)-'0';

                    if(k>=97 && k<=122){
                        tmp+=(char)k;
                    }else{
                        if(h>=0 && h<=9){
                            tmp+=h;
                        }else if(str.charAt(j)=='-'||str.charAt(j)=='_'||str.charAt(j)=='.'){
                            tmp+=str.charAt(j);
                        }
                    }
                }
                str=tmp;
            }else if(i==3){
                boolean chk=true;
                String tmp ="";
                for(int j=0; j<str.length(); j++){
                    if(str.charAt(j)=='.' && chk==true){
                        tmp+=str.charAt(j);
                        chk=false;
                    }else {
                        if(str.charAt(j)!='.'){
                            tmp+=str.charAt(j);
                            chk=true;
                        }
                    }
                }
                str=tmp;
            }else if(i==4){
                String tmp ="";
                if(str.charAt(0)=='.'){
                    for(int j=1; j<str.length(); j++){
                        tmp+=str.charAt(j);
                    }
                    str=tmp;
                }
                tmp ="";
                if(str.length()!=0 && str.charAt(str.length()-1)=='.'){
                    for(int j=0; j<str.length()-1; j++){
                        tmp+=str.charAt(j);
                    }
                    str=tmp;
                }
            }else if(i==5){
                if(str.length()==0){
                    str="a";
                }
            }else if(i==6){
                String tmp="";
                if(str.length()>=16){
                    for(int j=0; j<15; j++){
                        tmp+=str.charAt(j);
                    }
                    str=tmp;
                    if(str.length()!=0 && str.charAt(str.length()-1)=='.'){
                        tmp="";
                        for(int h=0; h<str.length()-1; h++){
                            tmp+=str.charAt(h);
                        }
                    }
                    str=tmp;
                }
            }else if(i==7){
                String tmp=str;
                if(tmp.length()<=2){
                    while(tmp.length()<3){
                        tmp+=str.charAt(str.length()-1);
                    }
                }
                str=tmp;
            }

        }
        return str;
    }
}
