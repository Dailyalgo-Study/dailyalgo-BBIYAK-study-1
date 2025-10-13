def solution(hangul_numbers):
    hangul_mapping = {
        "공": "0", "하나": "1", "둘": "2", "셋": "3", "넷": "4",
        "다섯": "5", "여섯": "6", "일곱": "7", "여덟": "8", "아홉": "9",
        "영": "0", "일": "1", "이": "2", "삼": "3", "사": "4",
        "오": "5", "육": "6", "칠": "7", "팔": "8", "구": "9"
    }
    translate = hangul_numbers
    for hangul, digit in hangul_mapping.items():
        translate = translate.replace(hangul, digit)
    return translate