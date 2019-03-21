package net.codejava.spring.model;

import java.util.Date;

public class User {
	private String source;
	private String destination;
	private String email;
	private Date birthDate;
	private String trainnum;
	private String classcoach;
	private String passname;
	private String age;
	private String sex;
	private String berthpref;
	private String mobile;
	private String address;
	
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public String getTrainnum() {
		return trainnum;
	}

	public void setTrainnum(String trainnum) {
		this.trainnum = trainnum;
	}

	public String getClasscoach() {
		return classcoach;
	}

	public void setClasscoach(String classcoach) {
		this.classcoach = classcoach;
	}
	
	public String getPassname() {
		return passname;
	}

	public void setPassname(String passname) {
		this.passname = passname;
	}
	
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getBerthpref() {
		return berthpref;
	}

	public void setBerthpref(String berthpref) {
		this.berthpref = berthpref;
	}
	
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
