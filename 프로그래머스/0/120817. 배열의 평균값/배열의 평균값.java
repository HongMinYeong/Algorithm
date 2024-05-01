class Solution {
    public double solution(int[] numbers) {
        double answer = 0.0;
        int i = 0;
        double sum = 0;
        while(i < numbers.length){
            sum += numbers[i];
            i++;
        }
        answer = sum/numbers.length;
        return answer;
    }
}