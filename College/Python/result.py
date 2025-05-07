mat=int(input("Enter Maths :"))
phy=int(input("Enter Physics :"))
che=int(input("Enter Chemistry :"))
bio=int(input("Enter Biology :"))
eng=int(input("Enter English :"))
total=mat+phy+che+bio+eng
per=total/5

print("Total : ",total)
print("Percentage : ",per)

match per:
    case a if per>=90:
        print("Class A")
    case b if per>=80 and per<90:
        print("Class B")
    case b if per>=70 and per<80:
        print("Class C")
    case b if per>=60 and per<70:
        print("Pass")
    case a if per<60:
        print("Fail")

        
