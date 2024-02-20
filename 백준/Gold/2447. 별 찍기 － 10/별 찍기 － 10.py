def star(n):
    # print(n)
    if n == 1:
        return ['*']
    stars = star(n//3)
    a = []
    # print('stars는 ->',stars)
    for i in stars:
        # print('n ->',n,'i는 ->',i)
        a.append(i*3)
        # print('추가하고 a',a)
    for i in stars:
        a.append(i+' '*(n//3)+i)
    for i in stars:
        a.append(i*3)
    # print('a ->',a)
    return a

N = int(input())
# print(star(N))
print('\n'.join(star(N)))