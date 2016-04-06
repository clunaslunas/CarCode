# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.


__author__ = "Carlos"
__date__ = "$Feb 15, 2016 5:23:55 AM$"

main = ('__Node__' == __name__)

class Node(object):
    
    #The node initializes with a single datum and its pointer is set to None 
    #by default
    def __init__(self, data = None, next_node = None):
        self.data = data
        self.next_node = next_node
    
    # returns the stored data    
    def get_data(self):    
        return self.data
    
    #returns the next node (the node to which the object node points)
    def get_next(self):
        return self.next_node
    
    # reset the pointer to a new node
    def set_next(self, new_next):
        self.next_node = new_next
        

