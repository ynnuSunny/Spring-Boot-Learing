package com.springmvc.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //database er entiry class bujhanor jonno
public class Programmer {
	@Id //primary key bujhar jonno
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//Auto methic id generaed howar jonn
	//GenerationType = Auto dile automatic hobe ami menualy set korete parob na
	// GenerationType = IDENTITY dile auto + ami nije menualy o set korte parbo
	public int pId;
	
	//databse e column er name set kora jonno
	@Column(name="programmer_name")
	public String pName;
	public String pLang;
	
	
	
	public Programmer() {
		super();
	}
	public Programmer(int pId, String pName, String pLang) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pLang = pLang;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpLang() {
		return pLang;
	}
	public void setpLang(String pLang) {
		this.pLang = pLang;
	}
	

}
