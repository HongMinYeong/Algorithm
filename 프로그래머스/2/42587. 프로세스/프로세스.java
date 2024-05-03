// import java.util.PriorityQueue;
// import java.util.Collections;

// class Solution {
//     public int solution(int[] priorities, int location) {
//         // 우선순위 큐 선언(내림 차순)
//         PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
//         int answer = 0;

//         // 우선순위 큐에 우선순위 요소 추가
//         for (int i : priorities) {
//             queue.offer(i);
//         }

//         // 큐가 빌 때까지 반복
//         while (!queue.isEmpty()) {
//             // 기존 우선순위 배열 순회
//             for (int i = 0; i < priorities.length; i++) {
//                 // 현재 작업의 위치 찾기
//                 if (queue.peek() == priorities[i]) {
//                     queue.poll();
//                     answer++;

//                     // 현재 작업이 location과 같으면 answer 반환
//                     if (location == i) {
//                         return answer;
//                     }
//                 }
//             }
//         }

//         return answer;
//     }
// }
import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int x : priorities) {
            list.add(x);
        }
        
        while(location >= 0) {
            System.out.println(list.get(0));
            int max = Collections.max(list);
            if(list.get(0) >= max) {
                list.remove(0);
                location--;
                answer++;
                if(location < 0) {
                    break;
                }
            } else {
                int tmp = list.get(0);
                list.remove(0);
                list.add(tmp);
                location--;
                if(location < 0) {
                    location = list.size()-1;
                }
            }
        }
        return answer;
    }
}

