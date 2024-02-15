N = int(input())
time = []
for i in range(N):
    S,E = map(int,input().split())
    time.append([S,E])

time=sorted(time,key=lambda x: (x[1],x[0])) #회의 끝나는 시간 기준 오름차순 정렬하고 시간빠른순서로 오름차순 정렬
count = 1
end_time = time[0][1]

for i in range(1,N):
    if time[i][0] >= end_time: #시작시간이 그 전 회의 끝나는시간보다 크다면 회의 가능한
        count+=1
        end_time = time[i][1] # 끝나는 시간 바꿔주기 

print(count)