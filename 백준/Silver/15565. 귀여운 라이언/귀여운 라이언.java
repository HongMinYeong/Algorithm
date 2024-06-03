import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int N, K;
    public static int[] arr;
    public static int MinValue = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");

        arr = new int[N];

        for (int i = 0; i < N; i++) { 
            arr[i] = Integer.parseInt(st.nextToken());
        }

        findShortestSubarrayWithKOnes();
        System.out.println(MinValue == Integer.MAX_VALUE ? -1 : MinValue);
    }

    public static void findShortestSubarrayWithKOnes() {
        int start = 0, end = 0, countOnes = 0;

        while (end < N) {
            if (arr[end] == 1) {
                countOnes++;
            }

            while (countOnes == K) {
                MinValue = Math.min(MinValue, end - start + 1);
                if (arr[start] == 1) {
                    countOnes--;
                }
                start++;
            }
            end++;
        }
    }
}
