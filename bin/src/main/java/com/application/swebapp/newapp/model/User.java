package com.application.swebapp.newapp.model;

public class User {
	private String fname;
    private String lname;
    private String addr;
    private String gender;
    private String Country;
    private String County;
    private String email;
    private String pswd;
    public String getFname() {
		return fname;
	}
    public void setFname(String fname) {
		this.fname = fname;
	}
    public String getLname() {
		return lname;
	}
    public void setLname(String lname) {
		this.lname = lname;
	}
    public String getAddr() {
		return addr;
	}
    public void setAddr(String addr) {
		this.addr = addr;
	}
    public String getGender() {
		return gender;
	}
    public void setGender(String gender) {
		this.gender = gender;
	}
    public String getCountry() {
		return Country;
	}
    public String getCounty() {
		return County;
	}
    public void setCountry(String country) {
		Country = country;
	}
    public void setCounty(String county) {
		County = county;
	}
    public String getEmail() {
		return email;
	}
    public void setEmail(String email) {
		this.email = email;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
}
