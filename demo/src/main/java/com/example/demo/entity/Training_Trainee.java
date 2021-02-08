package com.example.demo.entity;

import java.sql.Date;

public class Training_Trainee {
int training_id;
static String status = "no";
String address;
String marriageStatus;
String physicallyChallenged;
Date dob;
int noOfChildren;
int childAge;
String ageProof;
String email;
long contactNo;
String name;
@Override
public String toString() {
	return "Training_Trainee [training_id=" + training_id + ", address=" + address + ", marriageStatus="
			+ marriageStatus + ", physicallyChallenged=" + physicallyChallenged + ", dob=" + dob + ", noOfChildren="
			+ noOfChildren + ", childAge=" + childAge + ", ageProof=" + ageProof + ", email=" + email + ", contactNo="
			+ contactNo + ", name=" + name + "]";
}
public Training_Trainee(int training_id, String address, String marriageStatus, String physicallyChallenged, Date dob,
		int noOfChildren, int childAge, String ageProof, String email, long contactNo, String name) {
	super();
	this.training_id = training_id;
	this.address = address;
	this.marriageStatus = marriageStatus;
	this.physicallyChallenged = physicallyChallenged;
	this.dob = dob;
	this.noOfChildren = noOfChildren;
	this.childAge = childAge;
	this.ageProof = ageProof;
	this.email = email;
	this.contactNo = contactNo;
	this.name = name;
}
public Training_Trainee() {
	super();
	// TODO Auto-generated constructor stub
}
public int getTraining_id() {
	return training_id;
}
public void setTraining_id(int training_id) {
	this.training_id = training_id;
}
public static String getStatus() {
	return status;
}
public static void setStatus(String status) {
	Training_Trainee.status = status;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getMarriageStatus() {
	return marriageStatus;
}
public void setMarriageStatus(String marriageStatus) {
	this.marriageStatus = marriageStatus;
}
public String getPhysicallyChallenged() {
	return physicallyChallenged;
}
public void setPhysicallyChallenged(String physicallyChallenged) {
	this.physicallyChallenged = physicallyChallenged;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public int getNoOfChildren() {
	return noOfChildren;
}
public void setNoOfChildren(int noOfChildren) {
	this.noOfChildren = noOfChildren;
}
public int getChildAge() {
	return childAge;
}
public void setChildAge(int childAge) {
	this.childAge = childAge;
}
public String getAgeProof() {
	return ageProof;
}
public void setAgeProof(String ageProof) {
	this.ageProof = ageProof;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getContactNo() {
	return contactNo;
}
public void setContactNo(long contactNo) {
	this.contactNo = contactNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
