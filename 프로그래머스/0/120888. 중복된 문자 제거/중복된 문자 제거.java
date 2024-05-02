import java.util.HashSet;
import java.util.Set;

class Solution {
    public String solution(String my_string) {
        Set<Character> uniqueChars = new HashSet<>();
        StringBuilder answer = new StringBuilder();
        
        for(char c : my_string.toCharArray()) {
            if(!uniqueChars.contains(c)) {
                uniqueChars.add(c);
                answer.append(c);
            }
        }
        
        return answer.toString();
    }
}
