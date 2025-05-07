def pal(x):
    if x == x[::-1]:
        return "Palindrome"
    else :
        return "Not Palindrome"
x=input("Enter String : ")
print(pal(x))
    
