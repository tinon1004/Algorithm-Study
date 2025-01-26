N = int(input())
cards = set(map(int, input().split())) 
M = int(input())
queries = list(map(int, input().split())) 

result = []
for query in queries:
    if query in cards:
        result.append(1)
    else:
        result.append(0)

print(" ".join(map(str, result)))
