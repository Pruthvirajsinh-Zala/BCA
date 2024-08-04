
a = 10
print(id(a))

def somthing():
    a = 9

    x = globals() ['a']
    print(id(x))
    print("in fun " , a)

    globals() ['a'] = 15

somthing()

print(a)
