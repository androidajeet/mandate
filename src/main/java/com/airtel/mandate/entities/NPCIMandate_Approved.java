package com.airtel.mandate.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "APPROVED_MANDATES")
public class NPCIMandate_Approved {
	
	@Id
	private Long id;
	private String mandateInfo;
	
	public NPCIMandate_Approved() {
		
	}

	public NPCIMandate_Approved(Long id, String mandateInfo) {
		this.id = id;
		this.mandateInfo = mandateInfo;
	}

	public Long getId() {
		return id;
	}

	public String getMandateInfo() {
		return mandateInfo;
	}
	
	
	
	

}
