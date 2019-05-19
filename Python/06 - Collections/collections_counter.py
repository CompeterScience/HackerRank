# Enter your code here. Read input from STDIN. Print output to STDOUT

from collections import Counter

x = int(input())
shoes = Counter(map(int, input().split()))
revenue = 0

for i in range(int(input())):
    size, price = map(int, input().split())
    if shoes[size]:
        revenue += price
        shoes[size] -= 1
        
print(revenue)
import collections
