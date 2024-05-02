import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> answer1 = new ArrayList<>();
        for(int i=0;i<my_string.length();i++){
            if(Character.isDigit(my_string.charAt(i))){
                answer1.add(my_string.charAt(i)-'0');
            }
        }
        int[] answer = answer1.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}