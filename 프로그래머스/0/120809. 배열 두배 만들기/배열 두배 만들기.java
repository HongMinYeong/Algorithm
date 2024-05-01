import java.util.ArrayList;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < numbers.length; i++) {
            answer.add(numbers[i] * 2);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}