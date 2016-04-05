#REmi Arata
#Home Wrok 3

main = '__main__' == __name__

#***********************************************
# Method that explains program
def explainProg ():
    print ("This program hashes a data file.")
    print ("This program is writing to hw3output.txt")
    
#**********************************************
#MEthod that gets inputs from user
def getInputs (numArray):
    # prompting users for inputs
    print ("Avlible files are: ")
    # These are the valid inputs
    print("hw3a.txt")
    print("hw3b.txt")
    print("hw3c.txt")
    print("hw3d.txt")
    
    # Accessing the input file
    filename = input("Please enter file name: ") #Gets file name
    file = open(filename,'r') # opens file
    
    #counters and loop incraenters
    i = "true"
    
    # while loop that fills numArray
    while i == "true":
        value = file.readline()
        if value == '': # CHecking for end of file
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
        
        
#**********************************************
# MEthod that hashes the values
def hashingValues (hashArray, numArray):

    # Counters
    i = 0 # Counts through the while loop
    j = 0 # counts through the number array
    
    # Creating the list and the array that holds them
    arrayOfBuckets = [0,0,0,0,0,0,0] # Array that holds list
    hash0 = list() # Holds % 0
    hash1 = list() # Holds % 1
    hash2 = list() # Holds % 2
    hash3 = list() # Holds % 3
    hash4 = list() # Holds % 4
    hash5 = list() # Holds % 5
    hash6 = list() # Holds % 6
    
    # While loop that incraments through the buckets
    while i < len(numArray):
        # Hashing the input values
        hashVal = numArray[j] % 7
        
        # if statements that place number in bucket
        if hashVal == 0:
            hash0.append(numArray[j]) # adds the value to list with that mod
            hashArray[0] += 1         # counts buckets
        elif hashVal == 1:
            hash1.append(numArray[j]) # adds the value to list with that mod
            hashArray[1] += 1         # counts buckets
        elif hashVal == 2:
            hash2.append(numArray[j]) # adds the value to list with that mod
            hashArray[2] += 1         # counts buckets
        elif hashVal == 3:
            hash3.append(numArray[j]) # adds the value to list with that mod
            hashArray[3] += 1         # counts buckets
        elif hashVal == 4:
            hash4.append(numArray[j]) # adds the value to list with that mod
            hashArray[4] += 1         # counts buckets
        elif hashVal == 5:
            hash5.append(numArray[j]) # adds the value to list with that mod
            hashArray[5] += 1         # counts buckets 
        elif hashVal == 6:
            hash6.append(numArray[j]) # adds the value to list with that mod
            hashArray[6] += 1         # counts buckets
        j +=1 # Incramenting i
        i +=1 # Incramenting j
        
        
    # adding list to array
    arrayOfBuckets[0] = hash0
    arrayOfBuckets[1] = hash1
    arrayOfBuckets[2] = hash2
    arrayOfBuckets[3] = hash3
    arrayOfBuckets[4] = hash4
    arrayOfBuckets[5] = hash5
    arrayOfBuckets[6] = hash6
            
        
    #returning the bucket array
    return arrayOfBuckets


#**************************************************
#Method that writes to a file
def printToFile (file, numArray, hashArray):
    sFile = file
    # Accessing the file
    file = open("hw3output.txt","w")
    
    # creating out puts
    a = "The file was " + str(sFile)
    b = "The length of the file was " + str(len(numArray))
    e = "Used an array of list so no over flow, or collisions."
    d = "There are seven buckets"
    c1 = "The size of the first bucket: " + str(hashArray[0])
    c2 = "The size of the second bucket: " + str(hashArray[1])
    c3 = "The size of the third bucket: " + str(hashArray[2])
    c4 = "The size of the fourth bucket: " + str(hashArray[3])
    c5 = "The size of the fifth bucket: " + str(hashArray[4])
    c6 = "The size of the sixth bucket: " + str(hashArray[5])
    c7 = "The size of the seventh bucket: " + str(hashArray[6])
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
hashArray = [0,0,0,0,0,0,0]       # holds the number of buckets in each list
listtWithBuckets= [0,0,0,0,0,0,0] # Holds the bucketed list

# The def calls
explainProg()
file = getInputs(numArray)
listWithBuckets = hashingValues(hashArray, numArray)
printToFile(file, numArray, hashArray)