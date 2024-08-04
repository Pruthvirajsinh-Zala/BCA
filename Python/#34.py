
def add(a, b):
    c = a+b
    print(c)

add(5,6)

def person(name, age):
    print(name)
    print(age)

person("navin", 28)


def sum(a, *b):
    c = a

    for i in b:
        c = c + i

    print(c)

sum(5, 6, 34, 78)



