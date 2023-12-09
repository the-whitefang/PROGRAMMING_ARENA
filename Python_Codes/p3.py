#program to find the factorial of a number
num = int(input("Enter a number: "))
fact = 1
while num>0:
    fact = fact*num
    num = num-1
print("Factorial of the given number is: ", fact)