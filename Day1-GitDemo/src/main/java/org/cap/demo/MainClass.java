package org.cap.demo;

public class MainClass {

	public static void main(String[] args) {
		SalesClass class1=new SalesClass();
		class1.show();
		
		Cost p=new Cost();
		p.pricetag();
		
		Customer cus= new Customer();
		cus.cust();
		
		System.out.println("Hello All");
		number();
	}

 public static void number()
 {
	 for(int i=1;i<=10;)
	 {
		 System.out.println(i);
		 i++;
	 }
 }
	
}
