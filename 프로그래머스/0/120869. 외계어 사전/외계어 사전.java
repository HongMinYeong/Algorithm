import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        Arrays.sort(spell);
        for (String word : dic) {
            if (spell.length == word.length()) {
                String[] sortedWord = word.split("");
                Arrays.sort(sortedWord);
                if (Arrays.equals(spell, sortedWord)) {
                    answer=1;
                    break;
                }
            }
        }

        return answer; 
    }
}
