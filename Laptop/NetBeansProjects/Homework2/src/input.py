# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

__author__ = "Carlos"
__date__ = "$Feb 10, 2016 8:03:21 AM$"

class input: 
    #User input 
    def user_input(self):
        SIZE = int(input("Please enter size of array: "))
        BIG = int(input("Please enter the largest number of your range: "))
        
        if SIZE < BIG :
            return SIZE and BIG 
        else: 
            print ("Incorrect input")
            
x = input()
x.user_input()


