import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int minDiff = Integer.MAX_VALUE; 
        Arrays.sort(array); 

        
        for (int i = 0; i < array.length; i++) {
            int diff = Math.abs(n - array[i]); 
            if (diff < minDiff) {
                minDiff = diff; 
                answer = array[i]; 
            }
        }

        return answer;
    }
}
