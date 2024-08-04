phy = int(input("Enter Physics Marks : "))
che = int(input("Enter Chemestry Marks : "))
bio = int(input("Enter Biology Marks : "))

total = phy+che+bio
per = total/3
print("Total : ",total)
print("Percentage : ",per)
print("Grade :")
if per>=70:
    print("Distinction")
elif per>=60:
    print("First Class")
elif per>=50:
    print("Second Class")
elif per>=40:
    print("Pass Class")
else:
    print("Fail")
