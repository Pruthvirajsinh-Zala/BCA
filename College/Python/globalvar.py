
x="PZala"

def myname():
    global x
    x="MyName"
    print("Local : ",x)


myname()
print("Global : ",x)


