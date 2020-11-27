package com.demo.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.main.model.StatusInfo;
import com.demo.main.repositry.StatusRepository;

@Service
public class StatusInfoServiceImpl implements StatusInfoService{
	
	@Autowired
	StatusRepository sr;

	@Override
	public void saveStatus(StatusInfo s) {
		// TODO Auto-generated method stub
		
		sr.save(s);
		
		
	}

	
}
