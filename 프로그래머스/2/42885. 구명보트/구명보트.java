import java.util.*;

class Solution {
//     한번에 두명 가능 
    //[50,50,70,80]
    public int solution(int[] people, int limit) {
        int answer = 0;
        //두개의 합이 limit 보다 작을때 sp ++ ep--,answer++
        // limit보다 같거나 클때 ep--,
        Arrays.sort(people);
        
        int sp = 0;
        int ep = people.length-1;
        
        while(sp<ep){
            if(people[sp]+people[ep]<=limit){
                answer++;
                sp++;
            }
            ep--;
            
        }
        answer+=people.length-2*answer;
        return answer;
    }
}