import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        
        for (int i = 1; i < arr.length; i++) {
            // 현재 숫자와 바로 이전 숫자가 다른 경우에만 추가
            if (arr[i] != arr[i - 1]) {
                answer.add(arr[i]);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
