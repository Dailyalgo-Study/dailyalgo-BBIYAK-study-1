def solution(img):
    
    #1. 모두 같은 경우
    def all_same(arr, x, y, size):

        first_value = arr[x][y]
        for i in range(x, x + size):
            for j in range(y, y + size):
                if arr[i][j] != first_value:
                    return False
        return True

    def compress(arr, x, y, size):
        # compress(img, 0,0,len(img) == 8)
        if size == 1 or all_same(arr, x, y, size):
            return str(arr[x][y]) # arr[0][0]
        
        half = size // 2 # 8 // 2  == 4
        result = "("
        result += compress(arr, x, y, half)              # 좌상
        result += compress(arr, x, y + half, half)       # 우상
        result += compress(arr, x + half, y, half)       # 좌하
        result += compress(arr, x + half, y + half, half)# 우하
        result += ")"

        return result

    # 전체 배열을 압축
    return compress(img, 0, 0, len(img))


## 테스트 케이스 2번
# all_same -> false
# compress -> 좌상단 -> all_same -> False
#           -> 우상단 -> all_same -> True
#           -> 좌하단  //
#           -> 우하단  // 

# 좌상단 4등분 -> 10000/0/0/0