// class Solution {
//     public int solution(int num, int k) {
//         int answer = 0;
//         //num을 char 배열로 
//         String str = Integer.toString(num);
//         int pos = 0;
//         for(char c:str.toCharArray()){
//             if (c-'0'==k){
//                 answer=pos+1;
//                 break;
//             }
//             pos++;
//         }
//         if (answer==0){
//             answer=-1;
//         }
//         return answer;
//     }
// }
class Solution {
    public int solution(int num, int k) {
        int answer = -1;

        String str = String.valueOf(num);

        for(int i =0; i<str.length(); i++){
            if(str.charAt(i) == k + '0'){
                answer = i+1;
                break;
            }
        }

        return answer;
    }
}

