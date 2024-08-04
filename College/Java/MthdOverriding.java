class Bank {
	int getInt() {
		return 0;
	}
}
class ICICI extends Bank{
	int getInt() {
		return 5;
	}
}
class SBI extends Bank{
	int getInt() {
		return 8;
	}
}
class Axis extends Bank{
	int getInt() {
		return 4;
	}
}
class OverrdeDemo {
	public static void main(String[] Args) {
		ICICI b1 = new ICICI();
		SBI b2 = new SBI();
		Axis b3 = new Axis();
		System.out,println("ICICI : "+b1.getInt());
		System.out.println("SBI : "+b2.getInt());
		System.out.println("Axis : "+b3.getInt());
	}
}