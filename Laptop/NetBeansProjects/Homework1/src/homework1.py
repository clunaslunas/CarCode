
import time
import sys
__author__ = "Carlos"
__date__ = "$Jan 31, 2016 6:16:53 AM$"


def intake ():
    try:
        num = int(input("Please enter a digit that is greater than zero, no " +\
                        "characters please, and no decimals: "))
    except: 
        print ("Error wrong number")
        return -1
    
    if num > 0:
            return num
        #Cannot figure out how to throw an error 
    else:
            print ("The digit you entered does not fall under the conditions")
            return -1   
            
n = intake()
def sumit(n):
    sum = 0 
    for k in range (n + 1):
        sum += k
    return int(sum)
print (sumit(n))
    
def fastsum(n):
    sum = n*(n+1)/2
    return sum
print (fastsum(n))
    

#time sumit version
t0 = time.time()
x = sumit(n)
t1 = time.time()
print ("Sumit version timer: n = ",n ,"time = ", t1-t0)
    
#time fastsum version
t0 = time.time()
x = fastsum(n)
t1 = time.time()
print ("Fastsum version timer: n = ",n ,"time = ", t1-t0)
    