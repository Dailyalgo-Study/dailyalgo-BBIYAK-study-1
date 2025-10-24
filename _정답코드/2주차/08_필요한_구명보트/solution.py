def solution(limit, people):
    people.sort()

    answer = 0
    passed = 0
    while passed < len(people):
        if people[passed] + people[-1] <= limit:
            answer += 1
            passed += 1
            people.pop()
        else:
            answer += 1
            people.pop()

    return answer

