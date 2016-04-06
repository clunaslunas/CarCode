# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
main = ('__HashAlgorithm__' == __name__)

__author__ = "Carlos Luna"
__date__ = "$Mar 4, 2016 5:31:23 AM$"

#Function hash takes in string and produces hash value
def hash_new(key):
#initialize variable that will return ascii
    a = 1
#Step through passed in string value 
#take ascii variable and multiply by 'prime' 61
    for i in str(key):
        a = a * (ord(i) * 61)
    #Return ascii variable and perform bitwise AND operation cast as int 
    #Gurantees all positives 
    return int(a & 0x7fffffff)
        












