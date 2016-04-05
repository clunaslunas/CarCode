global c
c = 9

def outer():
    print(' in outer')
    print('c ', c)
    a = 0
    b = 1
    # c = 11
    print ('end of outer')

    def inner():
        nonlocal b
        print ('inner a: ',a)
        print ('inner b: ',b)
        c = 10
        print(' c: ', c)
        b = 4

    inner()

# global c
# c = 9
outer()
