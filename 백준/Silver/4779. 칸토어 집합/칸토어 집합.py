# 칸토어 집합

def cant(a,s,length):
    temp = length //3
    if temp == 0:
        return a

    for i in range(s + temp, s+ temp*2):
        a[i] = ' '

    cant(a,s,temp)
    cant(a,s+temp*2,temp)

    return a
while True:
    try:
        N = int(input())
        array = ['-'] * (3 ** N)
        print(''.join(cant(array, 0, len(array))))
    except: #EOF 발생
        break