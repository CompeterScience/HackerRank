def count_substring(string, sub_string):
    count = index = 0
    while True:
        index = string.find(sub_string, index) + 1
        if index > 0:
            count += 1
        else:
            return count
