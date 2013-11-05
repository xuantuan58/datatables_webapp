package model;

import java.util.Date;

import net.datatables.wrapper.annotation.AoColumn;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class StudentAccount {
	
	@AoColumn(sTitle="ID")
	private int studentId;
	
	@AoColumn(sTitle="Name")
	private String username;
	
	@JsonIgnore
	private String password;
	
	@AoColumn(sTitle="Create Date")
	private Date createDate;
	
	@AoColumn(sTitle="Activate Date")
	private Date activateDate;
	
	
	
	
	public StudentAccount(int studentId, String username, String password,
			Date createDate, Date activateDate) {
		this.studentId = studentId;
		this.username = username;
		this.password = password;
		this.createDate = createDate;
		this.activateDate = activateDate;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
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
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getActivateDate() {
		return activateDate;
	}
	public void setActivateDate(Date activateDate) {
		this.activateDate = activateDate;
	}
	
	
}
