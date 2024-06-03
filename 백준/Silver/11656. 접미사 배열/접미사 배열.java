import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static String[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputString = br.readLine();
        String temp="";

        char[] charArray = inputString.toCharArray(); //글자별로 배열에 저장 


        arr = new String[charArray.length]; //글자수 대로 배열만들기 

        for(int i=0;i<charArray.length;i++){
            temp="";//temp 초기화
            for(int j=charArray.length-1-i;j<charArray.length;j++){
                temp+=charArray[j]; //접미사 배열에 넣을 단어 생성 
            }
            arr[i]=temp;
        }
        Arrays.sort(arr); //오름차순으로 배열 정렬 
        
        //정답
        for(String k:arr){
            System.out.println(k);
        }

    }
}