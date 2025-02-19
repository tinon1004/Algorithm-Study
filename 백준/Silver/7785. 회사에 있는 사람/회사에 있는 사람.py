import sys

n = int(sys.stdin.readline().strip())
log = set()

for _ in range(n):
    name, action = sys.stdin.readline().split()
    if action == "enter":
        log.add(name)
    elif action == "leave":
        log.discard(name)

for name in sorted(log, reverse=True):
    print(name)