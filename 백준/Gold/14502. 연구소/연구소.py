from collections import deque
import copy

#바이러스 퍼뜨리기
def spread_virus(lab, virus_positions):
    directions = [(-1, 0), (1, 0), (0, -1), (0, 1)]
    queue = deque(virus_positions)
    
    while queue:
        x, y = queue.popleft()
        for dx, dy in directions:
            nx, ny = x + dx, y + dy
            if 0 <= nx < n and 0 <= ny < m and lab[nx][ny] == 0:
                lab[nx][ny] = 2
                queue.append((nx, ny))

#안전한 공간 계싼
def calculate_safe_area(lab):
    safe_count = 0
    for row in lab:
        safe_count += row.count(0)
    return safe_count

def build_walls(lab, empty_spaces, virus_positions, wall_count, start_index):
    global max_safe_area

    # 벽 3개를 모두 세운 경우
    if wall_count == 3:
        temp_lab = copy.deepcopy(lab)
        spread_virus(temp_lab, virus_positions)
        max_safe_area = max(max_safe_area, calculate_safe_area(temp_lab))
        return

    # 벽을 세울 위치 선택
    for i in range(start_index, len(empty_spaces)):
        x, y = empty_spaces[i]
        lab[x][y] = 1  # 벽 세우기
        build_walls(lab, empty_spaces, virus_positions, wall_count + 1, i + 1)
        lab[x][y] = 0  # 벽 제거

n, m = map(int, input().split())
lab = [list(map(int, input().split())) for _ in range(n)]

# 빈 칸과 바이러스 위치 찾기
empty_spaces = []
virus_positions = []
for i in range(n):
    for j in range(m):
        if lab[i][j] == 0:
            empty_spaces.append((i, j))
        elif lab[i][j] == 2:
            virus_positions.append((i, j))

max_safe_area = 0
build_walls(lab, empty_spaces, virus_positions, 0, 0)

print(max_safe_area)
