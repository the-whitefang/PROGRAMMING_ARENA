# program to find the largest element in the array
n = int(input("Enter the size of the array: ")) # enter the size of the array
num = []
print("Enter the Array elements: ")
for i in range(0,n): # for loop to enter the elements in array
    num.append(int(input()))
max = 0
for j in num: # for loop to find out the largest element
    if j> max:
        max= j
print("The Largest element in the array is: ", max)