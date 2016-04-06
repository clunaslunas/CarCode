# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

__author__ = "Carlos"
__date__ = "$Mar 7, 2016 2:24:34 PM$"

a, b = 0, 1
nums = float(input("How big of a number? "))
while b < nums:
    print(a, "+", b, " = ", a + b)
    a, b = b, a+b