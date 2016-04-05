# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

import xml.etree.ElementTree as ET
#DOM = document object model
__author__ = "Carlos"
__date__ = "$Mar 30, 2016 9:45:52 AM$"

tree = ET.parse('graph.xml')
root = tree.getroot()

root.tag
root.attrib

for child in root:
    print(child.tag,child.attrib)
x = root[0][0].attrib
y = root[0][0].tag

for vertices in root.iter('Vertices'):
    print("This is:", vertices)
    
for vertices in root.findall('vertices'):
    r = vertices.find('vertexID').text
    n = vertices.get('label')
    print("Now this: ", r, n)

#Prints out a string you must read in as a dictionary with key value pairs
print('Attribute is: ', x)

print('Tag is: ', y)
#Parse through attributes to collect 
parser = ET.XMLPullParser(['start', 'end'])
parser.feed('<mytag>sometext')
list(parser.read_events())
print('The parser is: ', parser)
parser.feed('more text</mytag>')
for event, elem in parser.read_events():
    print(event)
    print(elem.tag, 'text= ', elem.text)

