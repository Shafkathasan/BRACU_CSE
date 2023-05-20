#print("###CSE422_Lab01_Mohammad Shafkat Hasan_19101077###\n")

import math
import random

comp_value = 0

def alphaBeta_pruning(index, b, d, alpha, beta, attacker):
    start = b * index + 1
    stop = b * index + b + 1
    global comp_value

    if d == 0:
        return evaluations[index]

    if attacker:
        for i in range(start, stop):
            child_evaluation = alphaBeta_pruning(i, b, d - 1, alpha, beta, False)
            alpha = max(alpha, child_evaluation)
            evaluations[index] = max(evaluations[index], child_evaluation)
            if beta <= alpha:
                break
        return evaluations[index]

    else:
        for i in range(start, stop):
            child_evaluation = alphaBeta_pruning(i, b, d - 1, alpha, beta, True)
            beta = min(beta, child_evaluation)
            evaluations[index] = min(evaluations[index], child_evaluation)
            if d == 1:
                comp_value = comp_value + 1
            if beta <= alpha:
                break
        return evaluations[index]


id = input("Enter your student ID: ")
min_hp, max_hp = input("Enter the minimum and maximum value for the range of negative HP: ").split(" ")
min_hp, max_hp = int(min_hp), int(max_hp)
d, b, initial_hp = int(id[0]) * 2, int(id[2]), int(id[(len(id) - 1)] + id[(len(id) - 2)])

leafNodes = []
for i in range(b**d):
        l = random.randint(min_hp, max_hp)
        leafNodes.append(l)

evaluations = []
for i in range(d):
        for j in range(b**i):
            if i % 2 == 0:
                evaluations.append(-math.inf)
            else:
                evaluations.append(math.inf)
evaluations = evaluations + leafNodes

alpha, beta = -math.inf, math.inf
alphaBeta_pruning(0, b, d, alpha, beta, True)

print("=== Outputs ===")
print("Depth and Branches ratio is %d:%d" % (d, b))
print("Terminal States (leaf node values) are", *leafNodes, sep = ", ")
print("Left life(HP) of the defender after maximum damage caused by the attacker is", initial_hp - evaluations[0])
print("After Alpha-Beta Pruning Leaf Node Comparisons", comp_value)