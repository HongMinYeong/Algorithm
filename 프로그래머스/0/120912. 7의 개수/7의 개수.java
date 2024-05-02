class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for (int num : array) {
            String numStr = Integer.toString(num);
            for (char c : numStr.toCharArray()) {
                if (c == '7') {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}
