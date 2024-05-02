class Solution {
    public int solution(int n) {
//         최소공배수를 구해서 n으로 나눠야 함. n과 6의 최소공배수 
        int answer = 0;
        
        if(n%6==0) answer = n/6;
        else{
            int i = 2;
            while(i<7){
             if ((n*i)%6==0){
                 answer=i*n/6;
                 break;
             } 
            i++;
            }
        }
        return answer;
    }
}