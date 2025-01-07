import sys

#123*+

input = sys.stdin.readline().strip()

result = 0

stack = []

for i in input:
    if i == '+':
        a=stack.pop()
        b=stack.pop()
        stack.append(a+b)
    elif i == '*':
        a=stack.pop()
        b=stack.pop()
        stack.append(a*b)
    elif i == '-':
        a=stack.pop()
        b=stack.pop()
        stack.append(b-a)
    elif i == '/':
        a=stack.pop()
        b=stack.pop()
        stack.append(b//a)
    else:
        stack.append(int(i))


print(*stack)