#! /usr/bin/python
# http://stackoverflow.com/questions/403421/how-to-sort-a-list-of-objects-in-python-based-on-an-attribute-of-the-objects
# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
import xml.etree.cElementTree as ET
from DijkstraAlgorithm import *

__author__ = "Carlos"
__date__ = "$Apr 5, 2016 1:06:45 PM$"
import unittest


#class MyTestCase(unittest.TestCase):
#    def test_something(self):
#        self.assertEqual(True, False)
#
#
#if __name__ == '__main__':
#    unittest.main()

#E[i] = getElementByTagName("edge")
#Dictionary will work fine for vertex
#try making another object for edge
#in the book check out the edge and vertex class
tree = ET.ElementTree(file='graph.xml')
a = tree.getroot()
root = tree.getroot()


'''Prints all key value pairs for the Vertex attributes stored in vertex array'''
vertex = []
edge = []
''' Get helper function, 
def get_vertex_by_lable(vertex_label):
    for vertex in "ListOfVertices"
        if vertex.lable == vertex_label:
            return vertex
        return None'''
'''Edge class that stores the creates the head tail and cost from the edge object'''
class Edge:
    def __init__(self, head, tail, cost = 0):
        self.head = head
        self.tail = tail
        self.cost = cost
        
    def __lt__(self,other):
        return self.weight < other.weight
''' Vertex class the creates vertex id and its subsequent label along with an 
    empty adjacent list, that would store the adjacent nodes'''
class Vertex:
    def __init__(self, vertexId, label):
        self.vertexId = vertexId
        self.label = label
        self.adjacent = []
        self.previous = None

'''storing the attributes and making my vertices'''
def make_vertex(vertex_node):
    vertexId = vertex_node.attrib["vertexId"]
    label = vertex_node.attrib["label"]
    theVert = Vertex(vertexId, label)
    return theVert
''' obtaining the vertex by label'''
def get_vertex_by_label(vertex_label):
    for vertex in list_of_vertices:
        if vertex.label == vertex_label:
            return vertex
    return False
''' obtaining the vertex by id number'''
def get_vertex_by_Id(vertex_Id):
    for vertex in list_of_vertices:
        if vertex.vertexId == vertex_Id:
            return vertex
    return False
''' creating an edge'''
def make_edge(edge_node):
    '''Head ID'''
    headId = edge_node.attrib["head"]
    tailId = edge_node.attrib["tail"]
    weight = edge_node.attrib["weight"]
    return Edge(headId, tailId, weight)
'''looping through my list of edges and vertices '''
def loop_edge(listofedges, listofvertices):
    
    for edge in listofedges:
        head = get_vertex_by_Id(edge.head)
        tail = get_vertex_by_Id(edge.tail)
        cost = edge.cost
        ''' Store my head, and cost as a tupple '''
        cost_assos = (head, cost)
        ''' append tupple to adjacent list '''
        tail.adjacent.append(cost_assos)
#        print ("TEST HEAD: ", cost_assos)

'''def add_vertex(self, label, edge):
            self.vertices[head.label] = edges'''

def fill_list(newRoot):
    emptList = []
    for Edge in newRoot.iter('Edge'):
        
        emptList.append(make_edge(Edge)) 
#        print (emptList[len(emptList) - 1].tail)
        #print (root.items())
    return emptList

def fill_list_two(newRoot):
    emptList = []
    for Vertex in newRoot.iter('Vertex'):
        emptList.append(make_vertex(Vertex))
        print (emptList[len(emptList) - 1].vertexId + " + " + emptList[len(emptList) - 1].label)
        #print (root.items())
        #print (edge)
    return emptList

'''Contains all my edge nodes'''
list_of_edges = fill_list(root)
#print(list_of_edges)
'''Contains all my vertex nodes'''
list_of_vertices = fill_list_two(root)
#print(list_of_vertices)

for edge in list_of_edges:
    list_of_vertices[int(edge.head)].adjacent.append({"h": edge.head, "t": edge.tail, "w": edge.cost})
    #print (list_of_vertices[int(edge.head)].adjacent[len(list_of_vertices[int(edge.head)].adjacent) - 1])
    list_of_vertices[int(edge.tail)].adjacent.append({"h": edge.head, "t": edge.tail, "w": edge.cost})

#for vert in list_of_vertices:
#    print(vert.label)
#    for val in vert.adjacent:
#        print (val["h"], val["t"], val["w"])

#loop_edge(list_of_edges, list_of_vertices)
#x = get_vertex_by_label("17")
#print("PRINT MY VERTEX: ", type(x))
#y = get_vertex_by_Id(x.vertexId)
#print(type(y))
#print (x == y)
#print(list_of_vertices)
#print (list_of_edges)
for vertex in list_of_vertices:
    vertDict = {}
    vertDict[vertex.vertexId] = vertex.label
#    print("VertexID:", vertDict[vertex.vertexId])
#    print(type(vertDict))
#for edge in list_of_edges:
#    print("Head: ", edge.head, "Tail: ", edge.tail, "Cost: ", edge.cost)

    
'''Prints all key value pairs for the Edges elements'''


    
''' Now take my edge key value pair and my vertex key value pair and find paths '''
'''b= root.tag, 
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
#for elem in tree.iter():
    >>>print (elem.tag, elem.attrib)'''

