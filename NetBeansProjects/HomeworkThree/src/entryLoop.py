#! /usr/bin/python

# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
main = ('__entryLoop__' == __name__)

__author__ = "Carlos Luna"
__date__ = "$Mar 5, 2016 4:23:47 PM$"
#initialize a list 
def intake():
    values = []
    try:
        choice = int(input("1 to go, 0 to stop"))
    except:
        print("ERROR")
        return -1
    while choice == 1:
        num = int(input("Please enter an integer: "))
        values.append(num)
        choice = int(input("1 to go, 0 to stop"))
    else: 
        print ("DONE")
        return values

print(intake())

    
        
    