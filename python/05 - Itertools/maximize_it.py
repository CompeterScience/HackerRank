# Enter your code here. Read input from STDIN. Print output to STDOUT

from itertools import product

k,m = map(int,input().split())

n = (list(map(int, input().split()))[1:] for _ in range(k))
r = map(lambda x: sum(i**2 for i in x) % m, product(*n))

print(max(r))
