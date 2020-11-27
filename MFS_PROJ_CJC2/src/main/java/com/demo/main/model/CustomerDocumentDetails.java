package com.demo.main.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class CustomerDocumentDetails {
	
	@Id
	private int document_id;

	private int customer_id;
	@Lob
	private byte[] address_proof;
	@Lob
	private byte[] bank_statement;
	@Lob
	private byte[] photo;
	@Lob
	private byte[] signature;
	@Lob
	private byte[] thumb;
	@Lob
	private byte[] bank_cheque;
	@Lob
	private byte[] adhar_card;
	@Lob
	private byte[] pancard;
	@Lob
	private byte[] previous_loan_statement;
	@Lob
	private byte[] current_other_loan_details;
	
	
	
	
	
	
	@Override
	public String toString() {
		return "CustomerDocumentDetails [document_id=" + document_id + ", customer_id=" + customer_id
				+ ", address_proof=" + Arrays.toString(address_proof) + ", bank_statement="
				+ Arrays.toString(bank_statement) + ", photo=" + Arrays.toString(photo) + ", signature="
				+ Arrays.toString(signature) + ", thumb=" + Arrays.toString(thumb) + ", bank_cheque="
				+ Arrays.toString(bank_cheque) + ", adhar_card=" + Arrays.toString(adhar_card) + ", pancard="
				+ Arrays.toString(pancard) + ", previous_loan_statement=" + Arrays.toString(previous_loan_statement)
				+ ", current_other_loan_details=" + Arrays.toString(current_other_loan_details) + "]";
	}
	public int getDocument_id() {
		return document_id;
	}
	public void setDocument_id(int document_id) {
		this.document_id = document_id;
	}
	
	
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public byte[] getAddress_proof() {
		return address_proof;
	}
	public void setAddress_proof(byte[] address_proof) {
		this.address_proof = address_proof;
	}
	public byte[] getBank_statement() {
		return bank_statement;
	}
	public void setBank_statement(byte[] bank_statement) {
		this.bank_statement = bank_statement;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public byte[] getSignature() {
		return signature;
	}
	public void setSignature(byte[] signature) {
		this.signature = signature;
	}

	public byte[] getThumb() {
		return thumb;
	}

	public void setThumb(byte[] thumb) {
		this.thumb = thumb;
	}

	public byte[] getBank_cheque() {
		return bank_cheque;
	}

	public void setBank_cheque(byte[] bank_cheque) {
		this.bank_cheque = bank_cheque;
	}

	public byte[] getAdhar_card() {
		return adhar_card;
	}

	public void setAdhar_card(byte[] adhar_card) {
		this.adhar_card = adhar_card;
	}

	public byte[] getPancard() {
		return pancard;
	}

	public void setPancard(byte[] pancard) {
		this.pancard = pancard;
	}

	public byte[] getPrevious_loan_statement() {
		return previous_loan_statement;
	}

	public void setPrevious_loan_statement(byte[] previous_loan_statement) {
		this.previous_loan_statement = previous_loan_statement;
	}

	public byte[] getCurrent_other_loan_details() {
		return current_other_loan_details;
	}

	public void setCurrent_other_loan_details(byte[] current_other_loan_details) {
		this.current_other_loan_details = current_other_loan_details;
	}
	
	
	
}
