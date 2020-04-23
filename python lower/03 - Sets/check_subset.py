n = int(input())

for i in range(n):
    input()
    a = set(map(int, input().split()))
    input()
    b = set(map(int, input().split()))
    print(a <= b)
