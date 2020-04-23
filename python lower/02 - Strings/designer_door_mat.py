size = int(input().split(' ')[0])

top = ['WELCOME'.center(3*size, '-')]

for i in range(size//2):
    top.append(((2*i+1) * '.|.').center(3*size, '-'))

print('\n'.join(top[1:] + [top[0]] + top[:0:-1]))
