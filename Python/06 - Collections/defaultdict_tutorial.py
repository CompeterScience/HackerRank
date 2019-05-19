# Enter your code here. Read input from STDIN. Print output to STDOUT

from collections import defaultdict

n,m = map(int,input().split())
a = defaultdict(list)
b = []

for _ in range(n):
    a[input()].append(i+1)

for i in range(m):
    b.append(input())

for x in b:
    if x in a:
        print(' '.join(map(str,(a[x]))))
    else:
        print(-1)
