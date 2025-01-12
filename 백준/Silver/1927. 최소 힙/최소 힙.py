import sys
import heapq

num = int(input())
heap = []

for i in range(num) :
    n = int(sys.stdin.readline().rstrip())
    if n == 0 :
        if len(heap) == 0 :
            print(0)
        else :
            print(heapq.heappop(heap))
    else :
        heapq.heappush(heap, n)