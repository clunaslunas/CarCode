#! /usr/bin/python

# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
'''DFS says: Bunch of nodes V
                for i = 1 to n:
                    mark[i] = unvisited
                end for
                
                for v = 1 to n:
                    if mark[v] is unvisited 
                        DFS(v)
                    end if
                end for
                
                DFS(v)
                    mark[v] = visited
                    for w in L[v]
                        if mark[w] is unvisited 
                            DFS(W)
                        end if 
                    end for'''
            
__author__ = "Carlos"
__date__ = "$Apr 4, 2016 8:05:10 AM$"

def graphDFS(G, start, goal):
    #G = (V,E) is the graph with vertices, V, and edges, E.
    V, E = G
    stack = Stack()
    visited = Set()
    stack.push(start)
    
    while not stack.isEmpty():
        #A vertex is popped form the stack. THis is called the current vertex
        current = stack.pop()
        #The current vertex is added to the visited set.
        visited.add(current)
        
        #If the current vertex is the goal vertex, then we discontinue the 
        #search reporting that we found the goal 
        if current == goal:
            return True #or return path to goal perhaps
        
        '''Otherwise, for every adjacent vertex, v, to the current vertex
            in the graph, v is pushed on the stack of vertices yet to search
            unless v is already in the visited set in which case the edge to v
            is ignored.''' 
        for v in adjacent(current, E):
            if not v in visited:
                stack.push(v)
                
        #If we get this far then we did not find the foal
        return False # or return an empty path 
