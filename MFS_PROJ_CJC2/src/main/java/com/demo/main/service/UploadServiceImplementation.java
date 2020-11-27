package com.demo.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.main.model.CustomerDocumentDetails;
//import com.demo.main.model.EmployeeDocumentDetails;
import com.demo.main.repositry.UploadRepositry;


@Service
public class UploadServiceImplementation implements UploadServiceInterface
{
   @Autowired
   UploadRepositry ur;

	@Override
	public void customerDocument(CustomerDocumentDetails edd) {
		// TODO Auto-generated method stub
		ur.save(edd);
	}


}
