import java.util.*;

public class Main {
    static StringBuilder answer = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<Integer> arrA = new ArrayList<>();
        ArrayList<Integer> arrB = new ArrayList<>();
        ArrayList<Integer> answerArray = new ArrayList<>();


//        각 배열에 숫자 넣기
        for(int i=0;i<N;i++){
            arrA.add(sc.nextInt());
        }
        for(int i=0;i<M;i++){
            arrB.add(sc.nextInt());
        }
//        각 배열 정렬해주기
        Collections.sort(arrA);
        Collections.sort(arrB);

        int p1=0,p2=0; //포인터
        int l1= arrA.size();
        int l2=arrB.size();

        while(p1<l1 && p2<l2){
            //하나의 포인터가 끝까지 간다면 종료
            if(arrA.get(p1) >arrB.get(p2)){
                answerArray.add(arrB.get(p2));
                p2++;
            }else{
                answerArray.add(arrA.get(p1));
                p1++;
            }
        }
        while(p1<l1){
            answerArray.add(arrA.get(p1++));
        }
        while(p2<l2){
            answerArray.add(arrB.get(p2++));
        }
        for(int i=0;i<answerArray.size();i++){
            answer.append(answerArray.get(i)+" ");
        }
        System.out.println(answer);

    }
}