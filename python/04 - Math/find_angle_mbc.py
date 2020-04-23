from math import atan2
from math import degrees

ab = int(input())
bc = int(input())

print(str(round(degrees(atan2(ab,bc)))) + "°")
