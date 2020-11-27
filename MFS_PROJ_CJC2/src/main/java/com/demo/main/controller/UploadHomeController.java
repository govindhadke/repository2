package com.demo.main.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.demo.main.model.CustomerDocumentDetails;
import com.demo.main.service.StatusInfoService;
//mport com.demo.main.model.EmployeeDocumentDetails;
import com.demo.main.service.UploadServiceInterface;

@RestController
public class UploadHomeController 
{
	@Autowired
	UploadServiceInterface si;
	
	
	@GetMapping("/")
	public String welcome()
	{
		return "Welcome To File Upload !!";
	}
	
	@PostMapping(value = "/uploaddoc",consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
	public String m1(@RequestPart("address_proof") MultipartFile file1,
					@RequestPart("bank_statement") MultipartFile file2,
					@RequestPart("photo") MultipartFile file3,
					@RequestPart("signature") MultipartFile file4,
					@RequestPart("thumb") MultipartFile file5,
					@RequestPart("bank_cheque") MultipartFile file6,
					@RequestPart("adhar_card") MultipartFile file7,
					@RequestPart("pancard") MultipartFile file8,
					@RequestPart("previous_loan_statement") MultipartFile file9,
					@RequestPart("current_other_loan_details") MultipartFile file10,
					@RequestPart("customer_id") int file11,
					@RequestPart("document_id") int file12)throws IOException
	{
		
		
		CustomerDocumentDetails edd=new CustomerDocumentDetails();
		edd.setDocument_id(file12);
		edd.setCustomer_id(file11);
		edd.setAddress_proof(file1.getBytes());
		edd.setBank_statement(file2.getBytes());
		edd.setPhoto(file3.getBytes());
		edd.setSignature(file4.getBytes());
		edd.setThumb(file5.getBytes());
		edd.setBank_cheque(file6.getBytes());
		edd.setAdhar_card(file7.getBytes());
		edd.setPancard(file8.getBytes());
		edd.setPrevious_loan_statement(file9.getBytes());
		edd.setCurrent_other_loan_details(file10.getBytes());
		
		System.out.println(edd);
		
		si.customerDocument(edd);
		return "Document Uploaded Successfully";
	}
}
