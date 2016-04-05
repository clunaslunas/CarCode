# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
from TimeSheet import * 

__author__ = "Carlos"
__date__ = "$Feb 10, 2016 2:29:54 PM$"
#Class
class HourlyPay:
    
    #Hourly pay 
    def getPay(self):
        pay = float(input("What is your hourly pay? "))
        x = TimeSheet()
        return pay * x.getHours()
    
