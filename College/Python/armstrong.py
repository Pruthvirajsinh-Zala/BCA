# Python program to check if the number is an Armstrong number or not

# take input from the user
num = int(input("Enter a number: "))
n=len(str(num))
# initialize sum
sum1 = 0

# find the sum of the cube of each digit
temp = num
while temp > 0:
   digit = temp % 10
   sum1 += digit ** n
   temp //= 10

# display the result
if num == sum1:
   print(num,"is an Armstrong number")
else:
   print(num,"is not an Armstrong number")
