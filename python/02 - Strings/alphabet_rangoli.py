import string

def print_rangoli(size):
    # your code goes here
    alpha = string.ascii_lowercase
    bottom = []
    for i in range(size):
        s = '-'.join(alpha[i:size])
        bottom.append((s[::-1]+s[1:]).center(4*size-3, '-'))
    print('\n'.join(bottom[:0:-1]+bottom))
