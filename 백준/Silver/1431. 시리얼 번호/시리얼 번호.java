import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());
        Serial[] arr = new Serial[N];

        for(int i=0; i<arr.length; i++){
            arr[i] = new Serial(br.readLine());
        }

        //compareTo 메서드에 구현된 정렬 기준에 따라 정렬 -> arr는 Serial 클래스의 객체 
        Arrays.sort(arr);

        ////////////////////// 정답 //////////////////////////////////////////// 
        for(int i=0; i<N; i++){
            System.out.println(arr[i].num);
        }
    }
}

class Serial implements Comparable<Serial>{ //Comparable 인터페이스를 구현한 클래스로, compareTo 메서드를 오버라이딩
    String num; // 문자열을 저장할 멤버변수

    Serial(String a){ // 생성자
        num = a; //문자열을 입력받아 num에 저장
    }

    @Override
    public int compareTo(Serial o2){ // compareTo 메서드 오버라이딩
        //원소 길이로 먼저 정렬
        if(num.length() > o2.num.length()){ // num의 길이가 o2.num의 길이보다 길면 내림차순 정렬
            return 1;
        }else if(num.length() < o2.num.length()){ // num의 길이가 o2.num의 길이보다 짧으면 오름차순 정렬
            return -1;
        }else{ // 길이가 같으면 각 자릿수 숫자합을 비교
            int sum1 = 0;
            int sum2 = 0;
            ////////////////////// num의 각 자릿수를 숫자로 변환하여 합산 //////////////////////
            for(int i=0;i <num.length(); i++){ 
                if(num.charAt(i) >= '0' &&  num.charAt(i) <= '9'){
                    sum1 += num.charAt(i) - '0';
                }
            }

            ////////////////////// num의 각 자릿수를 숫자로 변환하여 합산 //////////////////////
            for(int i=0;i <o2.num.length(); i++){ 
                if(o2.num.charAt(i) >= '0' &&  o2.num.charAt(i) <= '9'){
                    sum2 += o2.num.charAt(i) - '0';
                }
            }

            if(sum1 > sum2){ // sum1이 sum2보다 크면 1 반환(내림차순 정렬)
                return 1;
            }else if(sum1 <sum2){ // sum1이 sum2보다 작으면 -1 반환(오름차순 정렬)
                return -1;
            }else{ // sum1과 sum2가 같으면 num과 o2.num의 사전 순서대로
                return num.compareTo(o2.num);
            }
        }
    }
}