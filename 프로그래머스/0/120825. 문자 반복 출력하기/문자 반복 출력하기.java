import java.util.*;

class Solution {
    public String solution(String my_string, int n) {
      StringBuilder answer = new StringBuilder();
        char[] charArray = my_string.toCharArray();

        for (char c : charArray) {
            answer.append(String.valueOf(c).repeat(n));
        }

        return answer.toString();
    }
}