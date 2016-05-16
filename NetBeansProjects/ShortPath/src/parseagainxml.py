# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor
from xml.dom import minidom
from collections import defaultdict, deque

__author__ = "Carlos"
__date__ = "$Apr 18, 2016 7:50:21 AM$"
xmlPath = input("Please enter the name of your XML file: ")
xmlDoc = minidom.parse(xmlPath)
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

def makeV(vertList, list):
    for items in vertList:
        list.append(vertList[items])
    return sorted(list)


def makeWeightAdj(edgeList,vertices, list):
    for i in vertices:
        if i in edges:
            list.append((i, edges[i]))
    
    return sorted(list)

def makeNodeAdj(edgeList, vertices, nodeDict={}):
#    edgeDictT.setdefault(tail, []).append((head, weight))
    for i in vertices:
        if i in edges:
            for items in edges[i]:
                nodeDict.setdefault(i, []).append(items[0])
    return(nodeDict)
            
nodeList = []            

'''Citation: https://www.python.org/doc/essays/graphs/'''
'''Modified to fit my data struture'''

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

'''take item at index 0 and set to start'''
'''store items at index 1 in a list called searchList'''
'''take items in searchList at index 0, and set them as my new starting point'''

class Graph(object):
    def __init__(self):
        self.nodes = set()
        self.edges = defaultdict(list)
        self.distances = {}

    def add_node(self, value):
        self.nodes.add(value)

    def add_edge(self, from_node, to_node, distance):
        self.edges[from_node].append(to_node)
        self.edges[to_node].append(from_node)
        self.distances[(from_node, to_node)] = distance

'''Citation: https://gist.github.com/57uff3r/99b4064cbbcbf6a73963 '''
def dijkstra(graph, initial):
    visited = {initial: 0}
    path = {}

    nodes = set(graph.nodes)

    while nodes:
        min_node = None
        for node in nodes:
            if node in visited:
                if min_node is None:
                    min_node = node
                elif visited[node] < visited[min_node]:
                    min_node = node
        if min_node is None:
            break

        nodes.remove(min_node)
        current_weight = visited[min_node]

        for edge in graph.edges[min_node]:
            try:
                weight = current_weight + graph.distances[(min_node, edge)]
            except:
                continue
            if edge not in visited or weight < visited[edge]:
                visited[edge] = weight
                path[edge] = min_node

    return visited, path


def shortest_path(graph, origin, destination):
    visited, paths = dijkstra(graph, origin)
    full_path = deque()
    _destination = paths[destination]

    while _destination != origin:
        full_path.appendleft(_destination)
        _destination = paths[_destination]

    full_path.appendleft(origin)
    full_path.append(destination)

    return visited[destination], list(full_path)

if __name__ == '__main__':
    
    edges = makeEdgeList(edgeObj)
    vertices = makeVertList(vertex)       
    v = []
    e = []
    V = makeV(vertices, v)
    N = makeNodeAdj(edges, V)
    E = makeWeightAdj(edges,V,e)
    graph = Graph()

    for i in V: 
        graph.add_node(i)
        if i in edges:
            print("Vertex: ", i)
            print ("Edges: ",edges[i])
            for items in edges[i]:
                graph.add_edge(i, items[0], items[1])
            
            
start = labelToVert(vertices)
stop = labelToVert(vertices)
print("General path: ",findPath(N, start, stop))
print("Dijkstra's shortest path: ", shortest_path(graph,start,stop))

    
    