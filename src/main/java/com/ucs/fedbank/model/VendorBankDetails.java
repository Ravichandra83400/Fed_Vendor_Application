package com.ucs.fedbank.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "bank_account_detais")
public class VendorBankDetails {


	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String vendor_id;
	private  String bank_name;
	private String bank_branch_address;
	private String accont_holder_name;
	private String  account_type;
	private String ifsc_code ;
	private String bank_account_filename;
	private byte[] bank_account_document;
	private String agreement_copy ;
	private String agreement_filename;
	private byte[] agreement_document;
	private Date  agreement_start_date;
	private Date agreement_end_date;
	private String  status;
	private Date create_date;
	private Date modify_date;
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public String getBank_branch_address() {
		return bank_branch_address;
	}
	public void setBank_branch_address(String bank_branch_address) {
		this.bank_branch_address = bank_branch_address;
	}
	public String getAccont_holder_name() {
		return accont_holder_name;
	}
	public void setAccont_holder_name(String accont_holder_name) {
		this.accont_holder_name = accont_holder_name;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public String getIfsc_code() {
		return ifsc_code;
	}
	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	public String getBank_account_filename() {
		return bank_account_filename;
	}
	public void setBank_account_filename(String bank_account_filename) {
		this.bank_account_filename = bank_account_filename;
	}
	public byte[] getBank_account_document() {
		return bank_account_document;
	}
	public void setBank_account_document(byte[] bank_account_document) {
		this.bank_account_document = bank_account_document;
	}
	public String getAgreement_copy() {
		return agreement_copy;
	}
	public void setAgreement_copy(String agreement_copy) {
		this.agreement_copy = agreement_copy;
	}
	public String getAgreement_filename() {
		return agreement_filename;
	}
	public void setAgreement_filename(String agreement_filename) {
		this.agreement_filename = agreement_filename;
	}
	public byte[] getAgreement_document() {
		return agreement_document;
	}
	public void setAgreement_document(byte[] agreement_document) {
		this.agreement_document = agreement_document;
	}
	public Date getAgreement_start_date() {
		return agreement_start_date;
	}
	public void setAgreement_start_date(Date agreement_start_date) {
		this.agreement_start_date = agreement_start_date;
	}
	public Date getAgreement_end_date() {
		return agreement_end_date;
	}
	public void setAgreement_end_date(Date agreement_end_date) {
		this.agreement_end_date = agreement_end_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public Date getModify_date() {
		return modify_date;
	}
	public void setModify_date(Date modify_date) {
		this.modify_date = modify_date;
	}
	


}
