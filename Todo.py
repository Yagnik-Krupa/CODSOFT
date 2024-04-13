# To-do list program in Python

to_do_list = []

def display_to_do_list():
    print("To-do List:")
    for i, item in enumerate(to_do_list, 1):
        print(f"{i}. {item}")

def add_to_do_item():
    item = input("Enter the item to add to the to-do list: ")
    to_do_list.append(item)
    print("Item added to the to-do list.")

def remove_to_do_item():
    item_number = int(input("Enter the number of the item to remove from the to-do list: "))
    if item_number > len(to_do_list) or item_number < 1:
        print("Invalid item number. Please try again.")
    else:
        to_do_list.pop(item_number - 1)
        print("Item removed from the to-do list.")

while True:
    display_to_do_list()
    print("1. Add an item to the to-do list")
    print("2. Remove an item from the to-do list")
    print("3. Quit")
    user_choice = int(input("Enter your choice: "))
    if user_choice == 1:
        add_to_do_item()
    elif user_choice == 2:
        remove_to_do_item()
    elif user_choice == 3:
        break
    else:
        print("Invalid choice. Please try again.")