package net.codejava.model;

import javax.validation.Valid;

import lombok.Data;

@Data
public class User {

	@Valid
	private BasicInfo basicInfo;

	@Valid
	private Address address;

	@Valid
	private Passport passport;

	/*public BasicInfo getBasicInfo() {
		return basicInfo;
	}

	public void setBasicInfo(BasicInfo basicInfo) {
		this.basicInfo = basicInfo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}*/

}
