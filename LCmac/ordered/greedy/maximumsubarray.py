left = 0
cur = 0
sum = -inf

for right in range(len(nums)):
    cur += nums[right]
    sum = max(sum, cur)

    if cur<1:
        left= right + 1
        cur = 0 
return sum