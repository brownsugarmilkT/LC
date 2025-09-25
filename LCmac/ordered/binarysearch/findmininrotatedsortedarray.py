l, r = 0, len(nums)-1
        ans = inf
        while l<=r:
            if nums[l] < nums[r]:
                ans = min(ans, nums[l])
                break
            i = (l+r)//2
            ans = min(ans, nums[i])
            if nums[i]>= nums[l]:
                l = i + 1
            else:
                r = i - 1
        return ans