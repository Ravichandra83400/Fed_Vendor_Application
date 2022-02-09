/**
 * 
 */
package com.ucs.fedbank.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.PingHealthIndicator;
import org.springframework.stereotype.Service;

import com.ucs.fedbank.dao.BankDetailsRepository;
import com.ucs.fedbank.dao.GstRepo;
import com.ucs.fedbank.dao.PostgresRepository;
import com.ucs.fedbank.dao.TaxDeductionRepository;
import com.ucs.fedbank.dao.VendorManagementRepository;
import com.ucs.fedbank.model.PincodeData;
import com.ucs.fedbank.model.VendorBankDetails;
import com.ucs.fedbank.model.VendorDetails;
import com.ucs.fedbank.model.VendorGstDetails;
import com.ucs.fedbank.model.VendorTaxDeduction;

@Service
public class VendorManagementServiceImpl implements VendorManagementService {

	@Autowired
	VendorManagementRepository managementRepository;
	@Autowired
	BankDetailsRepository bankDetailsRepository;

	@Autowired
	TaxDeductionRepository taxdeduction;
	@Autowired
	GstRepo gstRepo;
	
	@Autowired
	PostgresRepository postgressRepo;
	

	@Override
	public VendorDetails saveVendor(VendorDetails vendorDetails) {

		VendorDetails details = managementRepository.save(vendorDetails);
		return details;
	}

	@Override
	public VendorBankDetails saveBankDetails(VendorBankDetails vendorBankDetails) {
		VendorBankDetails bankDetails = bankDetailsRepository.save(vendorBankDetails);
		return bankDetails;
	}

	@Override
	public List<VendorBankDetails> findBankDetailsByVendorId(String vendor_id) {
		List<VendorBankDetails> bankDetails = bankDetailsRepository.findByVendor_id(vendor_id);
		return bankDetails;
	}

	@Override
	public VendorDetails findByVendorId(String vendor_id) {
		return managementRepository.getById(vendor_id);
	}

	@Override
	public VendorTaxDeduction saveTdsDetails(VendorTaxDeduction vendor) {
		VendorTaxDeduction tds = taxdeduction.save(vendor);
		return tds;
	}

	@Override
	public List<VendorGstDetails> saveGstDetails(List<VendorGstDetails> gstDetails) {
		return gstRepo.saveAll(gstDetails);
	}

	@Override
	public List<VendorDetails> findAll() {
		return managementRepository.findAll();
	}

	

	

	@Override
	public List<PincodeData> getPincodeData(String pincode) {
		  
	List<PincodeData> pincodeData =	postgressRepo.findByPincode(pincode);
		
		return pincodeData;
	}

}
