

from ast import List


class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:

        res = []
        def dfs(i, cur, total):
            if total == target:
                res.append(cur.copy())
                return
            if i >= len(candidates) or total > target:
                return 
            
            # if we choose to add candidates[i]
            cur.append(candidates[i])

            dfs(i, cur, total + candidates[i])

            # if we choose not to add candidates[i]

            cur.pop()

            dfs(i+1, cur, total)

        dfs(0, [], 0)

        return res
                
        