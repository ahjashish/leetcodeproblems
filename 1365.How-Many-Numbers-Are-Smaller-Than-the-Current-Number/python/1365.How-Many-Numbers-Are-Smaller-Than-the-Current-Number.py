def smallerNumbersThanCurrent(nums):
        s = sorted(nums)
        d = dict()
        result = []
        for i, v in enumerate(s):
            if i > 0 and v == s[i-1]:
                result.append(result[i-1])
                d.update({v:result[i-1]})
            else:
                result.append(i)
                d.update({v:i})
                
        for i, v in enumerate(nums):
            result[i] = d[v]
        
        return result

nums = [6,5,4,8]
print(smallerNumbersThanCurrent(nums))
nums = [7,7,7,7]
print(smallerNumbersThanCurrent(nums))
