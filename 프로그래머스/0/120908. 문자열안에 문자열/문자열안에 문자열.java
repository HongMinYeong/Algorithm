// class Solution {
//     public int solution(String str1, String str2) {
//         int answer = 0;
//         int pos = str1.indexOf(str2);
//         if(pos==-1) answer=2;
//         else answer =1;
//         return answer;
//     }
// }
class Solution {
    public int solution(String str1, String str2) {
        return (str1.contains(str2)? 1: 2);
    }
}