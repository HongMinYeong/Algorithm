class Solution {
    public int solution(int n) {
        int answer = n%7==0?0:1;
        int pizza = n/7;
        answer+=pizza;
        
        return answer;
    }
}