import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        char[] sortedBefore = before.toCharArray();
        char[] sortedafter = after.toCharArray();
        Arrays.sort(sortedBefore);
        Arrays.sort(sortedafter);
        for(int i=0;i<before.length();i++){
            if(sortedBefore[i]!=sortedafter[i]){
                answer=0;
                break;
            }
        }
        return answer;
    }
}