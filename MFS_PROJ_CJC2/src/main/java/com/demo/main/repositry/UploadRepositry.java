package com.demo.main.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.main.model.CustomerDocumentDetails;
//import com.demo.main.model.EmployeeDocumentDetails;

public interface UploadRepositry extends JpaRepository<CustomerDocumentDetails, Integer>
{

}
