import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int T, N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
////////////////////////////////입력////////////////////////////////
        T = Integer.parseInt(st.nextToken()); // 테스트 케이스의 개수

        for (int t = 0; t < T; t++) {
            N = Integer.parseInt(br.readLine()); // 배열 크기
            int[][] arr = new int[N][2]; // 2차원 배열 선언 

            
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                arr[i][0] = Integer.parseInt(st.nextToken()); 
                arr[i][1] = Integer.parseInt(st.nextToken()); 
            }
////////////////////////////////풀이////////////////////////////////
            
            // 첫 번째 요소를 기준으로 정렬
            Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

            int answer = 1; // 첫 번째 학생은 항상 합격이므로 초기값을 1로 설정
            int minSecond = arr[0][1]; // 현재까지의 합격자 중 가장 작은 두 번째 요소를 저장하는 변수

            // 두 번째 요소를 기준으로 합격 여부 판단
            for (int i = 1; i < N; i++) {
                if (arr[i][1] < minSecond) { // 현재 지원자의 두 번째 요소가 최소값보다 작으면 합격
                    answer++; // 합격자 수 증가
                    minSecond = arr[i][1]; // 최소값 갱신
                }
            }
            
////////////////////////////////정답////////////////////////////////
            System.out.println(answer); // 합격자 수 출력
        }
    }
}
