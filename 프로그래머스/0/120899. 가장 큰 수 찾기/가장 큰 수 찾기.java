import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] sortedArray = array.clone(); 
        Arrays.sort(sortedArray); 

        int maxValue = sortedArray[sortedArray.length - 1]; 
        answer.add(maxValue); 

        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxValue) { 
                answer.add(i); 
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray(); 
    }
}