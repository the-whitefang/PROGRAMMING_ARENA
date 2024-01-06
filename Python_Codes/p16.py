# program to find the largest element in the array

import numpy as np
n = int(input("Enter the size of the array: "))
print("Enter the Array elements: ")
num_list = []
for i in range(0,n):
    num_list.append(int(input()))
num_arr = np.array(num_list)

max_ele = num_arr[0]
for x in num_arr:
    if x > max_ele:
        max_ele = x

print(f"The Maximum Element in the Array is: {max_ele}")