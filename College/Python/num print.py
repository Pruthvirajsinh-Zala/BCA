word=input("Enter Number : ")

match word:
    case a if word=="One" or word=="one":
        print("1")
    case a if word=="Two" or word=="two":
        print("2")
    case a if word=="Three" or word=="three":
        print("3")
    case a if word=="Four" or word=="four":
        print("4")
    case a if word=="Five" or word=="five":
        print("5")
    case a if word=="Six" or word=="six":
        print("6")
    case a if word=="Seven" or word=="seven":
        print("7")
    case a if word=="Eight" or word=="eight":
        print("8")
    case a if word=="Nine" or word=="nine":
        print("9")
    case a if word=="Zero" or word=="zero":
        print("0")
    case _:
        print("Invalid Input")
