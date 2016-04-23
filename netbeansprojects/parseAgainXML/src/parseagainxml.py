# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor
from xml.dom import minidom
from collections import defaultdict
__author__ = "Carlos"
__date__ = "$Apr 18, 2016 7:50:21 AM$"

xmlDoc = minidom.parse("graph.xml")
vertices = xmlDoc.getElementsByTagName("Vertices")[0]
vertex = vertices.getElementsByTagName("Vertex")
#print(type(vertex))

'''Pull my edges and store list in an array Edge[Head] = (tail, cost): tuple'''
edges = xmlDoc.getElementsByTagName("Edges")[0]
edgeObj = edges.getElementsByTagName("Edge")
#print(edge)

class Vertex:
    def __init__(self, vertexId, label):
        self.vertexId = vertexId
        self.label = label
        self.adjacent = []
        self.previous = None
        
class Edge:
    def __init__(self, v1, v2, weight = 0):
        self.v1 = v1
        self.v2 = v2
        self.weight = weight
    
    def __lt__(self,other):
        return self.weight < other.weight
    

def makeVertList(nodeList):
    vertLabVal = {}    
    listOfVerts = []
    for verts in vertex:
        vertIdVal = int(verts.attributes["vertexId"].value)
        labelVal = verts.attributes["label"].value
#        listOfVerts = Vertex(vertIdVal, labelVal)
#        print (listOfVerts.vertexId, listOfVerts.label)

        #print ("Vertex ID:", int(vertIdVal), "Label: ", labelVal)
        #print (verts)
        vertLabVal[labelVal] = vertIdVal
        listOfVerts.append(Vertex(vertIdVal, labelVal))
        #print(vertLabVal)
    return vertLabVal




def makeEdgeList(node):
    edgeDictT = {}
    edgeDictH = {}
    listOfEdges = []
    for edges in edgeObj:
        tail = int(edges.attributes["tail"].value)
        head = int(edges.attributes["head"].value)
        weight = float(edges.attributes["weight"].value)
        listOfEdges.append(Edge(tail, head, weight))
        #print ("Tail: ", tail, "Head: ", head, "Weight", weight)    
        #edgeDict[tail] = ((head, weight))
        edgeDictT.setdefault(tail, []).append((head, weight))
        edgeDictH.setdefault(head, []).append((tail, weight))
#        print(listOfEdges.v1, listOfEdges.v2, listOfEdges.weight)
    return edgeDictT


edges = makeEdgeList(edgeObj)
#y = (edges[29][0])
#head, weight = y
#print ("This is the MOTHERFUCKING HEAD" , head)
#print ("THIS IS THE MOFOING WEIGHT: ", weight)
#for elements in y:
#    print (type(elements))
#x = []
'''WE shall break up list elements ^^^^^^'''
#for items in edges:
#    x.append(edges.values())
#    if (20 , 4.61) in x:
#        x.index((20 , 4.61))
#        print("something")
#print(x)

#print (edges)
vertices = makeVertList(vertex)
#for k in vertices:
#    #print ("Label: ", k)
#    for tails in edges:
#        if vertices[k] == tails:
#            print("Tail: ", tails)
#            print (edges[tails])
#            x = edges[tails]
#            if (29, 7.1) in x:
#                print("found at ", edges[tails])
#                break
#            else:
#                print("not found")
#for items in edges:
#    print ("Keys", items)
#    print(edges[items])
#for k in vertices:
#    tail = []
#    if k == "13":
#        tail = vertices["13"]
#        headOne = edges[tail][0][0]
#        headTwo = edges[tail][1][0]
#        print(type(headOne), headOne, headTwo)
#        print(edges[headTwo])
#        print("Found at", edges[headTwo][0][0],"cost: ", edges[headTwo][0][1])
            
    
#for edge in edges:
#    print(edge.v1, edge.v2, edge.weight)

#def findPath(start, end):
#    tails = []
#    begin = vertices[start]
#    stop = vertices[end]
#    print ("Begin: ", begin)
#    print ("Stop: ", stop)
#    for label in vertices:
#        if label == start:
#            tails = vertices[start]
#            startTail = edges[tails]
#            print (tails)
#            for v in startTail:
#                if v == stop:
#                    print ("found the end!")
#                else:
#                    startTail = edges[v[0]]
#            
#findPath("13", "17")

label = input("Enter a label to start from 0 to 29: ")
end = input("Enter a label to end at: ")
stop = (vertices[end])
print ("Stop at: ", stop)
graph = (edges[vertices[label]])
print(graph)
for items in graph:
    print ("Head: ",items[0])
    print ("Weight: ", items[1])
    print("New Tail: ", items[0], " : ", edges[items[0]])
    newTail = edges[items[0]]
    for i in newTail:
        print(i[0])
    



