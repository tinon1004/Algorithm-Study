t = int(input())

a = 5 * 60
b = 1 * 60
c = 10
button = [a, b, c]

pressed = []

for i in button:
    pressed.append(t // i)
    t %= i


print(*pressed)