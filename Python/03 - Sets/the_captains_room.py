groups = int(input())
rooms = list(map(int, input().split()))

print((sum(set(rooms)) * groups - sum(rooms)) // (groups - 1))
