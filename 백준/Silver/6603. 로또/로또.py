import sys
import itertools

result = []
while True:
    input_str = sys.stdin.readline()
    array = list(map(int, input_str.split()))
    if array[0] == 0:
        break
    array2 = array.pop(0)
    for comb in itertools.combinations(array, 6):
        print(' '.join(map(str,comb)))
    print()