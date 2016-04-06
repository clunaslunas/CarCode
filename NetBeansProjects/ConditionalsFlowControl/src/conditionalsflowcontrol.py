# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

__author__ = "Carlos"
__date__ = "$Jan 31, 2016 8:31:17 AM$"

if __name__ == "__main__":
    def clinic():
        print ("You've just entered the clinic!")
        print ("Do you take the door on the left or the right?")
    answer = input("Type left or right and hit 'Enter'.").lower()
    if answer == "left" or answer == "l":
        print ("This is the Verbal Abuse Room, you heap of parrot droppings!")
    elif answer == "right" or answer == "r":
        print ("Of course this is the Argument Room, I've told you that already!")
    else:
        print ("You didn't pick left or right! Try again.")
        clinic()

clinic()
