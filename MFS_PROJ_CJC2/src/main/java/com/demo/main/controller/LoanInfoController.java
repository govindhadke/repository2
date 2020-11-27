package com.demo.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.main.model.LoanType;
import com.demo.main.service.LoanInfoService;


@RestController
public class LoanInfoController {
	
	@Autowired
	LoanInfoService lis;
	
	@RequestMapping("/l")
	public LoanType l1()
	{
		LoanType l=new LoanType();
		l.setLoan_id(1);
		l.setLoan_amount(20000);
		l.setLoan_status(1);
		l.setLoan_tenure("24Months");
		l.setLoan_type_code(1);
		l.setLoan_type_name("TwoWHeelrLoan");
		
		return l;
	}
	
	@PostMapping("/addLoanType")
	public void addLoan(@RequestBody LoanType l)
	{
		lis.saveLoan(l);
	}

}
