from numpy import *

arr = array([1, 2, 3, 4, 5], int)

print(arr)
print(arr.dtype)

arr = linspace(0, 15, 20)

print(arr)

arr = arange(1, 15, 2)

print(arr)

arr = logspace(1, 40, 5)

print('% 2f '%arr[4])



arr = zeros(5, int)

print(arr)

arr = ones(5, int)

print(arr)

