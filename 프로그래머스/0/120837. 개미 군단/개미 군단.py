def solution(hp):
    power=[5,3,1]
    count = 0
    
    for i in power:
        count += hp // i  #몫
        hp = hp % i  #나머지
        
    return count