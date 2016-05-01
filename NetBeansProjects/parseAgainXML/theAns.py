#! /usr/bin/python

# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

__author__ = "Carlos Luna"
__date__ = "$Apr 23, 2016 9:06:40 AM$"

from xml.dom import minidom

class Vertex:
    def __init__(self, vertexId, label, cost=0):
        self.vertexId = vertexId
        self.adjacent = []
        self.previous = self
        self.label = label
        self.cost = cost
        self.edges = []

    def addEdge(self,e):
        self.edges.append(e)

    def getEdges(self):
        return self.edges

    def __str__(self):
        return "Vertex:\n    Label: " + str(self.label) +  \
               "\n    Cost: %1.2f"%self.cost + \
               "\n    Previous: " + str(self.previous.label)

    def __lt__(self,other):
        if type(self) != type(other):
            raise Exception("Unordered")

        return int(self.label) < int(other.label)


class Edge:
    def __init__(self, v1, v2, weight=0):
        self.v1 = v1
        self.v2 = v2
        self.weight = weight

    def getEndpoints(self):
        return (self.v1, self.v2)

def gatherVertices(xmldoc):
    print("*** Gather Vertices *** ")
    print("VID Label")
    graph = xmldoc.getElementsByTagName("Graph")[0]
    vertices = graph.getElementsByTagName("Vertices")[0].getElementsByTagName("Vertex")

    vertexDict = {}
    for vertex in vertices:
        vertexId = int(vertex.attributes["vertexId"].value)
        vertexLabel = vertex.attributes["label"].value
        v = Vertex(vertexId,vertexLabel)
        vertexDict[vertexId] = v
        print(vertexId, vertexLabel)
               
    return vertexDict


def gatherEdges(xmldoc, vertexDict):
    totalCost = 0

    print("*** Gather Edges *** ")
    print("Head Tail")

    graph = xmldoc.getElementsByTagName("Graph")[0]
    edges = graph.getElementsByTagName("Edges")[0].getElementsByTagName("Edge")
    edgeList = []

    for edge in edges:
        x = int(edge.attributes["head"].value)
        y = int(edge.attributes["tail"].value)
        print(x, '  ',y)

        anEdge = Edge(x,y)
        if "weight" in edge.attributes:
            anEdge.weight = float(edge.attributes["weight"].value)
            totalCost += anEdge.weight
        edgeList.append(anEdge)

        vertexDict[x].addEdge(anEdge)
        vertexDict[y].addEdge(anEdge)

        for vId in vertexDict:
            v = vertexDict[vId]
            v.cost = totalCost + 1
            

    return edgeList


def lowestCost(unvisited):
    minVert = unvisited.pop()

    unvisited.add(minVert)
    minCost = minVert.cost

    for v in unvisited:
        if v.cost < minCost:
            minCost = v.cost
            minVert = v

    unvisited.remove(minVert)
    return minVert


def main():
    xmldoc = minidom.parse("graph.xml")
    vertices = gatherVertices(xmldoc)
    edges = gatherEdges(xmldoc, vertices)

    unvisited = set()

    for vId in vertices:
        v = vertices[vId]
        if v.label == '0':
            unvisited.add(v)
            v.cost = 0
            v.prev = v

    visited = set()

    while len(unvisited) != 0: 

        current = lowestCost(unvisited)
        visited.add(current)

        for e in current.getEdges():
            x, y = e.getEndpoints()

            if x == current.vertexId:
                otherVertId = y
            else:
                otherVertId = x

            ov = vertices[otherVertId]

            if not ov in visited:
                newcost = current.cost + e.weight
                if newcost < ov.cost:
                    ov.cost = newcost
                    ov.previous = current
                    unvisited.add(ov)

    lst = list(vertices.values())

    lst.sort()

    for v in lst:
        print(str(v))
        print()


if __name__ == "__main__":
    main()