package com.xyz.Model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Friends  {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int FriendsId;
	private int dr_id;
	private int student_id;
	public int getFriendsId() {
		return FriendsId;
	}
	public void setFriendsId(int friendsId) {
		FriendsId = friendsId;
	}
	public int getDr_id() {
		return dr_id;
	}
	public void setDr_id(int dr_id) {
		this.dr_id = dr_id;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	@Override
	public String toString() {
		return "Friends [FriendsId=" + FriendsId + ", dr_id=" + dr_id + ", student_id=" + student_id + "]";
	}
	
}
