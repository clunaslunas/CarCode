#! /usr/bin/python

# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

__author__ = "Carlos Luna"
__date__ = "$Feb 11, 2016 5:56:45 AM$"

prices = {
    "banana" : 4,
    "apple"  : 2,
    "orange" : 1.5,
    "pear"   : 3,
}
stock = {
    "banana" : 6,
    "apple"  : 0,
    "orange" : 32,
    "pear"   : 15,
}
shopping_list = ["banana", "orange", "apple"]
s = shopping_list
for foods in s:
    print (foods)

    total = 0 
    for foods in prices:
        total += (prices[foods] * stock [foods])
        print (total)
    
    