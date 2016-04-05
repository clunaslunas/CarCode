# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

__author__ = "Carlos"
__date__ = "$Jan 25, 2016 7:56:27 AM$"

if __name__ == "__main__":    
    x = int(input("enter a number: "))
    y = int(input("enter another number: "))
    sum = x + y
    print ("The sum of ", x, " and ", y ," is " ,sum )
    if sum > 200: 
        print ("That is a big number")
    elif sum >= 150:
        print ("That is a medium number")
    else:  
        print ("That is a little number")
     
    
    
    