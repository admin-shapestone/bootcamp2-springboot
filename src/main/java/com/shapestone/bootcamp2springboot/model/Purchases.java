package com.shapestone.bootcamp2springboot.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "PurchaseTable")
public class Purchases {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "purchaseId")
	private int purchaseId;
	@Column(name = "itemPurchased")
	private String itemPurchased;
	@Column(name = "quantity")
	private int quantity;
	@Column(name = "price")
	private double price;
	@Column(name = "dateOfPurchase")
	private Date dateOfPurchase;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customerId")
	private Customers customers;
	
	

	public Customers getCustomers() {
		return customers;
	}

	public void setCustomers(Customers customers) {
		this.customers = customers;
	}

	public int getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}

	public String getItemPurchased() {
		return itemPurchased;
	}

	public void setItemPurchased(String itemPurchased) {
		this.itemPurchased = itemPurchased;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(Date dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	

	
	  
	 
	@Override
	public String toString() {
		return "Purchases [purchaseId=" + purchaseId + ", itemPurchased=" + itemPurchased + ", quantity=" + quantity
				+ ", price=" + price + ", dateOfPurchase=" + dateOfPurchase + "]";
	}

	public Purchases(int purchaseId, String itemPurchased, int quantity, double price, Date dateOfPurchase) {
		super();
		this.purchaseId = purchaseId;
		this.itemPurchased = itemPurchased;
		this.quantity = quantity;
		this.price = price;
		this.dateOfPurchase = dateOfPurchase;
	}

	public Purchases() {
		super();
		// TODO Auto-generated constructor stub
	}

}
