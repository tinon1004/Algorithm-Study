#내림차순 정렬
#순서대로 합 더하기

n = int(input())
arr= list(map(int, input().split()))
arr.sort()

answer=0
for i in range (1,n+1):
    answer += sum(arr[0:i])
     
print(answer)

