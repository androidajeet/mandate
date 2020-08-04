package com.airtel.mandate.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.airtel.mandate.entities.NPCIMandate;
import com.airtel.mandate.repository.NPCIMandateTempRepository;

@RestController
public class ManadateController {

	private static final Logger log = LoggerFactory.getLogger(ManadateController.class);

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	private NPCIMandateTempRepository repository;

	
	
	
	    //Save NPCI mandate info
		@PostMapping(value = "/npci/mandate/xml", consumes = MediaType.APPLICATION_XML_VALUE)
		@ResponseStatus(HttpStatus.CREATED)
		String newMandateXML(@RequestBody NPCIMandate npciMandateInfo) {
			
			//Put your mock server url here
			final String uri = "https://a42b7777-98d7-4236-a47b-73333a8e6039.mock.pstmn.io/npci/xml";
			
			 RestTemplate restTemplate = new RestTemplate();
			    String mandateInfo = restTemplate.getForObject(uri, String.class);
			     
			    log.info(mandateInfo);
			  
			
			NPCIMandate npciMandateDTO = new NPCIMandate(mandateInfo);
			repository.save(npciMandateDTO);
			return mandateInfo;
			

		}

}
