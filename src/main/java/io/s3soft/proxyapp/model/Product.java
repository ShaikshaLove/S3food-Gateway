package io.s3soft.proxyapp.model;

import java.util.Date;

public class Product {
	
	private String productId;
	private String productName;
	private String manufacturer;
	private String description;
	private double mrp;
	private double currentCost;
	private String imageName;
	private Date uploadDate;
	private Date lastModifiedDate;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getMrp() {
		return mrp;
	}
	public void setMrp(double mrp) {
		this.mrp = mrp;
	}
	public double getCurrentCost() {
		return currentCost;
	}
	public void setCurrentCost(double currentCost) {
		this.currentCost = currentCost;
	}
	
	public Date getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", manufacturer=" + manufacturer
				+ ", description=" + description + ", mrp=" + mrp + ", currentCost=" + currentCost + ", imageName="
				+ imageName + ", uploadDate=" + uploadDate + ", lastModifiedDate=" + lastModifiedDate + "]";
	}
	
	
	
}
