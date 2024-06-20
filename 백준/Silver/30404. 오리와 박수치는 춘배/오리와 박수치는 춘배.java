import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] sizeTokens = br.readLine().split(" ");
        ////////////////////// 입력 ////////////////////////////////////////////
        int N = Integer.parseInt(sizeTokens[0]);
        int K = Integer.parseInt(sizeTokens[1]);
        int answer = 0;

        int[] duck = new int[N];
        String[] tokens = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            duck[i] = Integer.parseInt(tokens[i]);
        }

        ////////////////////// 풀이 ////////////////////////////////////////////
        int temp =0;
        for (int i = 0; i < N; i++) {
            answer++;
            if(temp>=duck[i]) {
                answer--;
            }else{
                temp = duck[i]+K;
            }
        }
        ////////////////////// 정답 ////////////////////////////////////////////
        System.out.println(answer);

    }
}