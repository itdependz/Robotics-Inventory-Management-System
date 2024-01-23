package com.samarth;

public class Page {
	private int pageNumber;
	
	
	public Page(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	
	public void nextPage() {
		pageNumber++;
	}
	
	public void lastPage() {
		if(pageNumber-1>=0) {
		 pageNumber--;
		}
	}
	public int getPage() {
		return pageNumber;
	}
}
