def decompressRLElist(nums):
        index = 0
        result = []
        while index < len(nums):
            result += [nums[index+1]] * nums[index]
            index +=2
        return result

nums = [1,2,3,4]
print(decompressRLElist(nums))
nums = [1,1,2,3]
print(decompressRLElist(nums))
            
# Solution with while loop

