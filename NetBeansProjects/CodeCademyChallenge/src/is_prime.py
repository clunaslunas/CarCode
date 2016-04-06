#! /usr/bin/python

# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

__author__ = "Carlos Luna"
__date__ = "$Mar 23, 2016 1:48:41 PM$"

num = int(input("Enter a prime or not prime number: "))
def is_prime(x):
    if x < 2: 
        print ("Is not a prime")
        return False
    else:
        for n in range(2, x-1):
            print (n)
            if x % n == 0:
                print ("Is not prime")
                return False 
        else:
            print ("Is a prime")
            return True

is_prime(num)