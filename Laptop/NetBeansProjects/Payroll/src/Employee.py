# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
#Call name for Employee class
main = ('__employee__' == __name__)

__author__ = "Carlos"
__date__ = "$Feb 10, 2016 2:29:24 PM$"

#Class
class Employee:
    #Employee first name last name input 
    def getName(self):
        #First name last name input
        fName = input("What is your first name? ")
        lName = input("Waht is your last name? ")
        #if block
        if fName and lName > 0: 
            wName = fName + " " + lName
            return wName
        else:
            print ("Incorrect input ")
    #Employee position 
    def getPosition(self):
        pos = input("What is your position? ")
        
        if pos[:] > 0:
            return pos
        else: 
            print ("Incorrect input ")
    
    #Returning employee name and title 
    def getEmp(self, fullEmp):
        fullEmp = "Title: " + getPosition() + " Name: " + getName()
        return fullEmp
    
        
        
    
    
        
    

