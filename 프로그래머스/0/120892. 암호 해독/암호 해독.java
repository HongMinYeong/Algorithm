class Solution {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        char[] ciper = cipher.toCharArray();
        for(int i=0;i<ciper.length/code;i++){
            answer.append(ciper[(i+1)*(code)-1]);
        }
        return answer.toString();
    }
}