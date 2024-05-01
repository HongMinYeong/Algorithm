class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);

        for (char c : str.toCharArray()) {
            answer += Character.getNumericValue(c);
        }

        return answer;
    }
}