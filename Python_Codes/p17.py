# program to find remainder of array multiplication divided by n

import numpy as np
n = int(input("Enter the size of the array: "))
print("Enter the Array elements: ")
num_list = []
for i in range(0,n):
    num_list.append(int(input()))
num_arr = np.array(num_list)

num = int(input("Enter the value: "))
prod =1
for i in range(0,n):
    prod *= num_arr[i]

print(prod % num)