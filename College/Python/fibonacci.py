num=int(input("Enter a Number : "))
fib = [0,1,1]
x=0
y=1
sum1=1
while num!=0:
    x=y
    y=sum1
    sum1=x+y
    fib.append(sum1)
    num=num-1
print(fib)
n=0
for i in range(1,6):
    for j in range(1,i+1):
        print(fib[n],end=" ")
        n=n+1
    print()
    

