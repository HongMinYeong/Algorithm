import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        //n의 약수를 오름차순으로 담은 배열 return 
        for(int i=1;i<=n;i++){
            if (n%i==0){
                answer.add(i);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}