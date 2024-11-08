package com.learn.springcore.Project1;

public class Institute {

	private int InstituteId;
	private String InstituteName;
	private int InstitudeAddress;
	
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
	public int getInstitudeAddress() {
		return InstitudeAddress;
	}
	public void setInstitudeAddress(int institudeAddress) {
		InstitudeAddress = institudeAddress;
	}
	@Override
	public String toString() {
		return "Institute [InstituteId=" + InstituteId + ", InstituteName=" + InstituteName + ", InstitudeAddress="
				+ InstitudeAddress + "]";
	}
	
	
}
