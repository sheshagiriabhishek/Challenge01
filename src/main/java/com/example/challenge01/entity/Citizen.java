package com.example.challenge01.entity;

//import java.util.Date;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import org.hibernate.annotations.*;

@Entity
@Table(name = "Citizens")
public class Citizen {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "name")
	private String name;
	
//	@CreationTimeStamp
//	Date createdAt;
//	@CreationTimestamp
//	Date updatedAt;
	
	public long getId() {
		return id;
	}
	public Citizen() {
//		super();
		// TODO Auto-generated constructor stub
	}
	public Citizen(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
