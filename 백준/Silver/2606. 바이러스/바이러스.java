import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            graph.get(x).add(y);
            graph.get(y).add(x);  // 양방향 그래프
        }

        boolean[] visited = new boolean[N+1];
        bfs(graph, visited);

        int count = 0;
        for (int i = 2; i <= N; i++) {  // 1번 컴퓨터를 제외하고 카운트
            if (visited[i]) count++;
        }

        System.out.println(count);
    }

    private static void bfs(List<List<Integer>> graph, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        visited[1] = true;

        while (!queue.isEmpty()) {
            int v = queue.poll();
            for (int i : graph.get(v)) {
                if (!visited[i]) { //방문 확인 
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}