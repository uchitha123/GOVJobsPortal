package com.gov.uk.model;

public class Education {
	private int EId;
	private String courseName;
	private String courseStartDate;
	private String courseEndDate;
	private String certifiyAuthority;
	
	public Education(int EId, String courseName, String courseStartDate, String courseEndDate, String certifiyAuthority) {
		super();
		this.EId = EId;
		this.courseName = courseName;
		this.courseStartDate = courseStartDate;
		this.courseEndDate = courseEndDate;
		this.certifiyAuthority = certifiyAuthority;
	}
	
	public int getcId() {
		return EId;
	}
	public void setcId(int EId) {
		this.EId = EId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseStartDate() {
		return courseStartDate;
	}

	public void setCourseStartDate(String courseStartDate) {
		this.courseStartDate = courseStartDate;
	}

	public String getCourseEndDate() {
		return courseEndDate;
	}

	public void setCourseEndDate(String courseEndDate) {
		this.courseEndDate = courseEndDate;
	}

	public String getCertifiyAuthority() {
		return certifiyAuthority;
	}
	public void setCertifiyAuthority(String certifiyAuthority) {
		this.certifiyAuthority = certifiyAuthority;
	}
}
