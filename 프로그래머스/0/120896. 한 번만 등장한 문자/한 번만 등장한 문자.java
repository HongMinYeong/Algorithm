import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";

        char[] data = s.toCharArray();
        Arrays.sort(data);

        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            while (i < s.length() - 1 && data[i] == data[i + 1]) {
                count++;
                i++;
            }
            if (count == 1) {
                answer += data[i];
            }
        }

        return answer;
    }
}

