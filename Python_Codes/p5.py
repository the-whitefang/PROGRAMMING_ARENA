# program to find the sum of elements in an array
n = int(input("Enter the size of the array: "))
num =[]
print("Enter the array elements: ")
for i in range(0,n):
    num.append(int(input()))
sum = 0
for j in num:
    sum += j
print("Sum of the elements in the array is: ",sum)