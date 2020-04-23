input()
s1 = set(map(int, input().split()))

input()
s2 = set(map(int, input().split()))

print('\n'.join(map(str, sorted(s1 ^ s2))))
