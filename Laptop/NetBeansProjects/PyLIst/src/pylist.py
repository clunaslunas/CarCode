# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

__author__ = "Carlos"
__date__ = "$Feb 1, 2016 5:28:24 PM$"
class PyList:
    def _init_(self,contents = [], size = 10):
        #Contents = [] allows me to construct a list with the initial contents 
        #this value. The initial_size lets me pick a size of the list. It is 
        #It is useful if I know I am going to add a specific number of items 
        #right away to the list
        self.items = [None] * size
        self.numItems = 0 
        self.size = size
        
        for e in contents:
            self.append(e)
            
        sampleList = PyList(["Yay", "Nay", "Horse"])
        
        print (sampleList)