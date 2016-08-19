package com.gov.uk.model;

public class Job {

	private int jId;
	private String jName;
	
	public Job(int jId, String jName) {
		super();
		this.jId = jId;
		this.jName = jName;
	}
	public int getjId() {
		return jId;
	}
	public void setjId(int jId) {
		this.jId = jId;
	}
	public String getjName() {
		return jName;
	}
	public void setjName(String jName) {
		this.jName = jName;
	}	
}
