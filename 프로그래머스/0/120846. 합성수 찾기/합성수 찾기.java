class Solution {
    public int solution(int n) {
        int answer = 0;
        // 1은 소수도 합성수도 아니므로 제외
        if (n <= 1) {
            return 0;
        }
        
        for (int i = 2; i <= n; i++) {
            if (!isPrime(i)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
