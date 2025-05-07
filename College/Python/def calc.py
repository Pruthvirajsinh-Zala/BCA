def add(a,b):
    return a+b
def sub(a,b):
    return a-b
def mul(a,b):
    return a*b
def div(a,b):
    return a/b
a=int(input("Enter First Number :"))
b=int(input("Enter Second Number :"))
ch=int(input("Entr Your Choice :"))
if(ch==1):
    print(add(a,b))
elif ch==2:
    print(sub(a,b))
elif ch==3:
    print(mul(a,b))
elif ch==4:
    print(div(a,b))
else :
    print("Invalid choice")
