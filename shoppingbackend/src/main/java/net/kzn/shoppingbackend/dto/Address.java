package net.kzn.shoppingbackend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Address implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/*-----------*/

	@ManyToOne
	private User user;

	/*----------*/

	@Column(name = "address_line_one")
	@NotBlank(message="Please Enter Address Line One")
	private String addressLineOne;
	@Column(name = "address_line_two")
	@NotBlank(message="Please Enter Address Line Two")
	private String addresssLineTwo;
	@NotBlank(message="Please Enter City")
	private String city;
	@NotBlank(message="Please Enter State")
	private String state;
	@NotBlank(message="Please Enter Country")
	private String country;
	@NotBlank(message="Please Enter Postal Code")
	@Column(name = "postal_code")
	private String postalCode;
	private boolean shipping;
	private boolean billing;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getAddressLineOne() {
		return addressLineOne;
	}

	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}

	public String getAddresssLineTwo() {
		return addresssLineTwo;
	}

	public void setAddresssLineTwo(String addresssLineTwo) {
		this.addresssLineTwo = addresssLineTwo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public boolean isShipping() {
		return shipping;
	}

	public void setShipping(boolean shipping) {
		this.shipping = shipping;
	}

	public boolean isBilling() {
		return billing;
	}

	public void setBilling(boolean billing) {
		this.billing = billing;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", user=" + user + ", addressLineOne=" + addressLineOne + ", addresssLineTwo="
				+ addresssLineTwo + ", city=" + city + ", state=" + state + ", country=" + country + ", postalCode="
				+ postalCode + ", shipping=" + shipping + ", billing=" + billing + "]";
	}

	

	
}
