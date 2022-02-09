package com.ucs.fedbank.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ucs.fedbank.model.VendorGstDetails;

@Repository
public interface GstRepo  extends JpaRepository<VendorGstDetails, Integer>{

}
