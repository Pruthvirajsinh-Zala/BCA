a=int(input("Enter A :"))
b=int(input("Enter B :"))

print(a,"+",b,"=",(a+b))
print(a,"-",b,"=",(a-b))
print(a,"*",b,"=",(a*b))
print(a,"/",b,"=",(a/b))
print(a,"%",b,"=",(a%b))

def sum(a,b):
    return a+b;

def sub(a,b):
    return a-b;

def mul(a,b):
    return a%b;

def div(a,b):
    return a/b;

def mod(a,b):
    return a%b;

print("\n",a,"+",b,"=",sum(a,b))
print("\n",a,"+",b,"=",sub(a,b))
print("\n",a,"+",b,"=",mul(a,b))
print("\n",a,"+",b,"=",div(a,b))
print("\n",a,"+",b,"=",mod(a,b))
