package com.airtel.mandate.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "TEMP_MANDATES")
public class NPCIMandate {

	@Id
	@GeneratedValue
	private Long id;
	private String mandateInfo;

	public NPCIMandate() {

	}

	public NPCIMandate(String mandateInfo) {		
		this.mandateInfo = mandateInfo;
	}

	public Long getId() {
		return id;
	}

	public String getMandateInfo() {
		return mandateInfo;
	}

}
