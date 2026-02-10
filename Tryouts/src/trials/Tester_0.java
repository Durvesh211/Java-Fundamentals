package trials;

public class Tester_0 {

	public static void main(String[] args) {

		 Customer1 customer = new Customer1();
		 System.out.println("Final bill amount: "+customer.payBill(40.0));
		 //Parent Reference -> Parent Object

		 RegularCustomer1 regularCustomer = new RegularCustomer1();
		 System.out.println("Final bill amount: "+regularCustomer.payBill(40.0));
		// Child Reference -> Child Object

		Customer1 regCust = new RegularCustomer1();
		// Parent Reference -> Child Object
		System.out.println("Final Bill : " + regCust.payBill(40.0)); 
	}
}

class Customer1 {

	public double payBill(double totalPrice) {
		System.out.println("Final bill for the customer is calculated here");
		return totalPrice;
	}
}

class RegularCustomer1 extends Customer1 {

	@Override
	public double payBill(double totalPrice) {
		System.out.println("Final bill for the regular customer is calculated here");
		double priceAfterDiscount = totalPrice * (1 - (5f / 100));
		return priceAfterDiscount;
	}

}