# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
import HashMap
import HashAlgorithm
__author__ = "Carlos Luna"
__date__ = "$Mar 5, 2016 7:29:15 AM$"

#Input for how many buckets 
def size_intake():
    x = int(input("How many buckets?"))
    return x
size = size_intake()
dct1 = HashMap.new_bucks(size)
testHash = input("GIVE ME A NUMBER!!!: ")
key = HashAlgorithm.hash_new(testHash)
print("This is my key", key)
a = HashMap.hash_key(dct1, key)
print("This is my index", a)
for key in dct1:
    dct1[a] = testHash
b = HashMap.get_bucket(dct1, a)
print ("This is my bucket", b)
dct1[a] = testHash
print ("This is my value inside index", a, ":", dct1[a])
     