/**
 * StudDemo
 */
class Student {
    int rollno;
    String name;

    void getValue(int r, String n){
        rollno = r;
        name = n;
    }

    void putValue() {
        System.out.println("Rollno: " + rollno);
		System.out.println("Name: " + name);
    }
}
class StudDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.getValue(1,"Abc");
        s2.getValue(2,"Xyz");
        s1.putValue();
        s2.putValue();
    }
    
}