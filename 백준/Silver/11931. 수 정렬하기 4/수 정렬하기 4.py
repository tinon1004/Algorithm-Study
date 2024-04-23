import sys
input = sys.stdin.readline

n = int(input())
arr=[]

for i in range(n):
    num = int(input())
    arr.append(num)

arr=sorted(arr, reverse= True)


for arr in arr:
    print(arr)