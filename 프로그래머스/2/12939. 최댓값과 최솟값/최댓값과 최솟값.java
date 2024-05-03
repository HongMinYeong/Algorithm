import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] array = s.split(" ");
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array2[i] = Integer.parseInt(array[i]);
        }
        Arrays.sort(array2);
        answer+=array2[0];
        answer+= " ";
        answer+= array2[array2.length-1];
        
        return answer;
    }
}