import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine()); //운동기구 갯수
        long[] M = new long[N];

        String[] tokens = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            M[i] = Long.parseLong(tokens[i]);
        }
        Arrays.sort(M); //정렬
        ////////////////////// 정답 ////////////////////////////////////////////
        long max;
        if(N%2==0){
            //운동기구의 갯수가 짝수일때
            max = M[0]+M[N-1];
            for(int i=0;i<N/2;i++){
                if(max<M[i]+M[N-1-i]){
                    max = M[i]+M[N-1-i];
                }
            }
        }else{
            //운동기구의 갯수가 홀수 일때
            max = M[N-1];
            for(int i=0;i<N/2;i++){
                if(max<M[i]+M[N-1-(i+1)]){
                    max = M[i]+M[N-1-(i+1)];
                }
            }
        }
        System.out.println(max);

    }
}