#! /usr/bin/python

# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

__author__ = "Carlos"
__date__ = "$Mar 7, 2016 2:37:38 PM$"
x = int(input("please enter a digit: "))

if x < 0:     
    print(x, " changed to zero")
    x = 0
    print(x)
elif x == 0: 
    print('Zero. ')
elif x == 1: 
    print('Single. ')
else: 
    print('More. ')
    