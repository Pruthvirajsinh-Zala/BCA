def lab():
    s = "ATMIYA UNIVERSITY"
    print("1 : ",s) #1
    print("2 : ",s[2::]) #2
    print("3 : ",s[:2:]) #3
    print("4 : ",s[3:10:]) #4
    print("5 : ",s[-1::]) #5
    print("6 : ",s[-2:-1:]) #6
    print("7 : ",s[7:-2:]) #7
    print("8 : ",s[::-1]) #8
    print("9 : ",s[8:3:-1]) #9
    print("10: ",s[::2]) #10
    print("11: ",s[1::2]) #11
    print("12: ",len(s)) #12
    print("13: ",s.lower()) #13
    print("14: ",s.title()) #14

if __name__ == "__main__":
    lab();
