package com.demo.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StatusInfo {
	
	@Id
	private int status_id;
	private int status_code;
	private String status_name;
	public int getStatus_id() {
		return status_id;
	}
	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}
	public int getStatus_code() {
		return status_code;
	}
	public void setStatus_code(int status_code) {
		this.status_code = status_code;
	}
	public String getStatus_name() {
		return status_name;
	}
	public void setStatus_name(String status_name) {
		this.status_name = status_name;
	}
	
	

		
}
