import sys
input = sys.stdin.readline

N = int(input().strip())  # 명령어 개수
stack = []

for _ in range(N):
    cmd = input().strip()  
    if cmd.startswith("push"):  
        _, num = cmd.split()
        stack.append(int(num))
    elif cmd == "pop":  
        if stack:
            print(stack.pop())
        else:
            print(-1)
    elif cmd == "size":  
        print(len(stack))
    elif cmd == "empty":  
        print(0 if stack else 1)
    elif cmd == "top":  
        if stack:
            print(stack[-1])
        else:
            print(-1)
