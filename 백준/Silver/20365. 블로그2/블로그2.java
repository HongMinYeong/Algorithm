
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static String input;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        input = br.readLine();

///////////////////////문제 풀이 ////////////////////
        char firstChar = input.charAt(0);
        // 첫 번째 문자가 'B'라면 'R' 덩어리 갯수 세기
        char targetChar = firstChar == 'B' ? 'R' : 'B';

        int answer = 1;
        boolean inChunk = false; // 덩어리인지 아닌지 확인

        //RBBRRBB
        for (int i = 0; i < N; i++) {
            char currentChar = input.charAt(i);

            if (currentChar == targetChar) {
                if (!inChunk) {
                    // 덩어리를 처음 발견한 경우
                    answer++;
                    inChunk = true;
                }
            } else {
                inChunk = false;
            }
        }

        System.out.println(answer);
    }
}
