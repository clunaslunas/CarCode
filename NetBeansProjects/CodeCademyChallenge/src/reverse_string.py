#! /usr/bin/python

# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

__author__ = "Carlos Luna"
__date__ = "$Mar 24, 2016 7:07:36 AM$"

strng = input("Enter a string: ")

def reverse_string(str):
    x = ""
    for i in str:
        x = i + x
        print (x)
    return x
        
reverse_string(strng)
    
