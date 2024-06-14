import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i=0;i<T;i++){
            int N = Integer.parseInt(br.readLine());

        int[] arrA = new int[N];
        int[] arrB = new int[N];


        String[] tokens = br.readLine().split(" ");
        for (int j = 0; j < N; j++) {
            arrA[j] = Integer.parseInt(tokens[j]);
        }


        Arrays.sort(arrA); //기본 -> 오름차순으로 정렬 (작은것부터)

            // 홀수 번째 인덱스에는 arrA의 짝수 번째 원소를, 짝수 번째 인덱스에는 arrA의 홀수 번째 원소를 거꾸로 채운다.
            int left =0;
            int right = N-1;
            for (int j = 0; j < N; j++) {
                if (j%2==0){
                    //홀수 인덱스라면
                    arrB[left] = arrA[j];
                    left++;
                }else{
                    //짝수 인덱스라면
                    arrB[right] = arrA[j];
                    right--;
                }
            }


            // 정렬하고 난 이후 난이도 구하기
            int maxNumber =  Math.abs(arrB[0]-arrB[N-1]);

            for (int j = 1; j < N; j++) {
                maxNumber = Math.max(maxNumber, Math.abs(arrB[j] - arrB[j - 1]));
            }


            ////////////////////// 정답 ////////////////////////////////////////////
        System.out.println(maxNumber);
    }

    }
}