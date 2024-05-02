class Solution {
    public String[] solution(String my_str, int n) {
        int len = (int) Math.ceil((double) my_str.length() / n); 
        String[] answer = new String[len];
        char[] data = my_str.toCharArray();
        
        for (int i = 0; i < len; i++) {
            String str = "";
            for (int j = 0; j < n && i * n + j < my_str.length(); j++) {
                str += data[i * n + j];
            }
            answer[i] = str;
        }
        
        return answer;
    }
}
