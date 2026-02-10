package trials;


public class Testers {
	public int num1;
	public int num2;

	Testers(int num1, int num2) {
		this.num1 = num1;
		num2 = num2;
	}

	public static void main(String args[]) {
		Testers tester = new Testers(20, 40);
		System.out.println(tester.num1);
		System.out.println(tester.num2);
	}
}