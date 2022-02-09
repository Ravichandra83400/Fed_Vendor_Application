package com.ucs.fedbank.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name = "tax_registration_details")
public class VendorTaxDeduction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String vendor_id;
	private String pan_number;
	private String pan_filename;
	private byte[] pan_document;

	private String cin_number;
	private String cin_filename;
	private byte[] cin_document;
	private String esic_regestration_no;
	private String esic_filename;
	private byte[] esic_document;
	private String pf_regestration_no;
	private String pf_filename;
	private byte[] pf_document;
	private String msme_regestration;
	private String msme_filename;
	private byte[] msme_document;
	private String tds_certificate;
	private String tds_filename;
	private byte[] tds_document;
	private String tds_deduction_limit;
	private String tds_limit_filename;
	private byte[] tds_limit_document;
	private Date tds_start_date;
	private Date tds_end_date;

	/*
	 * private String gst_number; private String gst_filename; private byte[]
	 * gst_document;
	 */
	
	  @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	  @JoinColumn(name="tax_reg_id")
	  @OrderColumn(name="type")
	 
	/*
	 * @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	 * 
	 * @JoinTable(name = "vender_gst_details", joinColumns = { @JoinColumn(name =
	 * "vendor_id") }, inverseJoinColumns = { @JoinColumn(name = "id") })
	 */
	// @JsonIgnoreProperties("com.ucs.fedbank.model.VendorGstDetails")
	
	private List<VendorGstDetails> gstDetails = new ArrayList<VendorGstDetails>();
	  
	  
	

	public List<VendorGstDetails> getGstDetails() {
		
			
		return gstDetails;
	}

	public void setGstDetais(List<VendorGstDetails> gstDetails) {
		this.gstDetails = gstDetails;
	}

	public String getCin_number() {
		return cin_number;
	}

	public void setCin_number(String cin_number) {
		this.cin_number = cin_number;
	}

	public String getCin_filename() {
		return cin_filename;
	}

	public void setCin_filename(String cin_filename) {
		this.cin_filename = cin_filename;
	}

	public byte[] getCin_document() {
		return cin_document;
	}

	public void setCin_document(byte[] cin_document) {
		this.cin_document = cin_document;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}

	public String getPan_number() {
		return pan_number;
	}

	public void setPan_number(String pan_number) {
		this.pan_number = pan_number;
	}

	public String getPan_filename() {
		return pan_filename;
	}

	public void setPan_filename(String pan_filename) {
		this.pan_filename = pan_filename;
	}

	public byte[] getPan_document() {
		return pan_document;
	}

	public void setPan_document(byte[] pan_document) {
		this.pan_document = pan_document;
	}
	/*
	 * public String getGst_number() { return gst_number; }
	 */

	/*
	 * public void setGst_number(String gst_number) { this.gst_number = gst_number;
	 * } public String getGst_filename() { return gst_filename; } public void
	 * setGst_filename(String gst_filename) { this.gst_filename = gst_filename; }
	 * public byte[] getGst_document() { return gst_document; } public void
	 * setGst_document(byte[] gst_document) { this.gst_document = gst_document; }
	 */public String getEsic_regestration_no() {
		return esic_regestration_no;
	}

	public void setEsic_regestration_no(String esic_regestration_no) {
		this.esic_regestration_no = esic_regestration_no;
	}

	public String getEsic_filename() {
		return esic_filename;
	}

	public void setEsic_filename(String esic_filename) {
		this.esic_filename = esic_filename;
	}

	public byte[] getEsic_document() {
		return esic_document;
	}

	public void setEsic_document(byte[] esic_document) {
		this.esic_document = esic_document;
	}

	public String getPf_regestration_no() {
		return pf_regestration_no;
	}

	public void setPf_regestration_no(String pf_regestration_no) {
		this.pf_regestration_no = pf_regestration_no;
	}

	public String getPf_filename() {
		return pf_filename;
	}

	public void setPf_filename(String pf_filename) {
		this.pf_filename = pf_filename;
	}

	public byte[] getPf_document() {
		return pf_document;
	}

	public void setPf_document(byte[] pf_document) {
		this.pf_document = pf_document;
	}

	public String getMsme_regestration() {
		return msme_regestration;
	}

	public void setMsme_regestration(String msme_regestration) {
		this.msme_regestration = msme_regestration;
	}

	public String getMsme_filename() {
		return msme_filename;
	}

	public void setMsme_filename(String msme_filename) {
		this.msme_filename = msme_filename;
	}

	public byte[] getMsme_document() {
		return msme_document;
	}

	public void setMsme_document(byte[] msme_document) {
		this.msme_document = msme_document;
	}

	public String getTds_certificate() {
		return tds_certificate;
	}

	public void setTds_certificate(String tds_certificate) {
		this.tds_certificate = tds_certificate;
	}

	public String getTds_filename() {
		return tds_filename;
	}

	public void setTds_filename(String tds_filename) {
		this.tds_filename = tds_filename;
	}

	public byte[] getTds_document() {
		return tds_document;
	}

	public void setTds_document(byte[] tds_document) {
		this.tds_document = tds_document;
	}

	public String getTds_deduction_limit() {
		return tds_deduction_limit;
	}

	public void setTds_deduction_limit(String tds_deduction_limit) {
		this.tds_deduction_limit = tds_deduction_limit;
	}

	public String getTds_limit_filename() {
		return tds_limit_filename;
	}

	public void setTds_limit_filename(String tds_limit_filename) {
		this.tds_limit_filename = tds_limit_filename;
	}

	public byte[] getTds_limit_document() {
		return tds_limit_document;
	}

	public void setTds_limit_document(byte[] tds_limit_document) {
		this.tds_limit_document = tds_limit_document;
	}

	public Date getTds_start_date() {
		return tds_start_date;
	}

	public void setTds_start_date(Date tds_start_date) {
		this.tds_start_date = tds_start_date;
	}

	public Date getTds_end_date() {
		return tds_end_date;
	}

	public void setTds_end_date(Date tds_end_date) {
		this.tds_end_date = tds_end_date;
	}

	@Override
	public String toString() {
		return "VendorTaxDeduction [id=" + id + ", vendor_id=" + vendor_id + ", pan_number=" + pan_number
				+ ", pan_filename=" + pan_filename + ", pan_document=" + Arrays.toString(pan_document) + ", cin_number="
				+ cin_number + ", cin_filename=" + cin_filename + ", cin_document=" + Arrays.toString(cin_document)
				+ ", esic_regestration_no=" + esic_regestration_no + ", esic_filename=" + esic_filename
				+ ", esic_document=" + Arrays.toString(esic_document) + ", pf_regestration_no=" + pf_regestration_no
				+ ", pf_filename=" + pf_filename + ", pf_document=" + Arrays.toString(pf_document)
				+ ", msme_regestration=" + msme_regestration + ", msme_filename=" + msme_filename + ", msme_document="
				+ Arrays.toString(msme_document) + ", tds_certificate=" + tds_certificate + ", tds_filename="
				+ tds_filename + ", tds_document=" + Arrays.toString(tds_document) + ", tds_deduction_limit="
				+ tds_deduction_limit + ", tds_limit_filename=" + tds_limit_filename + ", tds_limit_document="
				+ Arrays.toString(tds_limit_document) + ", tds_start_date=" + tds_start_date + ", tds_end_date="
				+ tds_end_date + ", gstDetails=" + gstDetails + "]";
	}
	
	

}
