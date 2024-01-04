# program to find the smallest number in the list
a = [12,45,23,67,23,67,2,78]
smallest = a[0]
for x in a:
    if x < smallest:
        smallest = x

print(f"Smallest number: {smallest}") 