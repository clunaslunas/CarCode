# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
from HourlyPay import * 
from Timesheet import * 

main = ()
__author__ = "Carlos"
__date__ = "$Feb 10, 2016 2:30:06 PM$"

class OverTime:
    
    #Calculating hourly pay 
    def getOT(self):
        t = Timesheet()
        p = HourlyPay()
        OT = ((t.getHours - 40) * t.getPay())
        print ("You worked " + (t.getHours - 40) + " and earned an additional" +\
                + OT)
        return OT
