/**
 * 
 */
package com.ucs.fedbank.service;

import java.util.List;
import java.util.Map;

import com.ucs.fedbank.model.PincodeData;
import com.ucs.fedbank.model.VendorBankDetails;
import com.ucs.fedbank.model.VendorDetails;
import com.ucs.fedbank.model.VendorGstDetails;
import com.ucs.fedbank.model.VendorTaxDeduction;

/**
 * @author user
 *
 */
public interface VendorManagementService {
	
	public VendorDetails saveVendor(VendorDetails vendorDetails);
	public List<VendorDetails> findAll();
	public VendorBankDetails saveBankDetails(VendorBankDetails vendorBankDetails);
	public List<VendorBankDetails> findBankDetailsByVendorId(String vendor_id);
	public VendorDetails findByVendorId(String vendor_id);
	public VendorTaxDeduction saveTdsDetails(VendorTaxDeduction vendorTaxDeduction);
	public List<VendorGstDetails> saveGstDetails(List<VendorGstDetails> gstDetails);
	public List<PincodeData> getPincodeData(String pincode);
    

}
