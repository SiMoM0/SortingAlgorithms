#Bubble Sort function in pyhton using an array of 50 elements for test
import random

def bubbleSort(arr):
    for i in range(len(arr)):
        for j in range(len(arr)-1, i, -1):
            if arr[j] < arr[j-1]:
                #Swap the posistion of the two elements
                arr[j-1], arr[j] = arr[j], arr[j-1]

lista = []
for i in range(50):
    #insert in the list random numbers between 1 and 1000
    lista.append(random.randint(1, 1000))   
print("List of numbers: ", lista)

#sort the list with bubble sort
bubbleSort(lista)
print("Sorted list: ", lista)