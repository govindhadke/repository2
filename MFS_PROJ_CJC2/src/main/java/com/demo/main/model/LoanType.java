package com.demo.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoanType {

	@Id
	private int loan_id;
	private String loan_type_name;
	private int loan_type_code;
	private int loan_amount;
	private String loan_tenure;
	private int loan_status;
	public int getLoan_id() {
		return loan_id;
	}
	public void setLoan_id(int loan_id) {
		this.loan_id = loan_id;
	}
	public String getLoan_type_name() {
		return loan_type_name;
	}
	public void setLoan_type_name(String loan_type_name) {
		this.loan_type_name = loan_type_name;
	}
	public int getLoan_type_code() {
		return loan_type_code;
	}
	public void setLoan_type_code(int loan_type_code) {
		this.loan_type_code = loan_type_code;
	}
	public int getLoan_amount() {
		return loan_amount;
	}
	public void setLoan_amount(int loan_amount) {
		this.loan_amount = loan_amount;
	}
	public String getLoan_tenure() {
		return loan_tenure;
	}
	public void setLoan_tenure(String loan_tenure) {
		this.loan_tenure = loan_tenure;
	}
	public int getLoan_status() {
		return loan_status;
	}
	public void setLoan_status(int loan_status) {
		this.loan_status = loan_status;
	}
	
	
}
