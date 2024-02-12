import itertools

# 입력 받기
L, C = map(int, input().split())
array = input().split()
array.sort()
# 모음과 자음 정의
vowels = {'a', 'e', 'i', 'o', 'u'}

# 조건을 만족하는 암호 출력
for comb in itertools.combinations(array, L):
    vowel_count = sum(1 for char in comb if char in vowels)
    consonant_count = L - vowel_count
    if vowel_count >= 1 and consonant_count >= 2:
        print(''.join(comb))