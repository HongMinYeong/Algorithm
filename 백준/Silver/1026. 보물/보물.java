import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        int[] arrA = new int[N];
        int[] arrB = new int[N];

        String[] tokens = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arrA[i] = Integer.parseInt(tokens[i]);
        }

        tokens = br.readLine().split(" ");
        for (int i = 0; i < arrB.length; i++) {
            arrB[i] = Integer.parseInt(tokens[i]);
        }

        Arrays.sort(arrA); //기본 -> 오름차순으로 정렬 (작은것부터)
        Arrays.sort(arrB);

        for (int i=0;i<N;i++){
            answer += arrA[i]*arrB[N-(i+1)];
        }


        ////////////////////// 정답 ////////////////////////////////////////////
        System.out.println(answer);
    }
}