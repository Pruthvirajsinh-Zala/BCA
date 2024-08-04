from numpy import *

arr1 = array([1, 2, 3, 4, 5])
arr2 = array([6, 1, 9, 3, 2])


arr1 = arr1 + 5

print(arr1)

arr3 = arr1 + arr2

print(arr3)

print(sin(arr3))

print(log(arr3))

print(sqrt(arr3))

print(sum(arr3))

print(min(arr3))

print(max(arr3))

print(concatenate([arr1, arr2]))

arr4 = arr1.view()
arr4 = arr1.copy()


print(arr1)
print(arr4)

print(id(arr1))

print(id(arr4))


