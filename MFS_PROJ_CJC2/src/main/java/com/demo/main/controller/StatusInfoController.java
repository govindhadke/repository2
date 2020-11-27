package com.demo.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.main.model.StatusInfo;
import com.demo.main.service.StatusInfoService;

@RestController
public class StatusInfoController {
	
	@Autowired
	StatusInfoService si;

	@RequestMapping("/ss")
	public StatusInfo s()
	{
		StatusInfo si=new StatusInfo();
		si.setStatus_id(1);
		si.setStatus_code(0);
		si.setStatus_name("Active");
		
		return si;
	}
	
	@PostMapping("/addstatus")
	public void addStatus(@RequestBody StatusInfo s)
	{
		si.saveStatus(s);
	}
}
