import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static int T, N, M;
    public static HashSet<Integer> answer = new HashSet<Integer>();
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
////////////////////////////////입력////////////////////////////////
        T = Integer.parseInt(st.nextToken()); // 테스트 케이스의 개수

        for (int t = 0; t < T; t++) {
            sb = new StringBuilder();
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken()); // 수첩1에 적어놓은 정수 갯수

            answer = new HashSet<>();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                answer.add(Integer.parseInt(st.nextToken()));
            }
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken()); // 수첩2에 적어놓은 정수 갯수
////////////////////////////////풀이////////////////////////////////
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                sb.append(answer.contains(Integer.parseInt(st.nextToken()))?1:0).append("\n");
            }//삼항연산자로 answer set에 있는지 확인 있으면 1 엇으면 0 append

            ////////////////////////////////정답////////////////////////////////
            System.out.print(sb);
        }
    }
}
