word=input("Enter Word : ")
match word:
    case a if word=="one" or word=="One":
        print("1")
    case a if word=="two" or word=="Two":
        print("2")
    case a if word=="three" or word=="Three":
        print("3")
    case a if word=="four" or word=="Four":
        print("4")
    case a if word=="five" or word=="Five":
        print("5")
    case a if word=="six" or word=="Six":
        print("6")
    case a if word=="seven" or word=="Seven":
        print("7")
    case a if word=="eight" or word=="Eight":
        print("8")
    case a if word=="ten" or word=="Ten":
        print("9")
    case a if word=="zero" or word=="Zero":
        print("0")
    case _:
        print("Invalid Input")
    
