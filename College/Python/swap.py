a=int(input("Enter A:"))
b=int(input("Enter B:"))

print("Value of A : ",a)
print("Value of B : ",b)

c=a
a=b
b=c

print("Value of A after swap : ",a)
print("Value of B after swap : ",b)

a,b=b,a


print("Value of A after swap : ",a)
print("Value of B after swap : ",b)
