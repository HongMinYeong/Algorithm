class Solution {
    public int solution(int n) {
        int answer = 0;
        int i=0;
        while(true){
            if(factorial(i)<=n){
                i++;
                continue;
            }else{
                i--;
                answer=i;
                break;
            }
        }
        return answer;
    }
    
    public int factorial(int num){
        if(num<=1){
            return 1;
        }
        return num*factorial(num-1);
    }
}