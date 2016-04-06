#! /usr/bin/python

# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

__author__ = "Carlos"
__date__ = "$Mar 7, 2016 10:27:27 AM$"

def file_input(numArray):
    filename = input("Please enter file name to open \n hw3a.txt \n hw3b.txt " + 
                    " \n hw3c.txt: ") #Gets file name
    file = open(filename,'r') # opens file
    
    i = "true"
    
    #Loop to fill numArray
    while i == "true":
    
        value = file.readline()
        if value == '': # Checking for end of file
            i = "false"
            break
        elif value == '\n': # Checking for end of file
            i = "false"
            break
        else:
            iValue = int(value) # turns read value into an intager
            numArray.append(iValue) # adds read value to end of list
            
            
    # returns file name so we can print later on
    return filename

def hashing_Values(hshArry, numArray):

    # Counters
    i = 0 # Counts through the while loop
    j = 0 # counts through the number array
    
    # Creating the list and the array that holds them
    arrayOfBuckets = [0,0,0,0,0,0,0,0,0,0,0] # Array that holds list
    hsh0 = list() # Holds % 0
    hsh1 = list() # Holds % 1
    hsh2 = list() # Holds % 2
    hsh3 = list() # Holds % 3
    hsh4 = list() # Holds % 4
    hsh5 = list() # Holds % 5
    hsh6 = list() # Holds % 6
    hsh7 = list() # Holds % 7
    hsh8 = list() # Holds % 8
    hsh9 = list() # Holds % 9
    hsh10 = list() # Holds % 10
    
    # While loop that incraments through the buckets
    while i < len(numArray):
        # Hashing the input values
        hashVal = numArray[j] % 11
        
        # if statements that place number in bucket
        if hashVal == 0:
            hsh0.append(numArray[j]) # adds the value to list with that mod
            hshArry[0] += 1         # counts buckets
        elif hashVal == 1:
            hsh1.append(numArray[j]) # adds the value to list with that mod
            hshArry[1] += 1         # counts buckets
        elif hashVal == 2:
            hsh2.append(numArray[j]) # adds the value to list with that mod
            hshArry[2] += 1         # counts buckets
        elif hashVal == 3:
            hsh3.append(numArray[j]) # adds the value to list with that mod
            hshArry[3] += 1         # counts buckets
        elif hashVal == 4:
            hsh4.append(numArray[j]) # adds the value to list with that mod
            hshArry[4] += 1         # counts buckets
        elif hashVal == 5:
            hsh5.append(numArray[j]) # adds the value to list with that mod
            hshArry[5] += 1         # counts buckets 
        elif hashVal == 6:
            hsh6.append(numArray[j]) # adds the value to list with that mod
            hshArry[6] += 1         # counts buckets
        elif hashVal == 7:
            hsh7.append(numArray[j]) # adds the value to list with that mod
            hshArry[7] += 1         # counts buckets
        elif hashVal == 8:
            hsh8.append(numArray[j]) # adds the value to list with that mod
            hshArry[8] += 1         # counts buckets
        elif hashVal == 9:
            hsh9.append(numArray[j]) # adds the value to list with that mod
            hshArry[9] += 1         # counts buckets
        elif hashVal == 10:
            hsh10.append(numArray[j]) # adds the value to list with that mod
            hshArry[10] += 1         # counts buckets
        j +=1 # Incramenting i
        i +=1 # Incramenting j
        
        
    # adding list to array
    arrayOfBuckets[0] = hsh0
    arrayOfBuckets[1] = hsh1
    arrayOfBuckets[2] = hsh2
    arrayOfBuckets[3] = hsh3
    arrayOfBuckets[4] = hsh4
    arrayOfBuckets[5] = hsh5
    arrayOfBuckets[6] = hsh6
    arrayOfBuckets[7] = hsh7
    arrayOfBuckets[8] = hsh8
    arrayOfBuckets[9] = hsh9
    arrayOfBuckets[10] = hsh10
            
        
    #returning the bucket array
    return arrayOfBuckets

def print_to_file(file, numArray, hshArry):
    sFile = file
    # Accessing the file
    file = open("hw3output3.txt","w")
    
    # creating out puts
    a = "The file was " + str(sFile)
    b = "The length of the file was " + str(len(numArray))
    e = "Used an array of list so no over flow, or collisions."
    d = "There are seven buckets"
    c1 = "The size of the first bucket: " + str(hshArry[0])
    c2 = "The size of the second bucket: " + str(hshArry[1])
    c3 = "The size of the third bucket: " + str(hshArry[2])
    c4 = "The size of the fourth bucket: " + str(hshArry[3])
    c5 = "The size of the fifth bucket: " + str(hshArry[4])
    c6 = "The size of the sixth bucket: " + str(hshArry[5])
    c7 = "The size of the seventh bucket: " + str(hshArry[6])
    d = "This was printed to hw3output.txt"
    
    # Printing to the screen
    print(a)
    print(b)
    print(c1)
    print(c2)
    print(c3)
    print(c4)
    print(c5)
    print(c6)
    print(c7)
    print(d)
    
    # printing to file
    file.write(a + '\n')
    file.write(b + '\n')
    file.write(e + '\n')
    file.write(d + '\n')
    file.write(c1 + '\n')
    file.write(c2 + '\n')
    file.write(c3 + '\n')
    file.write(c4 + '\n')
    file.write(c5 + '\n')
    file.write(c6 + '\n')
    file.write(c7 + '\n')
    file.write(d)
    file.close()


#**************************************************
# This is where the main starts
#**************************************************

# The varables
numArray = list()                 # Holds data from file
hshArry = [0,0,0,0,0,0,0,0,0,0,0]       # holds the number of buckets in each list
listtWithBuckets= [0,0,0,0,0,0,0,0,0,0,0] # Holds the bucketed list

# The def calls
file = file_input(numArray)
listWithBuckets = hashing_Values(hshArry, numArray)
print_to_file(file, numArray, hshArry)