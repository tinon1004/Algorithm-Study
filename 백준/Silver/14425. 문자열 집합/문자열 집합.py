n, m = map(int, input().split())
map = {}
result = 0
for i in range(n):
    s = input()
    if not s in map:
        map[s] = True 
for i in range(m):
    g = input()
    if g in map.keys(): #
        result += 1

print(result)