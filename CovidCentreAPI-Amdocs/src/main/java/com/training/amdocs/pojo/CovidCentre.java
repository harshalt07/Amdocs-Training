package com.training.amdocs.pojo;

public class CovidCentre {
	
	private Integer id;
	
	private String name;
	
	private String address;
	
	private Integer pinCode;
	
	

	public CovidCentre(Integer id, String name, String address, Integer pinCode) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.pinCode = pinCode;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getPincode() {
		return pinCode;
	}

	public void setPincode(Integer pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "CovidCentre [id=" + id + ", name=" + name + ", address=" + address + ", pincode=" + pinCode + "]";
	}
	
	
	
	
	

}
