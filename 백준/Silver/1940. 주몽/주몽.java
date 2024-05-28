import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 재료의 갯수
        int M = sc.nextInt();  //갑옷을 만드는데 필요한 수
        ArrayList<Integer> arr = new ArrayList<>();
        int answer = 0;

        for(int i=0;i<N;i++){
            arr.add(sc.nextInt());
        }

        Collections.sort(arr);

        int sp = 0;
        int ep = arr.size()-1;
        

        while(sp < ep){
            if(arr.get(sp)+arr.get(ep)< M){
                sp++;
            }else if(arr.get(sp)+arr.get(ep)==M){
                answer++;
                sp++;
                ep--;
            }else{
                ep--;
            }
        }
    System.out.println(answer);

    }
}