from array import *

vals = array('i', [5, 9, 8, 4, 2])

print(vals)

print(vals.buffer_info())

print(vals.typecode)

vals.reverse()

print(vals)

print(vals[0])

for i in range(len(vals)):
    print(vals[i])


nweArr = array(vals.typecode, (a*a for a in vals))

