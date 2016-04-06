# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

__author__ = "Carlos Luna"
__date__ = "$Mar 12, 2016 3:48:55 PM$"

from random import randint

board = []

for x in range(0, 5):
    board.append(["O"] * 5)

def print_board(board):
    for row in board:
        print (" ".join(row))

print_board(board)

def random_row(board):
    return randint(0, len(board[0]) - 1)

def random_col(board):
    return randint(0, len(board[0]) - 1)

ship_row = random_row(board)
ship_col = random_col(board)
guess_row = int(input("Guess Row:")) - 1
guess_col = int(input("Guess Col:")) - 1

print (ship_row)
print (ship_col)

# Write your code below!
if guess_row == ship_row and guess_col == ship_col:
    print ("Congratulations! you sank my battleship")
elif board[guess_row][guess_col] == 'X':
    print ("You guessed that one already." )
else:
    if guess_row < 0 or guess_row > len(board) - 1 or guess_col < 0 or guess_col > len(board[0]) - 1:
        print ("Oops, that's not even in the ocean.")
    print ("You missed my battleship!")
    board[guess_row][guess_col] = "X"
    print_board(board)
