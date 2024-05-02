// class Solution {
//     public int solution(int n) {
//         int answer = 0;
//         double num = Math.sqrt(n);
//         answer=(int)num*(int)num==n?1:2;
//         return answer;
//     }
// }
class Solution {
    public int solution(int n) {
        if (n % Math.sqrt(n) == 0) {
            return 1;
        } else {
            return 2;
        }
    }
}

