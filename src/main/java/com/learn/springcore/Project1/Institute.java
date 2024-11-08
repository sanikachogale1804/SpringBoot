package com.learn.springcore.Project1;

public class Institute {

	private int InstituteId;
	private String InstituteName;
	private String InstitudeAddress;
	
	public int getInstituteId() {
		return InstituteId;
	}
	public void setInstituteId(int instituteId) {
		InstituteId = instituteId;
	}
	public String getInstituteName() {
		return InstituteName;
	}
	public void setInstituteName(String instituteName) {
		InstituteName = instituteName;
	}
	public String getInstitudeAddress() {
		return InstitudeAddress;
	}
	public void setInstitudeAddress(String institudeAddress) {
		InstitudeAddress = institudeAddress;
	}
	@Override
	public String toString() {
		return "Institute [InstituteId=" + InstituteId + ", InstituteName=" + InstituteName + ", InstitudeAddress="
				+ InstitudeAddress + "]";
	}
	public Institute(int instituteId, String instituteName, String institudeAddress) {
		super();
		InstituteId = instituteId;
		InstituteName = instituteName;
		InstitudeAddress = institudeAddress;
	}
	public Institute() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
