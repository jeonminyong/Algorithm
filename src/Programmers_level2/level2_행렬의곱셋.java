package Programmers_level2;

public class level2_행렬의곱셋 {

    public static void main(String[] args) {

    int[][] arr1={{1,4},{3,2},{4,1}};
    int[][] arr2={{3,3},{3,3}};

    int[][] answer = solution(arr1,arr2);
        for(int i=0; i<answer.length; i++){
            for(int j=0; j<answer[i].length; j++){
                System.out.print(answer[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2[0].length; j++){
                for (int h=0; h<arr1[0].length; h++){
                    answer[i][j]+=arr1[i][h] * arr2[h][j];
                }
            }
        }



        return answer;
    }

}
