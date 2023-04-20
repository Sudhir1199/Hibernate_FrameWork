package org.MyFirst.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // its indicates that its related to database table
@Table(name = "users") // table name in database
public class Users {

	@Id // it specifies userID as primary key
	@Column(name = "user_id") // its optional but its good practice to prevent from confusion between columns
								// and property
	int userId;
	@Column(name = "username")
	String username;
	@Column(name = "password")
	String password;
	@Column(name = "first_name")
	String firstName;
	@Column(name = "last_name")
	String lastName;
	
	//POJO architecure
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Users(String username, String password, String firstName, String lastName) {
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	

}
