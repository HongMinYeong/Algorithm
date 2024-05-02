class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        char[] data = my_string.toCharArray();
        for(int i=0;i<data.length;i++){
            answer.append(data[data.length-1-i]);
        }
        
        return answer.toString();
    }
}