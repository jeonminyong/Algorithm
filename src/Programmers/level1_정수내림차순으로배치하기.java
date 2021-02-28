package Programmers;

public class level1_정수내림차순으로배치하기 {

    public static void main(String[] args) {

        long n = 2132132132132132l;
        long k = solution(n);
        System.out.println(k);
    }

    private static long solution(long n) {
        int answer = 0;

        int arr[] = new int[10];
        while (n != 0) {
            answer = (int) (n % 10);
            arr[answer]++;
            n /= 10;
        }

        String tmp ="";

        for(int i=9; i>=0; i--){
            int idx = arr[i];
            for(int j=idx; j>0; j--){
                tmp+=i;
            }
        }
        long k =Long.parseLong(tmp);
        return k;
    }

}
