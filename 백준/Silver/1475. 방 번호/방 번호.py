n = input() 
array = [0] * 10 

for i in n:
    if i == '9' or i == '6': 
        if array[9] <= array[6]: 
            array[9] += 1       
        else:                    
            array[6] += 1      
    else:                    
        array[int(i)] += 1   

print(max(array))