# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
from mergesort import *
import random
import time
__author__ = "Carlos"
__date__ = "$Feb 10, 2016 7:45:26 AM$"

#Obtaining size of array
def getSize(): 
    SIZE_input = int(input("Please enter the size of the array: "))
    if SIZE_input > 0: 
        return SIZE_input
    else: 
        print ("Incorrect input")
            
# Obtaining range        
def getRange():
    BIG_input = int(input("Please enter the largest number in range: "))
    if BIG_input > 0: 
        return BIG_input
    else:
        print ("Incorrect input")

s = getSize()
r = getRange()
L = random.sample(range(1,r), s)


print (L)

#time sort version

    
t0 = time.time()
print(MergeList.mergeSort(L))
t1 = time.time()
print ("Sort version timer: n = ","time = ", (t1-t0))