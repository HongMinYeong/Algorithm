class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int num = i; num <= j; num++) {
            int currentNumber = num;
            while (currentNumber > 0) {
                int digit = currentNumber % 10; 
                if (digit == k) {
                    answer++; 
                }
                currentNumber /= 10; 
            }
        }
        return answer;
    }
}
