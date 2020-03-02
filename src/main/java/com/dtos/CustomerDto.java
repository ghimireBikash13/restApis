package com.dtos;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;



public class CustomerDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@NotNull(message = "Name cannot be null")
	private String name;
	private String address;
	
	@NotEmpty(message = "Must include phone number")
	private String phone;
	private int age;
	private String gender;
	private String sSN;

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getsSN() {
		return sSN;
	}

	public void setsSN(String sSN) {
		this.sSN = sSN;
	}

	@Override
	public String toString() {
		return "CustomerDto [name=" + name + ", address=" + address + ", phone=" + phone + ", age=" + age + ", gender="
				+ gender + ", sSN=" + sSN + "]";
	}

}
