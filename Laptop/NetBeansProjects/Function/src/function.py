# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

__author__ = "Carlos"
__date__ = "$Jan 31, 2016 2:09:24 PM$"

if __name__ == "__main__":
    def tip_calculator():
        meal = int(input("How much was your food? "))
        tax = .05
        service = input("How was your service? excellent, ok, or bad? ")
        if service == "excellent":
            total = meal + meal*tax + meal*.20
            print ("your total comes to ", total," with a tip of", meal*.20)
        elif service == "ok":
            total = meal + meal*tax + meal*.15
            print ("your total comes to ", total," with a tip of", meal*.15)
        else: 
            total = meal + meal*tax + meal*.10
            print ("your total comes to ", total," with a tip of", meal*.10)
x = tip_calculator()
