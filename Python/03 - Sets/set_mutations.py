input()
s = set(map(int, input().split()))
n = int(input())

for i in range(n):
    cmd = input().split()
    if cmd[0] == "intersection_update":
        s &= set(map(int, input().split()))
    if cmd[0] == "update":
        s |= set(map(int, input().split()))
    if cmd[0] == "symmetric_difference_update":
        s ^= set(map(int, input().split()))
    if cmd[0] == "difference_update":
        s -= set(map(int, input().split()))

print(sum(s))   
