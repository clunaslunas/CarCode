# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

__author__ = "Carlos"
__date__ = "$Feb 1, 2016 5:24:56 AM$"

def intake ():
    """Testing output of intake"""
    num = int(input("Please enter a digit that is greater than zero, no " +\
                        "characters please, and no decimals: "))
    if int(num) and num > 0:
            return num
        #Cannot figure out how to throw an error 
    elif float(num):
            print ("The digit you entered does not fall under the conditions")
            
n = intake()
print(n)
