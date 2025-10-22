def solution(tasks):
    current_start = 0
    count = 0
    
    tasks.sort(key = lambda x : x[1])

    for task in tasks:
        if current_start <= task[0]:
            current_start = task[1]
            count += 1
    
    return count

