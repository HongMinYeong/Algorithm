import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int[] command : commands) {
            int start = command[0] - 1;
            int end = command[1] - 1;
            int k = command[2] - 1;
            
            int[] tempArray = Arrays.copyOfRange(array, start, end + 1);
            Arrays.sort(tempArray);
            answer.add(tempArray[k]);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
