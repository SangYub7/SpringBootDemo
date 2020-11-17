package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user")
@Getter
@Setter
public class User  implements Serializable{

	@Id
	@Column(length = 50)
    private String id;

	@Column(length = 50)
	private String password;
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User()
	{	
	}
	
	public User(String id, String password)
	{
		this.id = id;
		this.password = password;
	}

    @Override
    public String toString() {
        return String.format("User[id='%d']", id);
    }

}