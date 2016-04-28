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

def makeWeightAdj(edgeList,vertices, list):
    for i in vertices:
        if i in edges:
            list.append((i, edges[i]))
    
    return sorted(list)

E = makeWeightAdj(edges,V,e)

def makeGraphDict(edgeList,vertices, grphDict = {}, nodeDict = {}):
    listOfVert = []
    for i in vertices:
        if i in edges: 
            print(edges)
            for items in edges[i]:
                print(i,items)
                
                
            
makeGraphDict(edges, V)
def makeNodeAdj(edgeList, vertices, nodeDict={}):
#    edgeDictT.setdefault(tail, []).append((head, weight))
    for i in vertices:
        if i in edges:
            for items in edges[i]:
                nodeDict.setdefault(i, []).append(items[0])
    return(nodeDict)
            
nodeList = []            
N = makeNodeAdj(edges, V)
    
def findPath(graph, start, end, path =[]):
    path = path + [start]
    if start == end:
        return path
    if not start in graph.keys():
        return None 
    for node in graph[start]:
        if node not in path:
            newPath = findPath(graph, node, end, path)
            if newPath: return newPath
    return None



def labelToVert(vertDict):
    
    label = input("Please enter a label from 0 to 29: ")
    vertexID = vertDict[label]
    
    return vertexID

#start = labelToVert(vertices)
#stop = labelToVert(vertices)
#path = findPath(N, start, stop)

#def dijkstra(graph, src, dest, visited = [], distances = {}, predecessors = {}):
#    if src not in graph:
#        raise TypeError("The root of the shortest path tree cannot be found")
#    if dest not in graph:
#        raise TypeError("The target of the shortest path cannot be found in graph")
#    if src == dest:
#        path = []
#        pred = dest
#        while pred != None:
#            path.append(pred)
#            pred=predecessors.get(pred,None)
#        print("Shortest path: " + str(path) + " cost : " + str(distances[dest]))
#    else:
#        if not visited:
#            distances[src] = 0
#            
#        for neighbor in graph[src]:
#            if neighbor not in visited:
#                newDistance = distances[src] + graph[src][neighbor]
#                if newDistance < distances.get(neighbor,float('inf')):
#                    distances[neighbor] = newDistance
#                    predecessors[neighbor] = src
#        visited.append(src)
#        
#        unvisited = {}
#        for k in graph:
#            if k not in visited:
#                unvisited[k] = distances.get(k,float,('inf'))
#        x = min(unvisited, key = unvisited.get)
#        dijkstra(graph,x,dest,visited,distances,predecessors) 
#        
#dijkstra(E, 9, 29)
'''take item at index 0 and set to start'''
'''store items at index 1 in a list called searchList'''
'''take items in searchList at index 0, and set them as my new starting point'''

    
    
    