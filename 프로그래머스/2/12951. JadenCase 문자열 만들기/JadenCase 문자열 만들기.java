import java.util.*;
 
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        
 
        for(int i=0; i<arr.length; i++) {
            String now = arr[i];
            
            //공백문자가 연속해서 나올때
           if(arr[i].length() == 0) {
    			answer += " ";
    		} 
    		
    		else {
    			answer += now.substring(0, 1).toUpperCase();
    			answer += now.substring(1, now.length()).toLowerCase();
    			answer += " ";
    		}
            
        }
        	// 입력 받은 문자열의 맨 마지막이 " " 라면
    	if(s.substring(s.length()-1, s.length()).equals(" ")){
    		return answer;
    	}
        
        return answer.substring(0, answer.length()-1);
    }
 
}