package com.emc.cf.app.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ApiKey {

	@Id
	private String apiKey;
	
	@Column
	private String instanceId;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date configurationDate;
	
	@ElementCollection
	private List<String> applicationId;
	
	public ApiKey() {
		applicationId = new ArrayList<String>();
	}

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public Date getConfigurationDate() {
		return configurationDate;
	}

	public void setConfigurationDate(Date configurationDate) {
		this.configurationDate = configurationDate;
	}

	public List<String> getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(List<String> applicationId) {
		this.applicationId = applicationId;
	}

	
	
	
	
}
