// import java.util.*;

// class Solution {
//     public int solution(int[] numbers) {
//         int answer = 0;
//         int temp=0;
//         Arrays.sort(numbers);
//         answer=numbers[numbers.length-1]*numbers[numbers.length-2];
//         if(numbers[0]<0){
//             temp = numbers[0]*numbers[1];
//             answer=temp>answer?temp:answer;
//         }
      
//         return answer;
//     }
// }
import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int len = numbers.length;
        Arrays.sort(numbers);
        return Math.max(numbers[0] * numbers[1], numbers[len - 2] * numbers[len - 1]);
    }
}

