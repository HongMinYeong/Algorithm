class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int n = triangle.length;
        
        for(int i=1;i<n;i++){
            for(int j=0;j<triangle[i].length;j++){
                if(j==0){ //왼쪽 끝일때 
                    triangle[i][j] += triangle[i-1][j];
                }
                else if(j == i){ //오른쪽 끝일때 
                    triangle[i][j] += triangle[i-1][j-1];
                    
                }
                else{ //더 큰쪽으로 바꿈 
                    triangle[i][j] += Math.max(triangle[i-1][j],triangle[i-1][j-1]);
                }
                answer=Math.max(answer,triangle[i][j]); //줄마다 가장 큰수가 answer
                
            }
        }
        return answer;
    }
}