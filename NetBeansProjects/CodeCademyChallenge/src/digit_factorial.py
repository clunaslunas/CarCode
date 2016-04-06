#! /usr/bin/python

# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

__author__ = "Carlos Luna"
__date__ = "$Mar 23, 2016 6:55:10 AM$"

num = 9

def factorial (x):
    nums = []
    nums = list((range(x, 0, -1)))
    print(nums)
    product = 1
    for i in nums:
        product *= i
        print (product)
        
        
    
factorial(9)
