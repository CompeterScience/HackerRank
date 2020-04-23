# Enter your code here. Read input from STDIN. Print output to STDOUT

from collections import OrderedDict

inventory = OrderedDict()

for i in range(int(input())):
    item, price = input().rsplit(None, 1)
    inventory[item] = inventory.get(item, 0) + int(price)

for item in inventory:
    print(item, inventory[item])
