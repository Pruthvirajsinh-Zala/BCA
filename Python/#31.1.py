from numpy import *

arr1 = array([
    [1, 2, 3, 6, 2, 9],
    [4, 5, 6, 7, 5, 3]

])

print(arr1.size)
print(arr1.dtype)
print(arr1.ndim)
print(arr1.shape)

arr2 = arr1.flatten()

print(arr2)

arr3 = arr2.reshape(2, 2, 3)

print(arr3)

print(arr1)

m = matrix(arr1)

print(m)

print(diagonal(m))

print(m.min())

print(m.max())
