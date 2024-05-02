import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
         int[] answer = new int[emergency.length];
        int[] sortedEmergency = emergency.clone(); 
        Arrays.sort(sortedEmergency);
        int pos = emergency.length;
        for(int i=0;i<pos;i++){
            for(int j=pos;j>0;j--){
             if(emergency[i]==sortedEmergency[pos-j]){
                answer[i]=j;
            }
                
            }
        }
        
        return answer;
    }
}