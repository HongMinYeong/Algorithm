// class Solution {
//     public int[] solution(int[] numbers, int num1, int num2) {
//         int[] answer = new int[num2-num1+1];
//         int pos = 0;
//         for(int i=0;i<numbers.length;i++){
//             if(i==num1){
//                 for(int j=num1;j<=num2;j++){
//                     answer[pos]=numbers[j];
//                     pos++;
//                 }
//             }
//         }
        
//         return answer;
//     }
// }
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];

        for (int i = num1; i <= num2; i++) {
            answer[i -num1] = numbers[i];
        }

        return answer;
    }
}

