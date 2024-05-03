// class Solution { 
// 	boolean solution(String s) { 
//     	boolean answer = false;
//         int open = 0, close = 0; //시작과 끝의 괄호 체크
//         if(s.charAt(0)==')'||s.charAt(s.length()-1)=='(')
//         	return false;
//         for(int i=0;i<s.length();i++){
//         	if(s.charAt(i)=='(') open++;
//             else close++;
//             if(open-close==-1) return false;
//          }
//          if(open==close) answer= true; 
//          else answer= false; 
//          return answer; 
//      } 
// }
class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int count = 0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == '('){
                count++;
            }
            if(s.charAt(i) == ')'){
                count--;
            }
            if(count < 0){
                break;
            }
        }
        if(count == 0){
            answer = true;
        }

        return answer;
    }
}

