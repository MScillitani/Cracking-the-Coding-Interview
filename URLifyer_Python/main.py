# Converts all spaces into '%20'

string = input("Enter a string: ")  # gets user input

array = [char for char in string]  # converts user input to array

i = 0
while i < len(array):  # loops through chars in array and replaces spaces with %20
    if array[i] == " ":
        array[i] = "%20"
    i += 1  # increments by 1

result = ''.join(str(x) for x in array)  # converts array back to string

print(result)  # outputs result in console
