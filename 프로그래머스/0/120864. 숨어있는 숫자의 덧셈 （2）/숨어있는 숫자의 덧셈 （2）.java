import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String str = ""; 

        for (int i = 0; i < my_string.length(); i++) {
            char currentChar = my_string.charAt(i);

            if (Character.isDigit(currentChar)) {
                str += currentChar; 
            } else {
                if (!str.isEmpty()) { 
                    int number = Integer.parseInt(str); 
                    answer += number; 
                    str = ""; 
                }
            }
        }

        if (!str.isEmpty()) {
            int number = Integer.parseInt(str); 
            answer += number; 
        }

        return answer;
    }
}
