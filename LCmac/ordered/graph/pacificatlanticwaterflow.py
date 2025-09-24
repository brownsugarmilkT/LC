


directions = [[0,1], [0,-1], [-1,0], [1,0]]

pac = set()
atl = set()

rows, cols = len(heights), len(heights[0])

def dfs(r, c, visit, lastHeight):
    if (r,c) in visit or r<0 or c<0 or r>=rows or c>= cols or heights[r][c] < lastHeight:
        return 
    visit.add((r,c))

    for dr, dc in directions:
        dfs(r + dr, c + dc, visit, heights[r][c])

for r in range(rows):
    dfs(r, 0, pac, heights[r][0])
    dfs(r, cols -1, atl, heights[r][cols-1])

for c in range(cols):
    dfs(0, c, pac, heights[0][c])
    dfs(rows-1, c, atl, heights[rows-1][c])

res = pac & atl
return [[r.c] for (r,c) in res]

