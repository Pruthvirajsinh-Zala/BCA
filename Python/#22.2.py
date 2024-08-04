from _ast import Break

for i in range(5):
    if i==3:
        continue
    print("Hello ", i)

    if i==4:
        Break


def fun():
    pass


print("Bye")