# program to find whether it is an armstrong number or not
num = int(input("Enter a number: "))
num1 = num
i = len(str(num))
arm =0
while num!=0:
    ld = num % 10
    arm = arm + (pow(ld,i))
    num = num //10
if arm == num1:
    print(f"The given number {num1}, is  an Armstrong Number.")
else:
    print(f"The given number {num1}, is not an Armstrong Number.")