package com.demo.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.main.model.LoanType;
import com.demo.main.repositry.LoanRepository;

@Service
public class LoanInfoServiceImpl implements LoanInfoService{
	
	@Autowired
	LoanRepository lr;

	@Override
	public void saveLoan(LoanType l) {
		// TODO Auto-generated method stub
		
		lr.save(l);
		
	}

}
