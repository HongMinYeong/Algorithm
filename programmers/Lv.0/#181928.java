// public class #181928 {
    
// }

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
       for(int i = 0; i<num_list.length;i++){
        if(num_list[i] % 2 == 0){
            //짝수라면, 
            arr1.add(num_list[i]);
        }else{
            arr2.add(num_list[i]);
        }
       }
        String arr1String = arr1.stream().map(Object::toString).collect(Collectors.joining(""));
        String arr2String = arr2.stream().map(Object::toString).collect(Collectors.joining(""));

        
        answer = Integer.parseInt(arr1String) + Integer.parseInt(arr2String);
        return answer;
    }
}