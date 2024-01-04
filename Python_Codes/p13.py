# program to find the occurances of a given element in a list

a = [12,34,45,6,23,4,5,2,6,33,2,45,88,997,2,1]

num = int(input("Enter the element you wish to find: "))
count = 0
for x in range(0,len(a)):
    if a[x] == num:
        count += 1

print(f"Occurance of {num} in list < ' a ' > is: {count}")