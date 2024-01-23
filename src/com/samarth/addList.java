package com.samarth;
import java.util.*;

public class addList {
	public ArrayList<Product> productList = new ArrayList<Product>();
	
	public void addList() {
		
	}
	
	public void add(Product product) {
		productList.add(product);
	}
	
	public void showProducts() {
		for(Product i: productList) {
			System.out.println(i.getName());
		}
	}
	
	public int size() {
		return productList.size();
	}
	
	public Product getProduct(int i) {
		return productList.get(i);
	}
	
	public void clear() {
		productList.clear();
	}
}
