city = int(input())
distance = list(map(int,input().split()))
price = list(map(int,input().split()))

#필요한 기름의 양
# 처음엔 처음 도시에서 최소 기름 거리만큼 넣어야됨
# 가격이 싼데에서 최대한 많이사고, 그외에서는 당장 필요한만큼 사기
answer = 0
min_price = price[0]

for i in range(city-1):
    if price[i] < min_price:
        min_price = price[i]
    #     print('min_price는 ->',min_price)
    # print("min_price -> ",min_price," * ","distance[i]",distance[i])
    answer += min_price * distance[i]

print(answer)