# Calculator program in Python

# Function to perform addition
def add(x, y):
    return x + y

# Function to perform subtraction
def subtract(x, y):
    return x - y

# Function to perform multiplication
def multiply(x, y):
    return x * y

# Function to perform division
def divide(x, y):
    if y == 0:
        raise ValueError("Cannot divide by zero")
    return x / y

# Main program loop
while True:
    try:
        # Prompt user to enter two numbers
        num1 = float(input("Enter the first number: "))
        num2 = float(input("Enter the second number: "))

        # Prompt user to choose an operation
        print("Choose an operation:")
        print("1. Add")
        print("2. Subtract")
        print("3. Multiply")
        print("4. Divide")
        operation = int(input("Enter your choice: "))

        # Perform the chosen operation
        if operation == 1:
            result = add(num1, num2)
        elif operation == 2:
            result = subtract(num1, num2)
        elif operation == 3:
            result = multiply(num1, num2)
        elif operation == 4:
            result = divide(num1, num2)
        else:
            print("Invalid choice. Please try again.")
            continue

        # Print the result
        print(f"The result is {result}")

        # Prompt user to continue
        continue_calc = input("Do you want to continue? (yes/no) ")
        if continue_calc.lower()!= "yes":
            break

    except ValueError as e:
        print(e)
        print("Please enter a valid number.")