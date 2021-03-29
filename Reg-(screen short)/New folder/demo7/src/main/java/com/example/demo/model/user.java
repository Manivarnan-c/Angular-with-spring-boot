package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name = "students")
public class user {
@Id 
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
private String email;
private String username;
private String password;
public user() {}
public user(int id, String email, String username, String password) {
	super();
	this.id = id;
	this.email = email;
	this.username = username;
	this.password = password;
}
public long getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUsername() {
	return username;
}
public void setUsernames(String username) {
	this.username= username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}


