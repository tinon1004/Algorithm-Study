n = int(input())  
postfix = input().strip()  # 후위 표기식
values = [int(input()) for _ in range(n)] 

# 피연산자 값을 딕셔너리로 매핑
operand_values = {chr(65 + i): values[i] for i in range(n)}
stack = []

for char in postfix:
     # 피연산자인 경우
    if char.isalpha(): 
        stack.append(operand_values[char])
    # 연산자인 경우    
    else:  
        b = stack.pop()
        a = stack.pop()
        
        if char == '+':
            stack.append(a + b)
        elif char == '-':
            stack.append(a - b)
        elif char == '*':
            stack.append(a * b)
        elif char == '/':
            stack.append(a / b)

result = stack.pop()
print(f"{result:.2f}")
