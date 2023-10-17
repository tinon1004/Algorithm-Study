# split()는 문자열을 공백을 기준으로 나누어 리스트로 반환한다.
a, b = input().split()

# replace()는 문자열을 치환하는 함수
# str.replace(old, new[, count])
min_value = int(a.replace('6', '5')) + int(b.replace('6', '5'))
max_value = int(a.replace('5', '6')) + int(b.replace('5', '6'))

print(min_value, max_value)