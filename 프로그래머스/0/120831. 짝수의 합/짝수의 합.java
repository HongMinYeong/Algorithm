class Solution {
    public int solution(int n) {
        int answer = 0;
        int start = 0;
        while(start==n || start< n){
            answer+= start;
            start+=2;
        }
        return answer;
    }
}
