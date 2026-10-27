class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        maxone = 0
        count = 0

        for i in range(len(nums)):

            if nums[i]==1:
                count = count+1
                if count>maxone:
                    maxone = count
            else:
                count=0
        
        return maxone