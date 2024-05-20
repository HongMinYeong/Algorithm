class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cntP = 0;
        int cntY = 0;
        for (char c : s.toCharArray()) {
            if (c == 'p' || c == 'P') {
                cntP++;
            }
            if (c == 'y' || c == 'Y') {
                cntY++;
            }
        }
        if (cntP != cntY) {
            answer = false;
        }

        return answer;
    }
}
