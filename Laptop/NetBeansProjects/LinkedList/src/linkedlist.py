# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.


__author__ = "Carlos"
__date__ = "$Feb 14, 2016 5:49:50 PM$"
main = ('__linkedlist__' == __name__)

from Node import *

class LinkedList(object):
    
    #When the list is first initialized it has no nodes, so the head is set to None.
    def __init__(self, head = None):
        self.head = head
    
    #This insert method takes data, initializes a new node with the given data, 
    #and adds it to the list. As for time complexity, this implementation of
    #insert is constant O(1) (efficient!). 
    def insert(self, data):
        new_node = Node(data)
        new_node.set_next(self.head)
        self.head = new_node
    
    #The size method is very simple, it basically counts nodes until it can't
    #find any more, and returns how many nodes it found. The time complexity of
    #size is O(n) because each time the method is called it will always visit every
    #node in the list but only interact with them once, so n * 1 operations.    
    def size(self):
        current = self.head
        count = 0 
        while current: 
            count += 1
            current = current.get_next()
        return count
    
    #Search is actually very similar to size, but instead of traversing the 
    #whole list of nodes it checks at each stop to see whether the current node 
    #has the requested data and if so, returns the node holding that data.
    #The time complexity of search is O(n) in the worst case
    def search(self, data):
        current = self.head
        found = False 
        while current and found is False:
            if current.get_data() == data: 
                found = True 
            else:
                current = current.get_next()
                if current is None:
                    raise ValueError("Data not in list")
                return curent 
            
    #The delete method traverses the list in the same way that search does, but 
    #in addition to keeping track of the current node, the delete method also 
    #remembers the last node it visited. The time complexity for delete is also 
    #O(n)
    def delete(self, data):
        current = self.head
        previous = None
        found = False
        while current and found is False:
            if current.get_data() == data:
                found = True
            else:
                previous = current 
                current = current.get_next()
            if current is None: 
                raise ValueError("Data not in list")
            if previous is None: 
                self.head - current.get_next()
            else:
                previous.set_next(current.get_next())
    
    def size_print(self):
        print ("I am here!")
        current = self.head
        a = current.get_data()
        print ("In size")
        #count = 0 
        while current: 
            #count += 1
            print (current.get_data())
            current = current.get_next()
        #return count
            
