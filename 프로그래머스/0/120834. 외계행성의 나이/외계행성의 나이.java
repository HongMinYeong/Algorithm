class Solution {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        String data = Integer.toString(age);
        char[] digits = data.toCharArray(); 
        for (char digit : digits) {
            int num = digit-'0';
            num+=97;
            answer.append((char)num);
        }
        return answer.toString();
    }
}
