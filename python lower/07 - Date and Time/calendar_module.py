# Enter your code here. Read input from STDIN. Print output to STDOUT

import calendar

month,day,year = map(int, input().split())

name_of_day = calendar.day_name[calendar.weekday(year, month, day)].upper()

print(name_of_day)
