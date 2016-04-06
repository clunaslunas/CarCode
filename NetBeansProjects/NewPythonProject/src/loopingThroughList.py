#! /usr/bin/python

# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

__author__ = "Carlos Luna"
__date__ = "$Feb 12, 2016 6:17:15 AM$"

stock = {
    "banana": 6,
    "apple": 0,
    "orange": 32,
    "pear": 15
}
    
prices = {
    "banana": 4,
    "apple": 2,
    "orange": 1.5,
    "pear": 3
}

shopping_list = ["banana", "orange", "apple"]
s = shopping_list
for foods in s:
    print (foods)
    
def compute_bill(foods):
        total = 0
        for foods in prices:
            total += prices[foods]
            print (total)
            
x = compute_bill(foods)
print(x)

    
