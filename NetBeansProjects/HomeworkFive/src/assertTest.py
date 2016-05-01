#! /usr/bin/python

# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

__author__ = "Carlos"
__date__ = "$Apr 25, 2016 8:03:42 AM$"


import unittest
from quadForm import *

__author__ = "Carlos Luna"
__date__ = "$Apr 23, 2016 3:23:48 PM$"
class testQuadForm(unittest.TestCase):
    def test_sqRt(self):
        self.assertEquals(quadForm().sqRoot(2, 7, 5),3)
    
    def test_posRoot(self):
        self.assertEquals(quadForm().posRoot(2, 7, 3), -1)
    
    def test_negRoot(self):
        self.assertEquals(quadForm().negRoot(2, 7, 3), -10/4)
        
    def test_linNegC(self):
        self.assertEquals(quadForm().linNegC(2, 4), -2)
        
    def test_linPosC(self):
        self.assertEquals(quadForm().linPosC(2, 4), 2)
    
    def test_allZero(self):
        self.assertEquals(quadForm().allZero(0, 0, 2), 2)
        
    
if __name__ == '__main__': 
    unittest.main()
    quadForm.takeInput()