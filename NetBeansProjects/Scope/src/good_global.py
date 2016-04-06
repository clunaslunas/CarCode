# a = 0
print (' outer ',a)

def foo():
    global a
    a = 0
    print (' foo ',a)
    a = 4
    print (' end foo ', a)

foo()

print ('last ',a)
