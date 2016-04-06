#! /usr/bin/python

# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

__author__ = "Carlos"
__date__ = "$Mar 7, 2016 3:52:19 PM$"
""" The break statement, like in C, breaks out of the smallest enclosing 
    for or while loop.
"""

""" Loop statements may have an else clause; it is executed when the loop 
    terminates through exhaustion of the list (with for) or when the condition 
    becomes false (with while), but not when the loop is terminated by a break 
    statement. This is exemplified by the following loop, which searches for 
    prime numbers. 
"""

for n in range(2, 26):
    for x in range(2, n):
        if n % x == 0:
            print(n, 'equals', x, '*', n//x)
            break
    else:        
        print(n, 'is a prime number') # Loop fell through without finding a factor

"""
The continue statement, also borrowed from C, continues with the next iteration 
of the loop:
"""
for num in range(2,20):
    if num % 2 ==0:
        print('Found an even number: ', num)
        continue 
    for x in range(2,num):
        if num % x == 0:
            print(num, 'equals', x , '*', num//x)
            break
    else:
        print(num, 'is a prime number')
    print('Found an odd number', num)
    