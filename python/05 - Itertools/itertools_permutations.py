from itertools import permutations

s,k = input().split()

[print(*e, sep='') for e in list(permutations(sorted(s), int(k)))]
