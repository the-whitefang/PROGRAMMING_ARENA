# program to swap the first and last element of a list

n = int(input("Enter the size of list: "))
num = []
print("Enter the elements: ")
for i in range(0, n):
    num.append(int(input()))


def swap(num):
    num[0], num[-1] = num[-1], num[0]
    return num


print(swap(num))