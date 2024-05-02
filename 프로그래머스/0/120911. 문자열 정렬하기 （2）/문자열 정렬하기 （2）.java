// import java.util.*; 

// class Solution {
//     public String solution(String my_string) {
//         String answer = "";
//         int[] list = new int[my_string.length()];
//         for(int i = 0;i<my_string.length();i++){
//          if (my_string.charAt(i)<97){
//              list[i]=my_string.charAt(i)+32;
//          }else{
//              list[i]=my_string.charAt(i);
//          }
//         }
//         Arrays.sort(list);
//         for(int i=0;i<list.length;i++){
//             answer+=Character.toString(list[i]);
//         }
//         return answer;
//     }
// }
import java.util.*;
class Solution {
    public String solution(String my_string) {
        char[] c = my_string.toLowerCase().toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}

