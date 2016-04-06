# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

__author__ = "Carlos"
__date__ = "$Jan 27, 2016 9:21:45 AM$"

if __name__ == "__main__":
    counter = 1
    while counter <= 5: 
        print (counter, "\n")
        counter += 1
for i in range (3,10):
    loop_body =+ 1
    print(loop_body)
    
def what_is_it(fruit):
    fruit = "Red"
    if fruit == "green":
        print("Is it a grape?")
    elif fruit == "Red":
        print("Is it an apple")
    else:
        print("whatever it is")
    fruit = what_is_it("blue")
    print (fruit)
    end 
thing = what_is_it("Red")
print (thing)
        