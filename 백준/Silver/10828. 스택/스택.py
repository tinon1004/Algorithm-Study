from collections import deque
import sys

input = sys.stdin.readline

N = int(input())
stack = deque([])

for _ in range(N):
     order = input().strip()
   
     if "push" in order:
        o = order.split(" ")
        stack.append(o[1])

     elif order == "pop":
          if not stack:
               print(-1)
          else:
               print(stack.pop())
     
     elif order == "size":
          print(len(stack))
     
     elif order == "empty":
          if not stack:
               print(1)
          else:
               print(0)
     elif order == "top":
          if not stack:
               print(-1)
          else:
               print(stack[-1])