package com.POJOclasses;

import java.util.List;

//Class created for nested JSON
public class coursesClass 
{
	private List<subClass_webAutomation> webAutomation; // adding LIST to tell java that the subClass will be an array
	private List<subClass_api> api;
	private List<subClass_mobile> mobile;

	public List<subClass_webAutomation> getWebAutomation() {
		return webAutomation;
	}

	public void setWebAutomation(List<subClass_webAutomation> webAutomation) {
		this.webAutomation = webAutomation;
	}

	public List<subClass_api> getApi() {
		return api;
	}

	public void setApi(List<subClass_api> api) {
		this.api = api;
	}

	public List<subClass_mobile> getMobile() {
		return mobile;
	}

	public void setMobile(List<subClass_mobile> mobile) {
		this.mobile = mobile;
	}

}
