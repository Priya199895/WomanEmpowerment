package com.example.demo.entity;
import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Registered_Women")
public class Trainee implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="Trainee_GEN")
    @SequenceGenerator(name="Trainee_GEN",sequenceName="registered_women_seq",allocationSize=1)
	private int Women_Id;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="Training_Sector_Id")
	private Training_Sectors training_sectors;
	
	@Column(name="Name")
	private String Name;
	
	@Column(name="Dob")
	private java.sql.Date Dob;
	
	@Column(name="Marriagestatus")
	private String MarriageStatus;
	
	@Column(name="Noofchildren")
	private int NoOfChildren;
	
	@Column(name="Childage")
	private int ChildAge;
	
	@Column(name="Contactno")
	private Long ContactNo;
	
	@Column(name="Email")
	private String Email;
	
	@Column(name="Address")
	private String Address;
	
	@Column(name="Physicallychallenged")
	private String PhysicallyChallenged;
	
	@Column(name="Ageproof")
	private String AgeProof;
	
	@Column(name="Status")
	private String Status;

	public Trainee() {
		super();
	}

	
	public Trainee(int women_Id, Training_Sectors training_sectors, String name, Date dob, String marriageStatus,
			int noOfChildren, int childAge, Long contactNo, String email, String address, String physicallyChallenged,
			String ageProof, String status) {
		super();
		Women_Id = women_Id;
		this.training_sectors = training_sectors;
		Name = name;
		Dob = dob;
		MarriageStatus = marriageStatus;
		NoOfChildren = noOfChildren;
		ChildAge = childAge;
		ContactNo = contactNo;
		Email = email;
		Address = address;
		PhysicallyChallenged = physicallyChallenged;
		AgeProof = ageProof;
		Status = status;
	}


	public int getWomen_Id() {
		return Women_Id;
	}

	public void setWomen_Id(int women_Id) {
		Women_Id = women_Id;
	}

	public Training_Sectors getTraining_sectors() {
		return training_sectors;
	}

	public void setTraining_sectors(Training_Sectors training_sectors) {
		this.training_sectors = training_sectors;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	
	public java.sql.Date getDob() {
		return Dob;
	}


	public void setDob(java.sql.Date dob) {
		Dob = dob;
	}


	public String getMarriageStatus() {
		return MarriageStatus;
	}

	public void setMarriageStatus(String marriageStatus) {
		MarriageStatus = marriageStatus;
	}

	public int getNoOfChildren() {
		return NoOfChildren;
	}

	public void setNoOfChildren(int noOfChildren) {
		NoOfChildren = noOfChildren;
	}

	public int getChildAge() {
		return ChildAge;
	}

	public void setChildAge(int childAge) {
		ChildAge = childAge;
	}

	public Long getContactNo() {
		return ContactNo;
	}

	public void setContactNo(Long contactNo) {
		ContactNo = contactNo;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPhysicallyChallenged() {
		return PhysicallyChallenged;
	}

	public void setPhysicallyChallenged(String physicallyChallenged) {
		PhysicallyChallenged = physicallyChallenged;
	}

	public String getAgeProof() {
		return AgeProof;
	}

	public void setAgeProof(String ageProof) {
		AgeProof = ageProof;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}


	@Override
	public String toString() {
		return "Trainee [Women_Id=" + Women_Id + ", training_sectors=" + training_sectors + ", Name=" + Name + ", Dob="
				+ Dob + ", MarriageStatus=" + MarriageStatus + ", NoOfChildren=" + NoOfChildren + ", ChildAge="
				+ ChildAge + ", ContactNo=" + ContactNo + ", Email=" + Email + ", Address=" + Address
				+ ", PhysicallyChallenged=" + PhysicallyChallenged + ", AgeProof=" + AgeProof + ", Status=" + Status
				+ "]";
	}

	
	
	//create sequence registered_women_seq increment by 1 start with 14; 

}

