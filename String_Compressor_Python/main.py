# Compresses any string!

string = input("Enter string to compress: ")  # saves user-input as string
length = len(string)  # gets length of string
result = ""  # sets result as null

if length == 0:  # if string length is 0, prints nothing
    print("")

if length == 1:  # if string length is 1, prints string (no way to compress further)
    print(string)

count = 1  # letter count
i = 1  # used in while-loop to keep track of index position

while i < length:  # while-loop, ends when i equals the string length
    if string[i] != string[i - 1] and i == 1:  # prevents first char being "compressed" when matching with last char
        result = result + string[i - 1]
    elif string[i] != string[i - 1] and string[i - 1] != string[i - 2]:  # skips non-matching chars
        result = result + string[i - 1]
    elif string[i] == string[i - 1]:  # adds to 1 to count for every successive matching char
        count += 1
    else:  # concat previous result with current char and count
        result = result + string[i-1] + str(count)
        count = 1  # resets count to 1
    i += 1  # increments by 1
# ternary operator -- concat result with most recent char, with count if condition is met
result = result + string[i - 1] if (string[i - 1] != string[i - 2]) else result + string[i - 1] + str(count)

print(result)  # prints result to terminal
