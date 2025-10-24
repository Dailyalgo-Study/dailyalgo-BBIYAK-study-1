def solution(numbers):
    str_numbers = [str(num) for num in numbers]
    str_numbers.sort(key=lambda x: x * 4, reverse=True)

    answer = "".join(str_numbers)

    if answer[0] == "0":
        answer = "0"

    return answer

