def arm(num):
    n=len(str(num))
    sum1 = 0
    temp = num
    while temp > 0:
       digit = temp % 10
       sum1 += digit ** n
       temp //= 10

    if num == sum1:
       print(num,"is an Armstrong number")
    else:
       print(num,"is not an Armstrong number")
num = int(input("Enter a number: "))
arm(num)
