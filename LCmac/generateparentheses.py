from ast import List


class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        res = []
        

        def dfs(cur, left, right):
            if left == right == 0:
                res.append(cur)
                return

            if(left>0):
                dfs(cur + "(", left - 1, right)

            if(right>left):
                dfs(cur + ")", left, right-1)

        return dfs("", n, n)

        return res
           

            

            


        