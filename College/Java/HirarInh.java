/* Hirarchical Inheritance*/

class Human{
	String first_name;
	String last_name;
}
class Student extends Human{
	String grade;
	Student(String fn,String ln,String g){
		System.out.println("Object Student Constructed...");
		first_name=fn;
		last_name=ln;
		grade=g;
	}
	void getInfo(){
		System.out.println("First Name = "+first_name);
		System.out.println("Last Name = "+last_name);
		System.out.println("Grade = "+grade);
	}
}
class Worker extends Human {
	double week_salary;
	double workhrs_day;
	Worker(String fn,String ln,double ws,double wh){
		System.out.println("Object Worker Constructed...");
		first_name=fn;
		last_name=ln;
		week_salary=ws;
		workhrs_day=wh;
	}
	double moneyPerHour(){
		return 500;
	}
	void getInfo(){
		System.out.println("First Name = "+first_name);
		System.out.println("Last Name = "+last_name);
		System.out.println("Week Salary = "+week_salary);
		System.out.println("Work Hours per day = "+workhrs_day);
	}
}
class HirarInh {
	public static void main(String[] Args){
		Student s1 = new Student("ABC","Xyz","A1");
		s1.getInfo();
		Worker w1 = new Worker("AAA","BBB",2000,8);
		w1.getInfo();
		System.out.println("Salary per Hour : "+w1.moneyPerHour());
	}
	
}