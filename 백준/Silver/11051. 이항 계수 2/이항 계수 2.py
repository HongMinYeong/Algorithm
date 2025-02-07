import sys 

MOD = 10007

cache = [[0]* 1001 for _ in range(1001)]
sys.setrecursionlimit(10**7)
N,K = map(int,input().split())

def solution(n,k):
	if cache[n][k]:
		return cache[n][k]
		
	if k== 0 or k == n:
		cache[n][k] = 1 
	
	else:
		cache[n][k] = solution(n-1,k-1) + solution(n-1,k) 
		cache[n][k] %= MOD
	return cache[n][k]
	
 
print(solution(N,K))