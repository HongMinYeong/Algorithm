import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // 절댓값 기준으로 정렬되는 우선순위 큐 정의
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> {
            int absA = Math.abs(a);
            int absB = Math.abs(b);
            if (absA == absB) {
                return a - b; // 절댓값이 같으면 실제 값 비교 (음수를 우선)
            }
            return absA - absB;
        });

        for(int i=0;i<num;i++){
            int num2 = sc.nextInt();
            if (num2 == 0) {
                if (q.isEmpty()) {
                    System.out.println(0);
                } else {
                    // 큐에서 절댓값이 가장 작은 값을 출력하고 제거
                    System.out.println(q.poll());
                }
            } else {
                q.add(num2);
            }
        }
    }
}


