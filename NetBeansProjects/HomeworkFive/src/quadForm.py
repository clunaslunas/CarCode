# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
import cmath
__author__ = "Carlos"
__date__ = "$Apr 25, 2016 8:03:22 AM$"
class quadForm:
    def takeInput():
        try:
            a = float(input("Please enter a number: "))
            b = float(input("Please enter a number: "))
            c = float(input("Please enter a number: "))
            return a, b, c
        except:
            print("invalid input, please try again")
            quadForm.takeInput()
    
    def sqRoot(self,coA, coB, coC):
        return cmath.sqrt((coB * coB) - ((4*coA)*coC))
    
    def posRoot(self,coA, coB, sqRt):
        return ((-coB + sqRt)/ (2 * coA))
    
    def negRoot(self, coA, coB, sqRt):
        return ((-coB - sqRt)/ (2 * coA))
        
    def linNegC(self, coB, coC):
        return -coC/coB
        
    def linPosC(self, coB, coC):
        return coC/coB
        
    def allZero(self, coA, coB, coC):
        return coC
    

if __name__ == '__main__': 
    a, b, c = quadForm.takeInput()
    if a != 0:
        squareRoot = quadForm().sqRoot(a, b, c)
        rootOne = quadForm().posRoot(a, b, squareRoot)
        rootTwo = quadForm().negRoot(a, b, squareRoot)
        print(a,"x^2 + ", b, "x + ", c," = 0 : ", "x: ", rootOne, rootTwo)
    else:
        if c > 0 and b > 0:
            x = quadForm().linNegC(b, c)
        elif c > 0 and b != 0:
            x = quadForm().linPosC(b, c)
        else:
            x = c
        print("This is a linear equation, x equals: ", x)
            
    