import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        while (q.size() > 0) {
            answer=q.poll();
            for(int i=0;i<k-1;i++) {
                q.poll();
            }
            q.add(answer);
            if(q.size()<k){
                //k보다 사이즈가 작으면
                answer=q.poll();
                break;
            }
        }

        System.out.println(answer);
    }
}