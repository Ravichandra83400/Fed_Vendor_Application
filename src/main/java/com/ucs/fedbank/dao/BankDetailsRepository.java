/**
 * 
 */
package com.ucs.fedbank.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ucs.fedbank.model.VendorBankDetails;

/**
 * @author user
 *
 */
@Repository
public interface BankDetailsRepository extends JpaRepository<VendorBankDetails, Integer> {
    @Query("select e from #{#entityName} e where e.vendor_id = ?1")     
	List<VendorBankDetails> findByVendor_id(String vendorId);

}