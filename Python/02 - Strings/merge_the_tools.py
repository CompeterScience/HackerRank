def merge_the_tools(string, k):
    # your code goes here
    segs = [string[i:i+k] for i in range(0, len(string), k)]
    for seg in segs:
        print(''.join(sorted(set(seg), key=seg.index)))
