# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
import cmath
import unittest 
__author__ = "Carlos Luna"
__date__ = "$Apr 23, 2016 12:32:32 PM$"
d = "string"
class quadformula:
    def solveQuad():
        try:
            ''' Get coeffeciencts a, b, and c from user'''
            a = float(input("Coefficient a: "))
            b = float(input("Coefficient b: "))
            c = float(input("Coefficient c: "))

            if a != 0:
                ''' Square root portion'''
                sqRt = cmath.sqrt((b * b) - 4*a*c)
                '''Root 1'''
                root1 = (-b + sqRt)/2 * a
                '''Root 2'''
                root2 = (-b - sqRt)/2 * a
                '''String solutions together'''
                print ("The solution to ", a,"x^2 + ", b,"x + ", c, " = 0 is: ",
                        "x : ", root1, " x : ", root2)
                answr = (root1, root2)
                return answr
            else:
                if c > 0 and b > 0: 
                    x = -c/b
                elif c > 0 and b != 0:
                    x = c/b
                else:
                    x = c
                print ("Linear so x is: ", x)
                return x
        except:
            print("FUBAR, please enter an integer, or a float: ")
            quadformula.solveQuad()

if __name__ == '__main__': 
    quadformula.solveQuad()
    
    
    
