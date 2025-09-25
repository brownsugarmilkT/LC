if nums[0]==0 and len(nums)==1:
            return True
        dist = 0
        dp = [False]*(len(nums))
        i = len(nums) - 1
        while i > -1:
            if nums[i]>=dist:
                dp[i] = True
                dist = 1
            else:
                dist+=1
            i -=1

        return True if dp[0] else False