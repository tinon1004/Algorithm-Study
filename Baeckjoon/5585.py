pay = int(input())
coin= [500, 100 , 50, 10, 5 ,1 ]
count = 0
charge = 1000 - pay

for i in coin:
    if i <= charge:
        count += (charge // i) # 몫
        charge = (charge % i) # 나머지

print(count)
