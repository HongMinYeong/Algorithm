class Solution {
    public int solution(int price) {
        int answer = 0;    
        if(price==100000 || price>100000){
            if(price==300000 || price>300000){
                if(price==500000 || price>500000){
                    answer = price*80/100;
                    return answer;
                }
                return answer = price*90/100;
            }
            return answer = price*95/100;
        }else{
            answer = price;
            return answer;
        }
    }
}