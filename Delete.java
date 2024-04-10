package com.Jbk.DeleteApi.Entity;

import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Delete {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int id;
	String Name;
	String Mobile;
	
	public Delete() {
		
		
	}

	public Delete(int id, String name, String mobile) {
		super();
		this.id = id;
		Name = name;
		Mobile = mobile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	@Override
	public String toString() {
		return "Delete [id=" + id + ", Name=" + Name + ", Mobile=" + Mobile + "]";
	}
	
}
