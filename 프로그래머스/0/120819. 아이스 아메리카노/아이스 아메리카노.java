import java.util.*;

class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        
        answer[0] = money / 5500; // 5500원 권 개수
        answer[1] = money % 5500; // 나머지 금액
        
        return answer;
    }
}