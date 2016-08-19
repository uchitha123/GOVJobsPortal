package com.gov.uk.model;

public class WorkExperience {	
	 private int wId;
	 private String stratDate;
	 private String endDate;
	 private String role;
	 private String company;
	 private String Description;
	 
	 public WorkExperience(int wId, String stratDate, String endDate, String role, String company, String description) {
	  super();
	  this.wId = wId;
	  this.stratDate = stratDate;
	  this.endDate = endDate;
	  this.role = role;
	  this.company = company;
	  Description = description;
	 }
	 
	 public int getwId() {
	  return wId;
	 }
	 public void setwId(int wId) {
	  this.wId = wId;
	 }
	 public String getStratDate() {
	  return stratDate;
	 }
	 public void setStratDate(String stratDate) {
	  this.stratDate = stratDate;
	 }
	 public String getEndDate() {
	  return endDate;
	 }
	 public void setEndDate(String endDate) {
	  this.endDate = endDate;
	 }
	 public String getRole() {
	  return role;
	 }
	 public void setRole(String role) {
	  this.role = role;
	 }
	 public String getCompany() {
	  return company;
	 }
	 public void setCompany(String company) {
	  this.company = company;
	 }
	 public String getDescription() {
	  return Description;
	 }
	 public void setDescription(String description) {
	  Description = description;
	 }
}
