a = set(input().split())
n = int(input())
f = True

for i in range(n):
    f &= a > set(input().split())

print(f)
