/**
 * 
 */
package com.ucs.fedbank.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ucs.fedbank.model.PincodeData;
import com.ucs.fedbank.model.VendorBankDetails;
import com.ucs.fedbank.model.VendorDetails;
import com.ucs.fedbank.model.VendorGstDetails;
import com.ucs.fedbank.model.VendorTaxDeduction;
import com.ucs.fedbank.service.VendorManagementService;

/**
 * @author user
 *
 */
@Controller
public class VendorManagementController {

	public String vendorId;

	@Autowired
	VendorManagementService managementService;

	@GetMapping("/")
	public String welcome(Model model) {
		System.out.println("VendorManagementController.welcome()");
		List<VendorDetails> vendorList =  managementService.findAll();
		model.addAttribute("vendorList", vendorList);
		return "index";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerVendor(Model model) {
		model.addAttribute("vendordetails", new VendorDetails());

		return "basicdetails";
	}

	@RequestMapping(value = "/savebasicdetails", method = RequestMethod.POST)
	public ModelAndView saveVendorBasicDetails(@ModelAttribute("vendordetails") VendorDetails vendorDetails) {

		vendorDetails = managementService.saveVendor(vendorDetails);

		List<VendorBankDetails> bankdetails = managementService.findBankDetailsByVendorId(vendorDetails.getVendorID());
		vendorId = vendorDetails.getVendorID();
		System.out.println("vendor id......." + vendorDetails.getVendorID());

		System.out.println("vendor_name" + vendorDetails.getCompanyName());
		ModelAndView model = new ModelAndView("bankdetails");
		model.addObject("vendordetails", vendorDetails);
		model.addObject("bankdetails", bankdetails);
		model.addObject("vendorId", vendorId);


		return model;

	}

	@RequestMapping(value = "/savebankdetails", method = RequestMethod.POST)
	public String saveVendorBankDetails(Model model, VendorBankDetails bankDetails,
			@RequestParam("agrementfile") MultipartFile agrementfile,
			@RequestParam("bankdocfile") MultipartFile bankdocfile) throws IOException {
		System.out.println("VendorManagementController.saveVendorBankDetails( vendorId ) "+vendorId);
		//String vendorId = (String) model.getAttribute("vendorId");
		bankDetails.setVendor_id(vendorId);
		byte[] agrementByte = agrementfile.getBytes();
		String fileName = agrementfile.getOriginalFilename();

		bankDetails.setAgreement_document(agrementByte);
		bankDetails.setAgreement_filename(fileName);
		byte[] bankDocFile = bankdocfile.getBytes();
		String bankFileName = bankdocfile.getOriginalFilename();

		bankDetails.setBank_account_document(bankDocFile);
		bankDetails.setBank_account_filename(bankFileName);

		bankDetails = managementService.saveBankDetails(bankDetails);
		System.out.println("VendorManagementController.saveVendorBankDetails() bankDetails.getVendor_id() "+bankDetails.getVendor_id());
		List<VendorBankDetails> bankdetails = managementService.findBankDetailsByVendorId(bankDetails.getVendor_id());
		model.addAttribute("bankdetails", bankdetails);
		return "bankdetails";
	}

	@RequestMapping(value = "/getTaxdetails", method = RequestMethod.GET)
	public String getTaxDeduction(Model model) {
		List<VendorGstDetails> gstDetails = new ArrayList<VendorGstDetails>();
		gstDetails.add(new VendorGstDetails());
		VendorTaxDeduction deduction = new VendorTaxDeduction();
		deduction.setGstDetais(gstDetails);
		model.addAttribute("taxdeduction", deduction);
		return "taxdeduction";
	}

	@RequestMapping(value = "/submit", method = RequestMethod.POST)
	public String saveTdsDetails(@ModelAttribute("taxdeduction") VendorTaxDeduction vendorTaxDeduction,
			@RequestParam("panDocument") MultipartFile pan_document,
			@RequestParam("gstDocument") MultipartFile[] gst_document, @RequestParam("state") String[] state,
			@RequestParam("gstNumber") String[] gst_number, @RequestParam("CinDocument") MultipartFile cin_document,
			@RequestParam("esicDocument") MultipartFile esic_document,
			@RequestParam("pfDocument") MultipartFile pf_document,
			@RequestParam("msmeDocument") MultipartFile msme_document,
			@RequestParam("tdsDocument") MultipartFile tds_document,
			@RequestParam("tdsLimitDocument") MultipartFile tds_limit_document) throws IOException {

		/*
		 * System.out.println("GstNo....."+vendorTaxDeduction );
		 * System.out.println(vendorTaxDeduction.getGstDetails());
		 * System.out.println("gstDocument"+gst_document.length);
		 */

		System.out.println(gst_number.length);

		vendorTaxDeduction.setVendor_id(vendorId);
		byte[] panDocument = pan_document.getBytes();
		String panFile = pan_document.getOriginalFilename();
		vendorTaxDeduction.setPan_document(panDocument);
		vendorTaxDeduction.setPan_filename(panFile);

		System.out.println("state......" + state.length);
		// System.out.println();

		System.out.println("VendorManagementController.saveTdsDetails()  " + state.length);
		// byte[] gstDocument = gst_document.getBytes();
		// String gstFile = gst_document.getOriginalFilename();
		// vendorTaxDeduction.setGst_document(gstDocument);
		// vendorTaxDeduction.setGst_filename(gstFile);

		byte[] cinDocument = cin_document.getBytes();
		String cinFile = cin_document.getOriginalFilename();
		vendorTaxDeduction.setCin_document(cinDocument);
		vendorTaxDeduction.setCin_filename(cinFile);

		byte[] esicDocument = esic_document.getBytes();
		String esicFile = esic_document.getOriginalFilename();
		vendorTaxDeduction.setEsic_document(esicDocument);
		vendorTaxDeduction.setEsic_filename(esicFile);

		byte[] pfDocument = pf_document.getBytes();
		String pfFile = pf_document.getOriginalFilename();
		vendorTaxDeduction.setPf_document(pfDocument);
		vendorTaxDeduction.setPf_filename(pfFile);

		byte[] msmeDocument = msme_document.getBytes();
		String msmeFile = msme_document.getOriginalFilename();
		vendorTaxDeduction.setMsme_document(msmeDocument);
		vendorTaxDeduction.setMsme_filename(msmeFile);

		byte[] tdsDocument = tds_document.getBytes();
		String tdsFile = tds_document.getOriginalFilename();
		vendorTaxDeduction.setTds_document(tdsDocument);
		vendorTaxDeduction.setTds_filename(tdsFile);

		byte[] tdsLimitDocument = tds_limit_document.getBytes();

		String tdsLimitFile = tds_limit_document.getOriginalFilename();
		vendorTaxDeduction.setTds_limit_document(tdsLimitDocument);
		vendorTaxDeduction.setTds_limit_filename(tdsLimitFile);

		managementService.saveTdsDetails(vendorTaxDeduction);
		List<VendorGstDetails> gstDetails = new ArrayList<VendorGstDetails>();

		for (int i = 0; i < gst_number.length; i++) {

			VendorGstDetails vendorGstDetails = new VendorGstDetails();
			vendorGstDetails.setGst_number(gst_number[i]);
			vendorGstDetails.setGst_document(gst_document[i].getBytes());
			vendorGstDetails.setGst_filename(gst_document[i].getOriginalFilename());
			vendorGstDetails.setVendor_id(vendorId);
			vendorGstDetails.setState(state[i]);
			gstDetails.add(vendorGstDetails);
		}
		managementService.saveGstDetails(gstDetails);
		return "success";

	}
	
	
    @GetMapping("/getPincodeDetails")
	public @ResponseBody List<PincodeData> getPincodeDetails(@RequestParam("pincode")String pincode){
		
	return	managementService.getPincodeData(pincode);
		
		
		
		
		
		
		
	}
	
	

}
