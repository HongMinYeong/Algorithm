equation = input().split('-')#-를 기준으로 슬라이싱


answer = 0
for i in equation[0].split('+'): #-전 첫번쨰 요소 더하기
    answer += int(i)
    # print(answer)

for i in equation[1:]:
    for j in i.split('+'):
        # print('i는 -> ',i)
        # print('j는 -> ', j)
        answer -= int(j)

print(answer)