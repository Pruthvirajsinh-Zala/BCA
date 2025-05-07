#single inheritance

class father():
    fathername=" ";
class son(father):
    def __init__(self,fathername,sonname ):
        self.fathername=fathername
        self.sonname=sonname
    def print_name(self):
        print("Father Name :",self.fathername)
        print("Son Name :",self.sonname)
s1=son("ABC","xyz")
s1.print_name()
    
