def solution(weight, height):
    # BMI 계산: 몸무게 / (키의 제곱)
    bmi = weight / (height * height)
    
    if bmi < 18.5:
        return "저체중"
    elif bmi < 23:
        return "정상"
    elif bmi < 25:
        return "과체중"
    else:
        return "비만"

