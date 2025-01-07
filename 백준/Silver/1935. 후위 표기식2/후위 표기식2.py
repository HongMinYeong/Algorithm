import sys

input = sys.stdin.readline

N = int(input().strip())
equ = list(map(str,input().strip()))
alp = []
st = []

for _ in range(N):
    alp.append(int(input().strip()))

for item in equ:
    if item == '*':
        num1 = st.pop()
        num2 = st.pop()
        st.append(num1*num2)
    elif item == '+':
        num1 = st.pop()
        num2 = st.pop()
        st.append(num1+num2)
    elif item == '-':
        num1 = st.pop()
        num2 = st.pop()
        st.append(num2-num1)
    elif item == '/':
        num1 = st.pop()
        num2 = st.pop()
        st.append(num2/num1)
    else:
        #65
        st.append(alp[ord(item)-65])

print(f"{st[-1]:.2f}")