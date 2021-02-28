package Programmers;

public class level1_내적 {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int b[]={-3,-1,0,2};

        int answer = solution(a,b);
        System.out.println(answer);


    }

    private static int solution(int[] a, int[] b) {
        int total=0;
        for(int i=0; i<a.length; i++){
            total+=a[i]*b[i];
        }
        return total;

    }
}
