import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int take = nums.length/2;
        HashMap<Integer,Integer> poneketmon = new HashMap<>();
        
        for(Integer number: nums){
            poneketmon.put(number,poneketmon.getOrDefault(number,0)+1);
            // [(3,2),(1,1),(2,1)]
        }
        int now =0;
         for (Integer i: poneketmon.keySet()) {
            poneketmon.put(i, poneketmon.get(i) - 1);
             now++;
             answer++;
             if(now==take){
                 break;
             }
             
        }
        
        return answer;
    }
}

