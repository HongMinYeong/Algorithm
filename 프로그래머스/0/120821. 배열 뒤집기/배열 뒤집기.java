class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int lp=num_list.length-1;
        int sp=0;
        while(sp<num_list.length){
            answer[sp]=num_list[lp];
            sp++;
            lp--;
        }
        return answer;
    }
}