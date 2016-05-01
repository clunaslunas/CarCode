#! /usr/bin/python

# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
from quadformula import *
import unittest


__author__ = "Carlos Luna"
__date__ = "$Apr 23, 2016 3:23:48 PM$"
class test_convert(unittest.TestCase):
    def test_input(self):
        solveQuad()
        self.assertIsInstance(x, "")
        
    
if __name__ == '__main__': 
    unittest.main()
    

