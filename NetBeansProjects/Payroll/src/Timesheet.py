# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
#Call name for Employee class
main = ('__timesheet__' == __name__)

__author__ = "Carlos"
__date__ = "$Feb 10, 2016 2:29:42 PM$"

#Class
class TimeSheet:
    
    #Getting hours worked
    def getHours(self):
        hours = float(input("How many hours did you work this week: "))
        return hours 
    