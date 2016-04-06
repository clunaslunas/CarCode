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
#Input for num values
def intake():
    values = []
    try:
        choice = int(input("1 to go, 0 to stop"))
    except:
        print("ERROR")
        return -1
    while choice == 1:
        num = int(input("Please enter an integer: "))
        values.append(num)
        choice = int(input("1 to go, 0 to stop"))
    else: 
        print ("DONE")
        return values
    
#Call size function to pass to HashMap.new_bucks    
size = size_intake()
dct1 = HashMap.new_bucks(size)
print (dct1)
testHash = intake()
print ("This is my list of values: ", testHash)

#testHash = input("GIVE ME A NUMBER!!!: ")

#Need to iterate through list for each individual value
keys_list = []
for nums in testHash:
    keys_list.append(HashAlgorithm.hash_new(nums))
print ("List of keys: ", keys_list)
key = keys_list

#key = HashAlgorithm.hash_new(testHash)
#print("This is my key", key)

index_list = []
for keys in keys_list:
    index_list.append(HashMap.hash_key(dct1, keys))
    print ("List of indexes", index_list)
indexes = index_list
#a = HashMap.hash_key(dct1, key)
#print("This is my index", a)
HashMap.set(dct1, key, testHash)
HashMap.list_map(dct1)
"""for key in dct1:
    dct1[a] = testHash
b = HashMap.get_bucket(dct1, a)
print ("This is my bucket", b)"""

bucket_list = []
for buckets in index_list:
    bucket_list.append(HashMap.get_bucket(dct1, buckets))
    print("List of buckets: ", bucket_list)
    
"""dct1[a] = testHash
print ("This is my value inside index", a, ":", dct1[a])"""

     