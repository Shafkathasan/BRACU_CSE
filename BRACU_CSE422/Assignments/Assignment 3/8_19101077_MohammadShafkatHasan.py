#print("###CSE422_Lab01_Mohammad Shafkat Hasan_19101077###\n")

import numpy as np
import random

MAX, MIN = 1000, 0


def minimax(depth, nodeIndex, maximizingPlayer,
            values, alpha, beta):
    if depth == 3:
        return values[nodeIndex]

    if maximizingPlayer:

        best = MIN

        for i in range(0, 2):

            val = minimax(depth + 1, nodeIndex * 2 + i,
                          False, values, alpha, beta)
            best = max(best, val)
            alpha = max(alpha, best)

            # Alpha Beta Pruning
            if beta <= alpha:
                break

        return best

    else:
        best = MAX

        for i in range(0, 2):

            val = minimax(depth + 1, nodeIndex * 2 + i,
                          True, values, alpha, beta)
            best = min(best, val)
            beta = min(beta, best)

            # Alpha Beta Pruning
            if beta <= alpha:
                break

        return best


#### Task 01 #####

id = input("Enter your student ID: ")
#If any digit in your id is 0 consider it as 8
n = str(id)
n2=n.replace('0','8')
id = n2
print("Converted ID:",id)

min_hp = int(id[4])
#Reverse last 2 digits of your student ID
total_win = int(id[:6-1:-1]) #lst[:index-1:-1]
max_hp = int(total_win * 1.5)
randomlist = random.sample(range(min_hp, max_hp), 8)
print("Generated 8 random points between the minimum and maximum point limits:",randomlist)
print("Total points to win:",total_win)
values = randomlist
Winner = minimax(0, 0, True, values, MIN, MAX)
print("Achieved point by applying alpha-beta pruning = ", Winner)
if Winner> total_win:
    print("The Winner is Optimus Prime")
else:
    print("The Winner is Megatron")


#### Task 02 #####
print("\nAfter the shuffle:")
wins = 0 #wins count
new_list = randomlist.copy()
for i in range(int(id[3])):
    random.shuffle(new_list)
    Winner = minimax(0, 0, True, new_list, MIN, MAX)
    if Winner > total_win:
        wins += 1

print(new_list)
max_value = np.max(new_list)
print('The maximum value of all shuffles:',max_value)
print('Won',wins,"times out of",int(id[3]),'number of shuffles')