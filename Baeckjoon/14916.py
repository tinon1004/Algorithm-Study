charge = int(input())
count = 0

while charge>0:
    if charge % 5 == 0:
        count += charge // 5
        charge = charge % 5
        break
    else:
        charge -= 2
        count += 1


if charge<0:
    print(-1)
else:
    print(count)
