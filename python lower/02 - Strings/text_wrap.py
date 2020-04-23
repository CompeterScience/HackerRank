def wrap(string, max_width):
    wrapped = [string[i:i+max_width] for i in range(0, len(string), max_width)]    
    return '\n'.join(wrapped)
