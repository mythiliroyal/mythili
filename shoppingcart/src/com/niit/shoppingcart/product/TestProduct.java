package com.niit.shoppingcart.product;

public class TestProduct {
public static void main(String[] args)
{
Product product=new Product();
product.setId("PR001");
product.setName("mobile product");
product.setPrice(15000);
System.out.println(product.getId());
System.out.println(product.getName());
System.out.println(product.getPrice());
}
}
