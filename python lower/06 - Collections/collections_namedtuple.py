# Enter your code here. Read input from STDIN. Print output to STDOUT

from collections import namedtuple

n = int(input())
marks = namedtuple('STUDENT', input().split())
total = 0

for i in range(n):
    M,C,N,I = input().split()
    student = marks(M,C,N,I)
    total += int(student.MARKS)

print(total/n)
