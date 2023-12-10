# Program to take 2 matrices as input and return its sum 

def input_matrix(rows, cols):
    matrix = []
    print(f"Enter elements for a {rows}x{cols} matrix: ")
    for i in range(rows):
        row = []
        for j in range(cols):
            element = float(input(f"Enter element at position ({i+1},{j+1}): "))
            row.append(element)
        matrix.append(row)
    return matrix

def add_matrices(matrix1, matrix2):
    result_matrix = []
    for i in range(len(matrix1)):
        row = []
        for j in range(len(matrix1[0])):
            sum_element = matrix1[i][j] + matrix2[i][j]
            row.append(sum_element)
        result_matrix.append(row)
    return result_matrix

def display_matrix(matrix):
    for row in matrix:
        print(row)

# Get matrix dimensions from the user
rows = int(input("Enter the number of rows: "))
cols = int(input("Enter the number of columns: "))

# Input the first matrix
matrix1 = input_matrix(rows, cols)

# Input the second matrix
matrix2 = input_matrix(rows, cols)

# Add the matrices
result = add_matrices(matrix1, matrix2)

# Display the result
print("\nMatrix 1:")
display_matrix(matrix1)

print("\nMatrix 2:")
display_matrix(matrix2)

print("\nSum of the matrices:")
display_matrix(result)
