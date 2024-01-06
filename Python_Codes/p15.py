# python program to find the sum of the elements in the array
import numpy as np
l = [5, 10, 20, 30]
a = np.array(l)
sum =0
for x in a:
    sum += x

print(sum)