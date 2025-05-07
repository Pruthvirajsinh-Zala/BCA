class Result:
    def __init__(self,mat,phy,che,bio,eng):
        self.mat=mat
        self.phy=phy
        self.che=che
        self.bio=bio
        self.eng=eng
    def total(self):
        self.total=self.mat+self.phy+self.che+self.bio+self.eng
        return self.total
    def per(self):
        self.per=self.total/5
        return self.per
    def grade(self):
        match self.per:
            case a if self.per>=90:
                print("Class A")
            case b if self.per>=80 and self.per<90:
                print("Class B")
            case b if self.per>=70 and self.per<80:
                print("Class C")
            case b if self.per>=60 and self.per<70:
                print("Pass")
            case a if self.per<60:
                print("Fail")

r1=Result(92,95,97,88,90)
print(r1.total())
print(r1.per())
r1.grade()
