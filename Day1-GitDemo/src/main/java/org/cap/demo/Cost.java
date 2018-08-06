package org.cap.demo;

public class Cost {

	int v=52;

	public void pricetag()
	{
		if(v>80)
		{
			System.out.println("Cost of product will have high tax");
		}
		else
			System.out.println("Cost of product has low tax");
	}
	
}
