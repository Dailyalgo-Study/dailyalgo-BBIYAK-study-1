def solution(participant, completion):
    freq = {}
    
    for name in participant:
        freq[name] = freq.get(name, 0) + 1
    
    for name in completion:
        freq[name] -= 1
    
    for name, count in freq.items():
        if count > 0:
            return name
    
    return ""

