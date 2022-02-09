package com.ucs.fedbank.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ucs.fedbank.model.VendorTaxDeduction;

@Repository
public interface TaxDeductionRepository extends JpaRepository<VendorTaxDeduction, Integer> {

}
