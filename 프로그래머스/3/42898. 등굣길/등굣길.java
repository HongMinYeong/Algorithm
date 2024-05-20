class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int [][]dp = new int[n+1][m+1];
        int mod = 1_000_000_007;
        
        for(int[] temp:puddles){
            dp[temp[1]][temp[0]] = -1; //웅덩이 표시 
        }
        dp[1][1] = 1; //시작점
        
        for(int i=1;i<n+1; i++){
            for(int j=1;j<m+1;j++){
                if(dp[i][j] == -1){ //웅덩이 걍 지나가기 
                    continue;
                }
                if(dp[i-1][j] > 0){
                    dp[i][j] = (dp[i][j] + dp[i-1][j]) % mod; //위에꺼 더하기 
                }
                if(dp[i][j-1]>0){
                    dp[i][j] = (dp[i][j] + dp[i][j-1])%mod; //왼쪽거 더하기 
                }
            }
        }
        
        answer=dp[n][m];
        return answer;
    }
}