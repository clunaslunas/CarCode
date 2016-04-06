#! /usr/bin/python

# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
from xml.dom import minidom
#We want to create a dictionary with vertexID and label
#Now the edges, store in a list and search by head, tail, and weight
#xml.dom methods
# or... take xmldoc.attribute('weight')
#xmldoc.getElementsByTagName('Graph')[0] --> Parses this into an array
# vertices = graph.getElements...('vertices')[0].getElementsByTagName('Vertex')
__author__ = "Carlos"
__date__ = "$Apr 4, 2016 8:14:33 AM$"
#put this into a try/exception black
xmldoc = minidom.parse('graph.xml')

from xml.dom.minidom import parse, parseString

xmlDoc = parse('graph.xml')#Parsing xml file
top_element = xmlDoc.documentElement
def get_Text(nodelist):
    nodeArray = []
    for node in nodelist:
        if node.nodeType == node.TEXT_NODE:
            nodeArra.append(node.data)
    return ''.join(nodeArray)
get_Text()
print (top_element)
print (xmlDoc)



#what data structure do you need for the elements (Vertex data structure)
#What data structure do you need for the elements (ARRAY)
#VertexID create an array!!
# ! x, y
# label = user interface
#vertices = []
#edges = []
#how do you pull from an object------>
print (xmldoc)
