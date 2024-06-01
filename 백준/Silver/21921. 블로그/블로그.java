import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static int N,X;
    public static int[] arr;
    public static int[] prefixSum;
    public static int MaxValue = Integer.MIN_VALUE;
    public static int answer=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");

        arr = new int[N]; //입력받는 배열
        prefixSum = new int[N+1]; //누적합

        int sumValue = 0;


        for(int i=0;i<N;i++){ //배열 만들기
            arr[i] = Integer.parseInt(st.nextToken());
        }

        SlidingWindow();

        if(MaxValue==0){
            System.out.println("SAD");
            return;
        }
        System.out.println(MaxValue);
        System.out.println(answer);
    }
    public static void SlidingWindow(){
        int start=0;
        int end = 0;
        int intervalSum=0;
        
        while(start+X <=N){ //start 인덱스부터 X갯수가 N안에 있을때  
            while(start+X > end){ //start인덱스부터 X갯수 합
                intervalSum+=arr[end]; // 1 , 1+4, 4+2 ,2+5 ,5+1
                end++; // 2, 3 ,4, 5
            }

            if(intervalSum > MaxValue){ //합이 최댓값보다 클때 
                MaxValue = intervalSum; // Maxvalue는 현재 합 = 5,answer=0 / 6,answer=0 // 7, answer=0
                answer=0; //answer 값 초기화 
            }
            if(intervalSum == MaxValue){ //합이 최대값과 같을때 
                answer++; // 1
            }
            intervalSum -= arr[start]; //1 + 4 - 1 // 4+2-4 //2+5-2
            start++; //1 2 3
        }
    }
       
}
