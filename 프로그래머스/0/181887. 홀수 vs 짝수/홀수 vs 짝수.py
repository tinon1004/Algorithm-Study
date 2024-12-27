def solution(num_list):
    odd_sum = sum(num_list[i] for i in range(0, len(num_list), 2))
    even_sum = sum(num_list[i] for i in range(1, len(num_list), 2))
    
    return max(odd_sum, even_sum)