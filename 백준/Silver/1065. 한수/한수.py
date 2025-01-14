#100 미만인 수는 모두 한수

N = int(input())
answer = 0
for i in range(1,N+1):
    if i < 100:
        answer += 1
    else:
        if int(str(i)[0])-int(str(i)[1]) == int(str(i)[1])-int(str(i)[2]):
            answer += 1
             


print(answer)