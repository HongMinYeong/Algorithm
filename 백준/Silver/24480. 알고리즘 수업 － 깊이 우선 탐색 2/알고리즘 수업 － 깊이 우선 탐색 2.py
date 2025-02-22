import sys

input = sys.stdin.readline
sys.setrecursionlimit(10 ** 6)

N, M, R = map(int, input().split())
node = [[] for _ in range(N + 1)]

for _ in range(M):
    u, v = map(int, input().split())
    node[u].append(v)
    node[v].append(u)

for i in range(1, N + 1):
    node[i].sort(reverse=True)

chk = [False] * (N + 1)
order = [0] * (N + 1)
cnt = 1

def dfs(r):
    # print("현재 r",r)
    global cnt
    chk[r] = True 
    order[r] = cnt
    for nxt in node[r]:
        if not chk[nxt]:
            cnt += 1
            dfs(nxt)

dfs(R)

for i in range(1, N + 1):
    print(order[i])
