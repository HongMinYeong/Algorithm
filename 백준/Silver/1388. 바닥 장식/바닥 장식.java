import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] sizeTokens = br.readLine().split(" ");
        ////////////////////// 입력 ////////////////////////////////////////////
        int N = Integer.parseInt(sizeTokens[0]);
        int M = Integer.parseInt(sizeTokens[1]);
        int answer = 0;

        char[][] floor = new char[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                floor[i][j] = line.charAt(j);
            }
        }

        ////////////////////// 풀이 ////////////////////////////////////////////
        Boolean isKeep = false;
        Boolean isKeepC = false;
        for (int i = 0; i < N; i++) {
            isKeep = false; //줄바꾸면서 초기화
            for (int j = 0; j < M; j++) {
                // - 갯수 세기
                if(floor[i][j]=='-'){
                    if(!isKeep){
                        answer++;
                        isKeep = true;
                    }
                }else {
                    isKeep = false;
                }
            }
        }
        for (int i = 0; i < M; i++) {
            isKeepC = false; //줄바꾸면서 초기화
            for (int j = 0; j < N; j++) {
                // - 갯수 세기
                if(floor[j][i]=='|'){
                    if(!isKeepC){
                        answer++;
                        isKeepC = true;
                    }
                }else {
                    isKeepC = false;
                }
            }
        }
        ////////////////////// 정답 ////////////////////////////////////////////
        System.out.println(answer);

    }
}