package com.airtel.mandate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.airtel.mandate.utills.AuditModel;




@Entity
@Table(name = "TEMP_MANDATES")
public class NPCIMandate extends AuditModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	@Column(length=10485760)
	private String mandateInfo;
	
	private String mandateStatus ;

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

	public String getMandateStatus() {
		return mandateStatus;
	}

	public void setMandateStatus(String mandateStatus) {
		this.mandateStatus = mandateStatus;
	}

	
	
	

}
