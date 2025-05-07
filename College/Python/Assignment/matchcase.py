m=int(input("Enter Maths : "))
c=int(input("Enter C++ : "))
p=int(input("Enter Python : "))
j=int(input("Enter Java : "))
e=int(input("Enter English : "))

total=m+c+p+j+e
per=total/5

print("Total Marks : ",total)
print("Percnetage : ",per)

match per:
    case a if per>=90:
        print("A+")
    case b if per>=80 and per<90:
        print("B+")
    case c if per>=70 and per<80:
        print("C+")
    case d if per>=60 and per<70:
        print("Pass")
    case e if per<60:
        print("Fail")
    case _:
        print("Thank you")
