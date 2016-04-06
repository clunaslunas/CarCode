#! /usr/bin/python

# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

__author__ = "Carlos"
__date__ = "$Apr 4, 2016 8:47:58 AM$"

'''You need a array to indicated visited nodes
    1.) Creat set S of nodes whose shortest distance from source is known 
    2.) Initially, S only contains the source or starting node
    3.) At each step, add to S a remaining node v whose distance(cost) from the 
       source is as short(cheapest) as possible
    4.) We can always find the shortest path from the source to v that passes 
        only '''