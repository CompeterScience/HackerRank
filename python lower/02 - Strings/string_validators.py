if __name__ == '__main__':
    s = input() 
    print(any([True for c in s if c.isalnum()]))
    print(any([True for c in s if c.isalpha()]))
    print(any([True for c in s if c.isdigit()]))
    print(any([True for c in s if c.islower()]))
    print(any([True for c in s if c.isupper()]))
