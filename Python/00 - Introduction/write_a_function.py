def is_leap(year):   
    # Write your logic here
    leap = (year%4 == 0) and (year%100 != 0 or year%400 == 0)
    
    return leap
