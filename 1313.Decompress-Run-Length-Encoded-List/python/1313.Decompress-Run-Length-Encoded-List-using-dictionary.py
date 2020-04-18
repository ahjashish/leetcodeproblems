class Solution:
    def decompressRLElist(self, nums: List[int]) -> List[int]:

	# Solution with while loop
        index = 0
        result = []
        while index < len(nums):
            result += [nums[index+1]] * nums[index]
            index +=2
        return result

# Solution with extend method

	result = []
        for i in range(0,len(nums),2):
            result.extend([nums[i+1]] * nums[i])
        return result
        
        
        
