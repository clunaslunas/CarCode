# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
import HashMap
__author__ = "Carlos Luna"
__date__ = "$Mar 4, 2016 6:20:08 AM$"

states = HashMap.new_bucks()
HashMap.set(states, 'Oregon', 'OR')
HashMap.set(states, 'Florida', 'FL')
HashMap.set(states, 'California', 'CA')

cities = HashMap.new_bucks()
HashMap.set(cities, 'CA', 'San Francisco')
HashMap.set(cities, 'MI', 'Detroit')
HashMap.set(cities, 'FL', 'Jacksonville')

HashMap.set(cities, 'NY', 'New York')
HashMap.set(cities, 'OR', 'Portland')

print ('-' * 10)
print ("NY states has: %s" % HashMap.get(cities, 'NY'))
print ("OR States has: %s" % HashMap.get(cities, 'OR'))


print('-' * 10)
print("Oregon's abbreviation is: %s" % HashMap.get(states, 'Oregon'))
print("Florida's abreviation is: %s" % HashMap.get(states, 'Florida'))

print('-' * 10)
print("Oregan has %s" % HashMap.get(cities, HashMap.get(states, 'Oregon')))
print("California has %s" % HashMap.get(cities, HashMap.get(states, 'California')))

print('-' * 10)
HashMap.list(states)

print('-'* 10)
HashMap.list(cities)

print('-'* 10)
state = HashMap.get(states, 'Texas')

if not state: 
    print("Sorry, no Texas")

