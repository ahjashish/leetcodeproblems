**Was a classic question of DATA STRUCTURES**
- Need to analyze dynamic linear structure like ArrayLists, LinkedLists that give the capability to shift elements on inserting at an index.

**Alternate without using a built in method or structure**
- If had to be done without using such a structure I guess looping over and shifting elements one by one would be the solution but gives time limit exceded exception for me.
- Also based on the constraint that `index[i] <= i` always we could use it to say then at any given `i` the value at `index[i]` 
would either be `i` in that case it's the normal flow and we can just put the value as it is.
Else we should staring from the location value at `index[i]` start shifting elements to the right.
- There might be some optimization possible if we are able to figure out how many time will a position shift to right with some pre-processing.
