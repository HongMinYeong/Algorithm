import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> trashq = new LinkedList<>();
        
        for (int i = 1; i <= num; i++) {
            q.add(i);
        }
        
        while (q.size() != 1) {
            // 맨 위의 카드를 버리기
            trashq.add(q.poll());
            q.add(q.poll());
        }
        for (int i : trashq) {
            System.out.print(i + " ");
        }
        
        System.out.println(q.poll());
    }
}

