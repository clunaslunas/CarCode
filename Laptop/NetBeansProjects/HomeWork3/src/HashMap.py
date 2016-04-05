#! /usr/bin/python

# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
import HashAlgorithm
main = ('__HashMap__' == __name__)
__author__ = "Carlos Luna"
__date__ = "$Mar 4, 2016 6:04:13 AM$"
#Considered Chaining...
def new_bucks(num_buckets):
    """Initializes a map with the given number of buckets"""
    aMap = []
    for i in range(0, num_buckets):
        aMap.append([])
    return aMap

def hash_key(aMap, key):
    """Given a key this will create a number and than convert it to an index for
        for the aMap's buckets."""
    return HashAlgorithm.hash_new(key) % len(aMap)

def get_bucket(aMap, key):
    """Given a key, find the bucket where it would go."""
    bucket_id = hash_key(aMap, key)
    return aMap[bucket_id]

def get_slot(aMap, key, default =None):
    """
    Returns the index, key,and value of a slot found in a bucket. 
    Returns -1, key, and default (None if not set) when not found. 
    """
    bucket = get_bucket(aMap, key)
    
    for i, kv in enumerate(bucket):
        k, v = kv
        if key == k: 
            return i, k, v
        
    return -1, key, default

def get(aMap, key, default = None):
    """Gets the value in a bucket for the given key, or the default."""
    i, k, v = get_slot(aMap, key, default = default)
    return v

def set(aMap, key, value):
    """Sets the key to the value, replacing any existing value."""
    bucket = get_bucket(aMap, key)
    i, k, v = get_slot(aMap, key)
    
    if i >= 0:
        """the key exists, replace it"""
        bucket[i] = (key, value)
        
    else: 
        """the key does not, append to creat it"""
        bucket.append((key, value))
        
def delete(aMap, key):
    """Deletes the given key from the Map."""
    bucket = get_bucket(aMap, key)
    
    for i in xrange(len(bucket)):
        k, v = bucket[i]
        if key == k:
            del bucket[i]
            break
            
def list_map(aMap):
    """Prints out what's in the Map."""
    for bucket in aMap:
        if bucket:
            for k, v in bucket:
                print (k, v)
    
