package com.example.demo.entity;


import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Training_Sectors")
public class Training_Sectors {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="Training_Sectors_GEN")
    @SequenceGenerator(name="Training_Sectors_GEN",sequenceName="training_sectors_seq",allocationSize=1)
	private int Training_Sector_Id;
	
	@Column(name="Training_Sector_Name")
	private String Training_Sector_Name;
	
	@Column(name="Training_Sector_Courseduration")
	private int Training_Sector_CourseDuration;
	
	@Column(name="Training_Sector_Startdate")
	private java.sql.Date Training_Sector_StartDate;
	
	@Column(name="Training_Sector_Capacity")
	private int Training_Sector_Capacity;

    
	public Training_Sectors() {
		super();
	}

	

	

	public Training_Sectors(int training_Sector_Id, String training_Sector_Name, int training_Sector_CourseDuration,
			Date training_Sector_StartDate, int training_Sector_Capacity) {
		super();
		Training_Sector_Id = training_Sector_Id;
		Training_Sector_Name = training_Sector_Name;
		Training_Sector_CourseDuration = training_Sector_CourseDuration;
		Training_Sector_StartDate = training_Sector_StartDate;
		Training_Sector_Capacity = training_Sector_Capacity;
	}





	public int getTraining_Sector_Id() {
		return Training_Sector_Id;
	}

	public void setTraining_Sector_Id(int training_Sector_Id) {
		Training_Sector_Id = training_Sector_Id;
	}

	public String getTraining_Sector_Name() {
		return Training_Sector_Name;
	}

	public void setTraining_Sector_Name(String training_Sector_Name) {
		Training_Sector_Name = training_Sector_Name;
	}

	public int getTraining_Sector_CourseDuration() {
		return Training_Sector_CourseDuration;
	}

	public void setTraining_Sector_CourseDuration(int training_Sector_CourseDuration) {
		Training_Sector_CourseDuration = training_Sector_CourseDuration;
	}

	
	public java.sql.Date getTraining_Sector_StartDate() {
		return Training_Sector_StartDate;
	}





	public void setTraining_Sector_StartDate(java.sql.Date training_Sector_StartDate) {
		Training_Sector_StartDate = training_Sector_StartDate;
	}





	public int getTraining_Sector_Capacity() {
		return Training_Sector_Capacity;
	}

	public void setTraining_Sector_Capacity(int training_Sector_Capacity) {
		Training_Sector_Capacity = training_Sector_Capacity;
	}





	@Override
	public String toString() {
		return "Training_Sectors [Training_Sector_Id=" + Training_Sector_Id + ", Training_Sector_Name="
				+ Training_Sector_Name + ", Training_Sector_CourseDuration=" + Training_Sector_CourseDuration
				+ ", Training_Sector_StartDate=" + Training_Sector_StartDate + ", Training_Sector_Capacity="
				+ Training_Sector_Capacity + "]";
	}


//create sequence training_sectors_seq increment by 1 start with 
}


