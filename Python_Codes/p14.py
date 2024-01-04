# program to find the cumulative sum of the elements in the list

a = [12, 34, 56, 43, 90, 11]

cumulative_sum_list = []
j = 0
for i in range(0, len(a)):
    j += a[i]
    cumulative_sum_list.append(j)

print(cumulative_sum_list)