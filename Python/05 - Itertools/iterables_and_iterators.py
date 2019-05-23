# Enter your code here. Read input from STDIN. Print output to STDOUT

from itertools import combinations

n = int(input())
l = input().split()
k = int(input())

c = list(combinations(l, k))
u = len(list(filter(lambda t: 'a' in t, c)))

print(u/len(c))
