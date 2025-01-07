import sys
input = sys.stdin.readline

N = int(input().strip())
st = []

for _ in range(N):
    cmd = input().strip()

    if cmd.startswith("1"):
        _,num = cmd.split()
        st.append(num)
    elif cmd == '2':
        if st:
            print(st[-1])
            st.pop()
        else:
            print(-1)
    elif cmd == '3':
        print(len(st))
    elif cmd == '4':
        print(0 if st else 1)
    else:
        print(st[-1] if st else -1)
        