# program to check whether an element is present in a list or not.
n = int(input("Enter the size of the list: "))
num = []
print("Enter the elements: ")
for i in range(0, n):
    num.append(int(input()))

check = int(input("Enter the element that needs to be checked: "))
if check in num:
    print("The element is found ")
else:
    print("The element is not found")
