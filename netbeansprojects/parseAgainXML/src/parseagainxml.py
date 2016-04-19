# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor
from xml.dom import minidom

__author__ = "Carlos"
__date__ = "$Apr 18, 2016 7:50:21 AM$"

xmlDoc = minidom.parse("graph.xml")
vertices = xmlDoc.getElementsByTagName("Vertices")[0]
vertex = vertices.getElementsByTagName("Vertex")
#print(type(vertex))
def makeVertDict(nodeList):
    vertLabVal = {}    
    for verts in vertex:
        vertIdVal = int(verts.attributes["vertexId"].value)
        labelVal = verts.attributes["label"].value

        #print ("Vertex ID:", int(vertIdVal), "Label: ", labelVal)
        #print (verts)
        
        vertLabVal[labelVal] = vertIdVal
        #print(vertLabVal)
    return vertLabVal
        

vertDict = makeVertDict(vertex)

'''Pull my edges and store list in an array Edge[Head] = (tail, cost): tuple'''
edges = xmlDoc.getElementsByTagName("Edges")[0]
edge = edges.getElementsByTagName("Edge")
#print(edge)

def makeEdgeDict(node):
    edgeDict = {}
    for edges in edge:
        tail = int(edges.attributes["tail"].value)
        head = int(edges.attributes["head"].value)
        weight = float(edges.attributes["weight"].value)
        #print ("Tail: ", tail, "Head: ", head, "Weight", weight)    
        edgeDict[tail] = ((head, weight))
    return edgeDict

edgeDict = makeEdgeDict(edge)

graph = (vertDict, edgeDict)
print(graph)
#for edges in edge:
#    tail = int(edges.attributes["tail"].value)
#    head = int(edges.attributes["head"].value)
#    weight = float(edges.attributes["weight"].value)
#    print ("Tail: ", tail, "Head: ", head, "Weight", weight)
#    edgeDict = {}
#    edgeDict[tail] = ((head, weight))
#    print (edgeDict)

    
#def fillDict (label, id):
#    vertLabVal = {}    
#    for i in vertLabVal:
#        vertLabVal[label] = id
#    return vertLabVal
#fillDict(labelVal, vertIdVal)    
#print (fillDict)
