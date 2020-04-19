/**
 * @param {number[]} nums
 * @return {number[]}
 */
var decompressRLElist = function(nums) {
    //dividing into sub lists
    //brute force
  const output = [];
    
    for (let i = 0; i < nums.length - 1; i += 2) {        
        for (let j = 0; j < nums[i]; j++) {
            output.push(nums[i + 1]);
        }
    }
    
    return output;
};