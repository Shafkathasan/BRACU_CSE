print("###CSE422_Lab01_Mohammad Shafkat Hasan_19101077###\n")
import random as r
import numpy as np
import pandas as pd

never_found = False
def fitness(amount, population, n):
    fits = []
    for eachData in population:
        fit = 0
        for i in range(n):
            fit += amount[i]*int(eachData[i])
        fits.append(fit)

    return fits


def crossover(population, n):
    #print(population)
    idx = r.randrange(0, n)
    l = len(population)-1

    for i in range(0, int(len(population)/2)):
        if len(population) > 1:
            p1 = population[i]
            p2 = population[i+1]

            temp = p1
            p1 = temp[:idx] + p2[idx:]
            p2 = p2[:idx] + temp[idx:]

            population.pop(0)
            population.pop(0)
            population.append(p1)
            population.append(p2)

            remove_all_zero = "0" * n
            if remove_all_zero in population:
                population.remove(remove_all_zero)
        else:
            break

    return population


def mutate(population, n):

    mutated_pop = population

    for p in mutated_pop:
        idx = r.randrange(0, n)
        if p[idx] == '0':
            str1 = p
            list1 = list(str1)
            list1[idx]='1'
            str1 = ''.join(list1)
            mutated_pop.pop(0)
            mutated_pop.append(str1)
        else:
            str1 = p
            list1 = list(str1)
            list1[idx] = '0'
            str1 = ''.join(list1)
            mutated_pop.pop(0)
            mutated_pop.append(str1)

        remove_all_zero = "0" * n
        if remove_all_zero in mutated_pop:
            mutated_pop.remove(remove_all_zero)

    return mutated_pop

cnt = 0
cnt1 = 0
def GA(amount, population, n):
    global never_found
    global cnt
    fits = fitness(amount, population, n)
    if 0 not in fits:
        if cnt < 995 and len(population) > 0:
            cnt += 1
            GA(amount, mutate(population, n), n)
        else:
            return

    if 0 in fits:
        print(population[fits.index(0)])
        exit()
    else:
        never_found = True
        return None


def GA_cross(amount, population, n):
    global never_found
    global cnt1
    fits = fitness(amount, population, n)
    if 0 not in fits:
        if cnt1 < 995 and len(population) > 0:
            cnt1 += 1
            GA_cross(amount, crossover(population,  n), n)
        else:
            return
    if 0 in fits:
        print(population[fits.index(0)])
        exit()
    else:
        never_found = True
        return None

#################################################################
n = input()

d = dict(input("Enter key and value: ").split() for _ in range(n))

char = []
runs = []

for i in range(0, n):
    char.append(input())
    runs.append(int(input()))

amount = []

for i in range(0, n):
    if char[i] == np.sum(runs)/char[0]:
        amount.append(runs[i])
    else:
        amount.append(runs[i] * (-1))

pop_size = 2 ** (n-1)
j = 1
population = []
while j <= pop_size:
    dataset = ""
    for i in range(n):
        data = str(r.randrange(0, 2))
        dataset += data
    if dataset not in population:
        population.append(dataset)
        j += 1

remove_all_zero = "0"*n
if remove_all_zero in population:
    population.remove(remove_all_zero)

crossover_pop = population

GA_cross(amount, population, n)
GA(amount, population, n)

if never_found:
    print("-1")

