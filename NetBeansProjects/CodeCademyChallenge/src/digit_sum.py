# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

__author__ = "Carlos Luna"
__date__ = "$Mar 23, 2016 6:45:24 AM$"
digits = 3255

def digit_sum(n):
    nums = str(n)
    sum = 0
    num = []
    for i in nums:
        num.append(int(i))
        print (num)
    for digs in num:
        sum += digs
        print (sum)
    return sum

digit_sum(digits)