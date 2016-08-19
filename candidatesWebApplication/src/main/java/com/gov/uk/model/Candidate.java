package com.gov.uk.model;

public class Candidate {

	private int cId;
	private String fName;
	private String lName;
	private String currentRole;
	private String mobile;
	private String email;
	private String github;
	private String workDescription;
	private String educationDescription;	

	public Candidate(int cId, String fName,String lName, String currentRole, String mobile, String email, String github,String educationDescription,String workDescription) {
		super();
		this.cId = cId;
		this.fName = fName;
		this.lName = lName;
		this.currentRole = currentRole;
		this.mobile = mobile;
		this.email = email;
		this.github = github;
		this.workDescription = workDescription;
		this.educationDescription = educationDescription;	
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getCurrentRole() {
		return currentRole;
	}

	public void setCurrentRole(String currentRole) {
		this.currentRole = currentRole;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGithub() {
		return github;
	}

	public void setGithub(String github) {
		this.github = github;
	}

	public String getWorkDescription() {
		return workDescription;
	}

	public void setWorkDescription(String workDescription) {
		this.workDescription = workDescription;
	}

	public String getEducationDescription() {
		return educationDescription;
	}

	public void setEducationDescription(String educationDescription) {
		this.educationDescription = educationDescription;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cId;
		return result;
	}
   
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidate other = (Candidate) obj;
		if (cId != other.cId)
			return false;
		return true;
	}	
}
