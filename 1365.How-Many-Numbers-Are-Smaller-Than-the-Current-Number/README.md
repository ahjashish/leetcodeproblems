- Talk through the brute force solution if the optimized solution doesn't come to mind.

- Since the problem is asking for numbers smaller than current, try sorting it.

- After sorting, need a way to put the resultant value in the same index as the original input. Use a HashTable with element as the key and smaller numbers as the value (Hint: since we are working with the sorted array, smaller numbers is the same as index).

- In this problem, the author provided examples with duplicates. In an interview setting, the interviewer might not so ask if duplicates are allowed/possible in the input. If they are, like in this problem, how do we solve for them? Since we sorted the array, the duplicates would be beside each other so just use the previous value.
