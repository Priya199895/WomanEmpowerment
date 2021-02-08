package com.example.demo.entity;

import java.io.Serializable;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="NGOs")
public class Ngo {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="NGO_GEN")
    @SequenceGenerator(name="NGO_GEN",sequenceName="ngo_seq",allocationSize=1)
	private int NGO_Id;
	
	@Column(name="NGO_Name")
	private String NGO_Name;
	
	@Column(name="NGO_Email")	
	private String NGO_Email;
	
	@Column(name="NGO_CONTACTNO")
	private Long NGO_Contact;
	
	@Column(name="NGO_Location")
	private String NGO_Location;
	
	@Column(name="NGO_Status")
	private String NGO_Status;
	
	
	
	@OneToOne
	@JoinColumn(name="Training_Sector_Id")
	private Training_Sectors ts;
	
	public Ngo() {
		super();
	}

	
	


	public Ngo(int nGO_Id, String nGO_Name, String nGO_Email, Long nGO_Contact, String nGO_Location, String nGO_Status,
			Training_Sectors ts) {
		super();
		NGO_Id = nGO_Id;
		NGO_Name = nGO_Name;
		NGO_Email = nGO_Email;
		NGO_Contact = nGO_Contact;
		NGO_Location = nGO_Location;
		NGO_Status = nGO_Status;
		this.ts = ts;
	}


	public int getNGO_Id() {
		return NGO_Id;
	}

	public void setNGO_Id(int nGO_Id) {
		NGO_Id = nGO_Id;
	}

	public String getNGO_Name() {
		return NGO_Name;
	}

	public void setNGO_Name(String nGO_Name) {
		NGO_Name = nGO_Name;
	}

	public String getNGO_Email() {
		return NGO_Email;
	}

	public void setNGO_Email(String nGO_Email) {
		NGO_Email = nGO_Email;
	}

	public Long getNGO_Contact() {
		return NGO_Contact;
	}

	public void setNGO_Contact(Long nGO_Contact) {
		NGO_Contact = nGO_Contact;
	}

	public String getNGO_Location() {
		return NGO_Location;
	}

	public void setNGO_Location(String nGO_Location) {
		NGO_Location = nGO_Location;
	}

	public String getNGO_Status() {
		return NGO_Status;
	}

	public void setNGO_Status(String nGO_Status) {
		NGO_Status = nGO_Status;
	}

	
	

	public Training_Sectors getTs() {
		return ts;
	}





	public void setTs(Training_Sectors ts) {
		this.ts = ts;
	}





	@Override
	public String toString() {
		return "Ngo [NGO_Id=" + NGO_Id + ", NGO_Name=" + NGO_Name + ", NGO_Email=" + NGO_Email + ", NGO_Contact="
				+ NGO_Contact + ", NGO_Location=" + NGO_Location + ", NGO_Status=" + NGO_Status + ", ts=" + ts + "]";
	}





	
	/*
	 * @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	 * 
	 * @JoinTable(name="NGOs_Training_Sectors", joinColumns =
	 * {@JoinColumn(name="NGO_Id")}, inverseJoinColumns =
	 * {@JoinColumn(name="Training_Sector_Id")}) private List<Training_Sectors>
	 * Training_SectorsList;
	 */
	
	
	//create sequence ngo_seq increment by 1 start with 5556
	
	
}