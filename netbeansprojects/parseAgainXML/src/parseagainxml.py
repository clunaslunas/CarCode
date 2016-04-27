# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor
from xml.dom import minidom
from collections import defaultdict
import sys
import pprint
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
vertices = makeVertList(vertex)         
v = []
e = []
def makeV(vertList, list):
    for items in vertList:
        list.append(vertList[items])
    return sorted(list)
V = makeV(vertices, v)
def makeAdj(edgeList,vertices, list):
    for i in vertices:
        if i in edges:
            list.append((i, edges[i]))
    
    return sorted(list)

E = makeAdj(edges,V,e)
print(type(E))
#for i in E:
#    if i[0] == 9:
#        print("found it", i)
#        searchList = i[1]
#        print("Search items: ",searchList)
#        for items in searchList:
#            print ("New starting points: ",items[0])#for i in E:
#    if i[0] == 9:
#        print("found it", i)
#        searchList = i[1]
#        print("Search items: ",searchList)
#        for items in searchList:
#            print ("New starting points: ",items[0])
def searchPath(adjList, start, stop, path = []):
    path.append(start)
    print("Start at: ",start)
    print("Stop at: ",stop)
    srchLst = []
    while start != stop:
        for elements in adjList:
    #            print (elements)
            if elements[0] == start:
    #            print ("Found it", elements)
                srchLst.append(elements[1])
    #            print ("Time to search: ",srchLst)
    #            print(srchLst)
        for i in srchLst:
            start = i[0][0]
            print ("New Start: ",start)
            searchPath(adjList, start, stop,)
    #        break
        print ("All done ", path)
        return path
    
    
    
        
#    if start == stop:
#        print("doing something")
#        return path
#    else:
#        print("start does not equal stop so search the adjacent list")
#        print(adjList)
#        for i in adjList:
#            print ("Elements in adjacent list",i[0])
#            print("searching the adjacent list...")
#            if i[0] == start:
#                print(i[0], " is equal to ", start)
#                searchList = i[1]
#                for items in searchList:
#                    start = items[0]
#                    searchPath(adjList, start, stop)
#            else:
#                return path

ans = searchPath(E, 9, 21)
print(ans)
            
'''take item at index 0 and set to start'''
'''store items at index 1 in a list called searchList'''
'''take items in searchList at index 0, and set them as my new starting point'''
#for elements in E:
#    print("Vertex ID: ",elements[0],"Adjacent nodes: ", elements[1:])
#def findPath(adjVerts, start, stop, path = []):
#    path.append(start)
#    print(path)
#    if start == stop:
#        return path
#    for i in adjVerts:
#        if i == start:
#            return None
#        for node in adjVerts[start]:
#            if node not in path:
#                newPath = findPath(adjVerts, node, stop, path)
#                
#                if newpath: return newpath
#                
#        return None
#    
#                    
#            
#findPath(E,9, 21)
            
    
    
    