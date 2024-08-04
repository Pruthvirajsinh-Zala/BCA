class A:

    def __init__(self):
        print("in A init")

    def feature1(self):
        print("Feature 1-A Working")

    def feature2(self):
        print("Feature 2 Working")

class B:

    def __init__(self):
        super().__init__()
        print("in B init")

    def feature1(self):
        print("Feature 1-B Working")

    def feature4(self):
        print("Feature 4 Working")

class C(A,B):
    def __init__(self):
        super().__init__()
        print("in C init")

    def feat(self):
        super().feature2()

a1 = C()
a1.feature1()
a1.feat()