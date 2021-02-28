package Programmers;

import java.util.ArrayList;

public class level1_키패드누르기 {

    public static void main(String[] args) {

        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand = "left";
        String result= "";
        int x = 10; //왼손
        int y = 11; //오른손

        int[] arr0 = {0,4,3,4,3,2,3,2,1,2,1,1};
        int[] arr2 = {3,1,0,1,2,1,2,3,2,3,4,4};
        int[] arr5 = {2,2,1,2,1,0,1,2,1,2,3,3};
        int[] arr8 = {1,3,2,3,2,1,2,1,0,1,2,2};

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==1||numbers[i]==4||numbers[i]==7){
                result+="L";
                x=numbers[i];
            }else  if(numbers[i]==3||numbers[i]==6||numbers[i]==9){
                result+="R";
                y=numbers[i];
            }else {
                if(numbers[i]==0){
                    if(arr0[x]<arr0[y]){
                        result+="L";
                        x=0;
                    }else if (arr0[x]>arr0[y]){
                        result+="R";
                        y=0;
                    }else {
                        if(hand.equals("right")){
                            result+="R";
                            y=0;
                        }else {
                            result+="L";
                            x=0;
                        }
                    }
                }else if(numbers[i]==2){
                    if(arr2[x]<arr2[y]){
                        result+="L";
                        x=2;
                    }else if (arr2[x]>arr2[y]){
                        result+="R";
                        y=2;
                    }else {
                        if(hand.equals("right")){
                            result+="R";
                            y=2;
                        }else {
                            result+="L";
                            x=2;
                        }
                    }
                }else if(numbers[i]==5){
                    if(arr5[x]<arr5[y]){
                        result+="L";
                        x=5;
                    }else if (arr5[x]>arr5[y]){
                        result+="R";
                        y=5;
                    }else {
                        if(hand.equals("right")){
                            result+="R";
                            y=5;
                        }else {
                            result+="L";
                            x=5;
                        }
                    }
                }else if(numbers[i]==8){
                    if(arr8[x]<arr8[y]){
                        result+="L";
                        x=8;
                    }else if (arr8[x]>arr8[y]){
                        result+="R";
                        y=8;
                    }else {
                        if(hand.equals("right")){
                            result+="R";
                            y=8;
                        }else {
                            result+="L";
                            x=8;
                        }
                    }
                }
            }
        }
        System.out.println(result);





    }


}
