from collections import deque

N, M, T = map(int,input().split())
board = [deque(map(int,input().split())) for _ in range(N)]
rotation_list = [list(map(int,input().split())) for _ in range(T)]


answer=0


for turn in range(T):


        x, d, k = rotation_list[turn]



        #x 배수의 원판 구하기
        # d 방향에 따라 회전시키기
        for i in range(N):
            # i가 0부터 시작되기 때문에 x배수는 i+1을 통해 구함
            if (i +1)% x == 0:
                if d == 0 :
                    board[i].rotate(k)
                elif d == 1:
                    board[i].rotate(-k)

        remove = set()

        #1. 같은 원판 내 동일 숫자 확인
        for i in range(N):
            for j in range(M):
                if board[i][j] == board[i][(j+1)%M] and board[i][j] != 0:
                    remove.add((i,j))
                    remove.add((i, (j+1)%M))


    # 다른 원판 인접한 동일 숫자 확인
        for j in range(M):
            #제일 바깥 원판은 다음 원판과 비교할 수 없기 때문에 -1
            for i in range(N-1):
                if board[i][j] == board[i+1][j] and board[i][j] != 0:
                    remove.add((i,j))
                    remove.add((i+1, j))


        #remove 좌표 0으로 바꾸기
        for i,j in remove:
            board[i][j] = 0

        #2. 지울 숫자가 없는 경우 평균 구하기
        if not remove:
            total_sum = 0
            count = 0
            average = 0

            total_sum = sum(sum(board[i]) for i in range(N))
            for i in range (N):
                for j in range(M):
                    if board[i][j] !=0:
                        count +=1
            if count > 0 and total_sum > 0:
                average = total_sum / count

                for i in range(N):
                    for j in range(M):
                        if average > board[i][j] and board[i][j] != 0:
                            board[i][j] +=1
                        elif average < board[i][j] and board[i][j] != 0:
                            board[i][j] -= 1

answer = sum(sum(board[i]) for i in range(N))
print(answer)