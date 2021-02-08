package com.example.demo.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="Registered_User")
public class User {
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USER_GEN")
@SequenceGenerator(name="USER_GEN", sequenceName="user_seq", allocationSize =1)
//@Column(name="REGISTRATION_ID")
private int registration_id;
@Column(name="NAME")
private String name;
@Column(name="Username")
private String username;
@Column(name="DOB")
private Date dob;
@Column(name="CONTACTNUMBER")
private long phone;
@Column(name="Password")
private String password;
//@Column(name="ConfirmPassword")
//private int confirmPassword;

public User() {
	super();
	// TODO Auto-generated constructor stub
}

public int getRegistration_id() {
	return registration_id;
}

public void setRegistration_id(int registration_id) {
	this.registration_id = registration_id;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

//public int getConfirmPassword() {
//	return confirmPassword;
//}
//
//public void setConfirmPassword(int confirmPassword) {
//	this.confirmPassword = confirmPassword;
//}

public String getPassword() {
	return password;
}

public User(int registration_id, String name, String username, Date dob, long phone, String password) {
	super();
	this.registration_id = registration_id;
	this.name = name;
	this.username = username;
	this.dob = dob;
	this.phone = phone;
	this.password = password;
	//this.confirmPassword = confirmPassword;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public String getLoginid() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Rwoman [registration_id=" + registration_id + ", name=" + name + ", username=" + username + ", dob=" + dob
			+ ", phone=" + phone + ", password=" + password + "]";
}

}