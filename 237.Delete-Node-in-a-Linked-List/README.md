It's a tricky question when it comes to actually understanding the question.

- The question does not give you the start of the linked list, instead gives you the reference to the node to be deleted directly.

- The way to do the would be something similar to what's done in **bubble sort**. We try to bubble out the node to the end of the link and then remove it from the end of the node by __pointing n-1 node's next to null__ delinking the last node.
