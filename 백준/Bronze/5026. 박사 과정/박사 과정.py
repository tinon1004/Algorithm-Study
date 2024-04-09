n = int(input())
for i in range(n):
    problem = input()
    if problem == "P=NP":
        print("skipped")
    else:
        a, b = map(int, problem.split('+'))
        print(a + b)