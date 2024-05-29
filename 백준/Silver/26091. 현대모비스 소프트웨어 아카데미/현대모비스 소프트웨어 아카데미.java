import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0;i<N;i++){
            arr.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(arr);//정렬

        int sp = 0;
        int ep = arr.size()-1;
        int answer=0;

        while(sp<ep){
            if(N<2) break;
            if(arr.get(sp)+arr.get(ep)>=M){
                //팀의 능력치보다 같거나 크다면
                answer++;
                ep--;
            }
            sp++;
        }

        System.out.println(answer);

    }
}

