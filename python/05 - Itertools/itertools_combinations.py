from itertools import combinations

s,k = input().split()
s = sorted(s)  #sort out of for-loop to avoid oversorting

for i in range(int(k)):
    [print(*e, sep='') for e in combinations(s, i+1)]
