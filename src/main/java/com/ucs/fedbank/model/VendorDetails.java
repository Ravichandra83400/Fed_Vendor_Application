package com.ucs.fedbank.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.ucs.fedbank.util.VendorIdSequenceGenertor;



@Entity
@Table(name = "company_details")
public class VendorDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vendor_seq")
	@GenericGenerator(
			name = "vendor_seq", 
			strategy = "com.ucs.fedbank.util.VendorIdSequenceGenertor", 
			parameters = {
					@Parameter(name = VendorIdSequenceGenertor.INCREMENT_PARAM, value = "1"),
					@Parameter(name = VendorIdSequenceGenertor.VALUE_PREFIX_PARAMETER, value = "V"),
					@Parameter(name = VendorIdSequenceGenertor.NUMBER_FORMAT_PARAMETER, value = "%05d") })
	               @Column(name="vendor_id")
	               public String vendorID ;
	private String gl_code;

	
	
	@Column(name = " company_name")
	private  String companyName;
	@Column(name = "legal_status")
	private String legalStatus;
	@Column(name = "year_of_incorporation")
	private int yearOfCorporation;
	@Column(name = " nature_of_business")
	private String  nature;
	@Column(name = "address_line1")
	private String address1;
	@Column(name = "address_line2")
	private String address2;
	@Column(name = "address_line3")
	private String address3;
	@Column(name = " pincode")
	private String pincode;
	@Column(name = "state")
	private String state;
	@Column(name = "city")
	private String city;
	@Column(name = " website_address")
	private String website;
	@Column(name = "name")
	private String name;
	@Column(name = "phone_number")
	private String  PhoneNumber;
	@Column(name = "email")
	private String email;
	
	@Column(name = "create_date")
	private Date CreateDate;
	
	@Column(name = " modify_date")
	private Date ModifyDate;
	
	
	public String getCompanyName() {
		return companyName;
	}
	public int getYearOfCorporation() {
		return yearOfCorporation;
	}
	public void setYearOfCorporation(int yearOfCorporation) {
		this.yearOfCorporation = yearOfCorporation;
	}
	public String getVendorID() {
		return vendorID;
	}
	public void setVendorID(String vendorID) {
		this.vendorID = vendorID;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getLegalStatus() {
		return legalStatus;
	}
	public void setLegalStatus(String legalStatus) {
		this.legalStatus = legalStatus;
	}
		
	
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getAddress3() {
		return address3;
	}
	public void setAddress3(String address3) {
		this.address3 = address3;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return PhoneNumber;
	}
	public void setNumber(String number) {
		this.PhoneNumber = number;
	}
	public String getEmail() {
		return email;
	}
	
	
	public String getGl_code() {
		return gl_code;
	}
	public void setGl_code(String gl_code) {
		this.gl_code = gl_code;
	}
	public Date getCreateDate() {
		return CreateDate;
	}
	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}
	public Date getModifyDate() {
		return ModifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		ModifyDate = modifyDate;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	

}
