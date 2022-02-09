package com.ucs.fedbank.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gst_details")
public class VendorGstDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String vendor_id;
	private String gst_number;
	private String gst_filename;
	private byte[] gst_document;
	private String state;
	// private MultipartFile gstDocument;

	public int getId() {
		return id;
	}

	/*
	 * public MultipartFile getGstDocument() { return gstDocument; } public void
	 * setGstDocument(MultipartFile gstDocument) { this.gstDocument = gstDocument; }
	 */
	public void setId(int id) {
		this.id = id;
	}

	public String getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}

	public String getGst_number() {
		return gst_number;
	}

	public void setGst_number(String gst_number) {
		this.gst_number = gst_number;
	}

	public String getGst_filename() {
		return gst_filename;
	}

	public void setGst_filename(String gst_filename) {
		this.gst_filename = gst_filename;
	}

	public byte[] getGst_document() {
		return gst_document;
	}

	public void setGst_document(byte[] gst_document) {
		this.gst_document = gst_document;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "VendorGstDetails [id=" + id + ", vendor_id=" + vendor_id + ", gst_number=" + gst_number
				+ ", gst_filename=" + gst_filename + ", gst_document=" + Arrays.toString(gst_document) + ", state="
				+ state + "]";
	}

}
