class Student {
	int enno;
	String name;
	void getStud(int n,String nm) {
		enno = n;
		name = nm;
	}
}
class Marksheet extends Student {
	float sub1;
	float sub2;
	void getMarks(float s1,float s2){
		sub1 = s1;
		sub2 = s2;
	}
	void display() {
		System.out.println("Enrolment No. : "+enno);
		System.out.println("Name : "+name);
		System.out.println("Subject 1 Marks : "+sub1);
		System.out.println("Subject 2 Marks : "+sub2);
	}
}

class SingleInh {
	public static void main(String[] Args){
		Marksheet m1 = new Marksheet();
		m1.getStud(123,"Abc");
		m1.getMarks(25.6f,36.8f);
		m1.display();
	}
}