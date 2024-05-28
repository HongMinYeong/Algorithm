import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 배열의 크기
        int answer = 4; //answer 최대로 나올 수 있는 수

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<N;i++){
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);
        int p1=0;
        int p2=0;
        while(p1<arr.size() && p2<arr.size()){
            if(arr.get(p2)-arr.get(p1)<5){ //차이가 5미만이라면 엔드포인트 오른쪽으로 이동
                p2++;
                answer=Math.min(answer,5-(p2-p1));
            }else{ //차이가 5이상이라면 시작포인트 오른쪽으로 이동
                p1++;
            }
        }

        System.out.println(answer);
    }
}
