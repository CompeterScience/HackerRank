def print_formatted(number):
    # your code goes here
    width = len(str(bin(number))[2:])
    for i in range(number):
        d = str(i+1).rjust(width, ' ')
        o = str(oct(i+1))[2:].rjust(width, ' ')
        h = str(hex(i+1))[2:].upper().rjust(width, ' ')
        b = str(bin(i+1))[2:].rjust(width, ' ')
        print(d, o, h, b, sep=' ')
