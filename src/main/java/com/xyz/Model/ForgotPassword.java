package com.xyz.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class ForgotPassword {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int  forgotPassword_id;
	private String forgotPassword_question1;
	private String forgotPassword_question2;
	private String forgotPassword_question3;
	private String forgotPassword_answer1;
	private String forgotPassword_answer2;
	private String forgotPassword_answer3;
	private String forgotPassword_oldPassword;
	private String forgotPassword_newPassword;
	@OneToOne(cascade=CascadeType.ALL)
	private UserDetails userDetails;
	public int getForgotPassword_id() {
		return forgotPassword_id;
	}
	public void setForgotPassword_id(int forgotPassword_id) {
		this.forgotPassword_id = forgotPassword_id;
	}
	public String getForgotPassword_question1() {
		return forgotPassword_question1;
	}
	public void setForgotPassword_question1(String forgotPassword_question1) {
		this.forgotPassword_question1 = forgotPassword_question1;
	}
	public String getForgotPassword_question2() {
		return forgotPassword_question2;
	}
	public void setForgotPassword_question2(String forgotPassword_question2) {
		this.forgotPassword_question2 = forgotPassword_question2;
	}
	public String getForgotPassword_question3() {
		return forgotPassword_question3;
	}
	public void setForgotPassword_question3(String forgotPassword_question3) {
		this.forgotPassword_question3 = forgotPassword_question3;
	}
	public String getForgotPassword_answer1() {
		return forgotPassword_answer1;
	}
	public void setForgotPassword_answer1(String forgotPassword_answer1) {
		this.forgotPassword_answer1 = forgotPassword_answer1;
	}
	public String getForgotPassword_answer2() {
		return forgotPassword_answer2;
	}
	public void setForgotPassword_answer2(String forgotPassword_answer2) {
		this.forgotPassword_answer2 = forgotPassword_answer2;
	}
	public String getForgotPassword_answer3() {
		return forgotPassword_answer3;
	}
	public void setForgotPassword_answer3(String forgotPassword_answer3) {
		this.forgotPassword_answer3 = forgotPassword_answer3;
	}
	public String getForgotPassword_oldPassword() {
		return forgotPassword_oldPassword;
	}
	public void setForgotPassword_oldPassword(String forgotPassword_oldPassword) {
		this.forgotPassword_oldPassword = forgotPassword_oldPassword;
	}
	public String getForgotPassword_newPassword() {
		return forgotPassword_newPassword;
	}
	public void setForgotPassword_newPassword(String forgotPassword_newPassword) {
		this.forgotPassword_newPassword = forgotPassword_newPassword;
	}
	public UserDetails getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}
	@Override
	public String toString() {
		return "ForgotPassword [forgotPassword_id=" + forgotPassword_id + ", forgotPassword_question1="
				+ forgotPassword_question1 + ", forgotPassword_question2=" + forgotPassword_question2
				+ ", forgotPassword_question3=" + forgotPassword_question3 + ", forgotPassword_answer1="
				+ forgotPassword_answer1 + ", forgotPassword_answer2=" + forgotPassword_answer2
				+ ", forgotPassword_answer3=" + forgotPassword_answer3 + ", forgotPassword_oldPassword="
				+ forgotPassword_oldPassword + ", forgotPassword_newPassword=" + forgotPassword_newPassword
				+ ", userDetails=" + userDetails + "]";
	}
	
}
