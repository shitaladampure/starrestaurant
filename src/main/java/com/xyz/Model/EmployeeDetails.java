package com.xyz.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class EmployeeDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int employee_id;
	private String employee_firstName;
	private String employee_lastName;
	private String employee_mailId;
	private String employee_contact;
	private String employee_address;
	@OneToOne(cascade=CascadeType.ALL)
	private Login login;
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_firstName() {
		return employee_firstName;
	}
	public void setEmployee_firstName(String employee_firstName) {
		this.employee_firstName = employee_firstName;
	}
	public String getEmployee_lastName() {
		return employee_lastName;
	}
	public void setEmployee_lastName(String employee_lastName) {
		this.employee_lastName = employee_lastName;
	}
	public String getEmployee_mailId() {
		return employee_mailId;
	}
	public void setEmployee_mailId(String employee_mailId) {
		this.employee_mailId = employee_mailId;
	}
	public String getEmployee_contact() {
		return employee_contact;
	}
	public void setEmployee_contact(String employee_contact) {
		this.employee_contact = employee_contact;
	}
	public String getEmployee_address() {
		return employee_address;
	}
	public void setEmployee_address(String employee_address) {
		this.employee_address = employee_address;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [employee_id=" + employee_id + ", employee_firstName=" + employee_firstName
				+ ", employee_lastName=" + employee_lastName + ", employee_mailId=" + employee_mailId
				+ ", employee_contact=" + employee_contact + ", employee_address=" + employee_address + ", login="
				+ login + "]";
	}
	
}
