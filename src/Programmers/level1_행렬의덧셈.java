package Programmers;

public class level1_행렬의덧셈 {

    public static void main(String[] args) {
        int arr1[][]={{1},{2}};
        int arr2[][]={{3},{4}};

        int cnt = arr1[0].length;


        int[][] answer = new int[arr1.length][cnt];


        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<cnt; j++){
                answer[i][j]=arr1[i][j]+arr2[i][j];
            }
        }





    }

}
