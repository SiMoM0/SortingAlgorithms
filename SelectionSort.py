#Selection Sort function in pyhton using an array of 50 elements for test
import random

#Selection Sort function
def selectionSort(arr):
    for i in range(len(arr)):
        min_index = i;
        for j in range(i+1, len(arr)):
            if arr[j]<arr[min_index]:
                min_index = j;
        #swap the positions
        arr[i], arr[min_index] = arr[min_index], arr[i]
    return arr

lista = []
for i in range(50):
    #insert in the list random numbers between 1 and 1000
    lista.append(random.randint(1, 1000))   
print("List of numbers: ", lista)

#sort the list with selection sort
lista = selectionSort(lista)
print("Sorted list: ", lista)
