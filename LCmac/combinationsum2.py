from ast import List


class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        
        res = []
        def dfs(pos, cur, target):
            if target == 0:
                res.append(cur.copy())
                return
            if target<=0:
                return 
             
            prev = -1

            for i in range(pos, len(candidates)):

                if candidates[i] == prev:
                    continue

                # if we choose to add candidates[i]
                cur.append(candidates[i])

                dfs(i+ 1 , cur, target- candidates[i])

                # if we choose not to add candidates[i]

                cur.pop()
                prev = candidates[i]

                
        candidates.sort()
        dfs(0, [], target)

        return res

        