# Enter your code here. Read input from STDIN. Print output to STDOUT

from collections import deque

n = int(input())
d = deque()

for i in range(n):
    command = input().split()
    if command[0] == 'append':
        d.append(command[1])
    if command[0] == 'appendleft':
        d.appendleft(command[1])
    if command[0] == 'pop':
        d.pop()
    if command[0] == 'popleft':
        d.popleft()
    
print(*d)
