class Solution:
    def decompressRLElist(self, nums: List[int]) -> List[int]:
        index = 0
        result = []
        while index < len(nums):
            result += [nums[index+1]] * nums[index]
            index +=2
        return result

# Solution with while loop


        
