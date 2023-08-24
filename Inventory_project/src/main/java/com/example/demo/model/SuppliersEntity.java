package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SuppliersEntity {
	
	@Id
	private Integer supplier_id;
	
	@Column(name = "Name")
	private String supplier_name;
	
	@Column(name = "Mail")
	private String contact_mail;
	
	@Column(name = "phone_number")
	private String contact_phone;

	public SuppliersEntity() {
		super();
		// TODO Auto-generated constructor stub
	}



	public SuppliersEntity(Integer supplier_id, String supplier_name, String contact_mail, String contact_phone) {
		super();
		this.supplier_id = supplier_id;
		this.supplier_name = supplier_name;
		this.contact_mail = contact_mail;
		this.contact_phone = contact_phone;
	}


	public Integer getSupplier_id() {
		return supplier_id;
	}

	public void setSupplier_id(Integer supplier_id) {
		this.supplier_id = supplier_id;
	}

	public String getSupplier_name() {
		return supplier_name;
	}

	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}

	
	public String getContact_mail() {
		return contact_mail;
	}
	
	
	public void setContact_mail(String contact_mail) {
		this.contact_mail = contact_mail;
	}


	public String getContact_phone() {
		return contact_phone;
	}

	public void setContact_phone(String contact_phone) {
		this.contact_phone = contact_phone;
	}
	
}
