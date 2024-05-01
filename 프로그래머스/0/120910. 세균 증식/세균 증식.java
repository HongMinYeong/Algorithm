class Solution {
    public int solution(int n, int t) {
        int answer = n;
        int pos = 0;
        while(pos<t){
            answer *= 2;
            pos++;
        }
        return answer;
    }
}