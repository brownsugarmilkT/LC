from ast import List


class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        res = set()
        

        subsets = []

        def dfs(i):
            if i>=len(nums):
                
                res.add(tuple(subsets))
                return
            
            # decision to include nums[i]

            subsets.append(nums[i])
            dfs(i+1)

            # decision to NOT include nums[i]

            subsets.pop()
            dfs(i+1)
        nums.sort
        
        dfs(0)
        return res


        