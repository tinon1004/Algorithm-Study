A = input().strip()
operator = input().strip()
B = input().strip()

if operator == '+':
    if len(A) > len(B):
        result = A[:len(A) - len(B)] + str(int(A[len(A) - len(B):]) + int(B))
    elif len(A) < len(B):
        result = B[:len(B) - len(A)] + str(int(B[len(B) - len(A):]) + int(A))
    else:
        result = str(int(A) + int(B))
elif operator == '*':
    result = '1' + '0' * (len(A) + len(B) - 2)

print(result)