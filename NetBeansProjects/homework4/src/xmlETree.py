#! /usr/bin/python

# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
import xml.etree.cElementTree as ET
__author__ = "Carlos"
__date__ = "$Apr 5, 2016 1:06:45 PM$"

tree = ET.ElementTree(file='graph.xml')
a = tree.getroot()
root = tree.getroot()


'''Prints all key value pairs for the Vertex attributes stored in vertex array'''
vertex = {}
edge = {}
def fill_dict(emptDict,newRoot):
    for Vertex in root.iter('Vertex'):
        emptDict = dict(Vertex.attrib)
        #print (emptDict)
        #print (root.items())
        #print(vertex)
    return emptDict
def fill_dict_two(emptDict,newRoot):
    for Edge in root.iter('Edge'):
    #print (root.items())
        emptDict =+ Edge.attrib
        #print (edge)
    return emptDict
dict1 = fill_dict(vertex,root)
dict2 = fill_dict_two(edge,root)

print (dict1)
print (dict2)
    
'''Prints all key value pairs for the Edges elements'''


    
''' Now take my edge key value pair and my vertex key value pair and find paths '''
b= root.tag, 
c = root.attrib
items = root.items()
keys = root.keys()
for values in keys:
    print (root.get(keys))
print ("Element attribute names: ", keys)
print ("Element attribute keys: ", items)
print ('The Element: ', a, '\nThe tag: ', b, '\nThe attribute of tag: ', c)

for root_child in root:
    print(root_child.tag, root_child.attrib)
    
tag1 = root[0].tag
e = root[0].text
tag2 = root[1].tag

print('Tag 1: ', tag1, 'Tag 2: ', tag2)
vertex = []
edges = []
'''>>>for elem in tree.iter():
    >>>print (elem.tag, elem.attrib)'''

