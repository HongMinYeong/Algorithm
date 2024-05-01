class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int num:array){
            answer+=num>height?1:0;
        }
        return answer;
    }
}