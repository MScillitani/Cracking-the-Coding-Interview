Tests if two strings of equal length are one edit away.

In the textbook, this was intended to allow strings of unequal length,
but I found this challenging to do in the time constraints. Later, I 
realized I could have made a method with two more variables, one being 
the char array +1 and another -1 in length and tested against those in 
the for-loop. If the length disparity is <> 2 then it would automatically 
output that they are not one edit away.
