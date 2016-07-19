package com.mythu.flipkart;

public class Show {

	public static void main(String[] args) {
		Product prd=new Product();
		prd.setId("mythu001");
		prd.setName("Banaras saree");
		prd.setPrice(599);
		System.out.println(prd.getId());
		System.out.println(prd.getName());
		System.out.println(prd.getPrice());
	}

}
