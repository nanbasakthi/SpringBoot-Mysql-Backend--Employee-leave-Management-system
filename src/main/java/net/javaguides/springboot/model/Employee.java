package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "fullname")
	private String fullname;
	
	@Column(name = "leavedate")
	private String leavedate;
	
	@Column(name = "leavetype")
	private String leavetype;
	
	@Column(name = "reason")
	private String reason;
	
	public Employee() {
		
	}
	
	public Employee(String fullname, String leavedate, String leavetype, String reason) {
		super();
		this.fullname = fullname;
		this.leavedate = leavedate;
		this.leavetype = leavetype;
		this.reason = reason;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getLeavedate() {
		return leavedate;
	}
	public void setLeavedate(String leavedate) {
		this.leavedate = leavedate;
	}
	public String getLeavetype() {
		return leavetype;
	}
	public void setLeavetype(String leavetype) {
		this.leavetype = leavetype;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	
	
	
	

}
