import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();


        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> answer = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        while (q.size() > 0) {
            for(int i=0;i<k-1;i++) {
                q.add(q.poll());
            }
            answer.add(q.poll());
        }

        System.out.print('<');
        int size = answer.size();
        for(int i=0;i<size;i++){
            if(i==size-1){
                System.out.print(answer.poll());
            }else {
                System.out.print(answer.poll()+", ");
            }
        }
        System.out.print('>');
    }
}
