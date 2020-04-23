if __name__ == '__main__':
    grades = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
        grades.append([name, score])
    
    # Write your logic here
    second_lowest = sorted(set([score for name,score in grades]))[1]
    print('\n'.join([name for name,score in sorted(grades) if score == second_lowest]))
