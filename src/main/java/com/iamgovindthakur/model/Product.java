package com.iamgovindthakur.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author iamgo
 *
 */
@Data
@AllArgsConstructor
public class Product {

	private String name;
	private String category;
	private int price;

	public String getNotification() {
		return "Product Launched Successfully";
	}

}
