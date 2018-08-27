package com.aaron.entity;

import java.util.List;

public class Cart {
	
	private List<Commodity> commodity;

	public List<Commodity> getCommodity() {
		return commodity;
	}

	public void setCommodity(List<Commodity> commodity) {
		this.commodity = commodity;
	}

	@Override
	public String toString() {
		return "Cart [commodity=" + commodity + "]";
	}

	
	

}
