import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<>();
 
            for(int i = 0; i < words.length; i++){
                if(list.contains(words[i])) { //이미 포함되어있을 때
                    // 탈락자의 번호
                    answer[0] = (i % n) + 1;
                    // 탈락자 자신의 차례
                    answer[1] = (i / n) + 1;
                    break;
                }
                list.add(words[i]);
 
                // 이전단어의 마지막 문자와 현재단어의 첫 번째 문자가 다르다면 탈락
                // 첫 번째 단어는 확인할 필요가 없으므로 첫 번째는 제외.
                if(i > 0 && words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
                    answer[0] = (i % n) + 1;
                    answer[1] = (i / n) + 1;
                    break;
                }
            }
        return answer;
    }
}