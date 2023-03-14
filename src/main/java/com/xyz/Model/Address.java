package com.xyz.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int aId;
	private String country;
	private String state;
	private String district;
	private String city;
	private String area;
	private String villegeName;
	private int pin;
	private String landmark;
	private String roadName;
	private String housNoName;
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getVillegeName() {
		return villegeName;
	}
	public void setVillegeName(String villegeName) {
		this.villegeName = villegeName;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getRoadName() {
		return roadName;
	}
	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}
	public String getHousNoName() {
		return housNoName;
	}
	public void setHousNoName(String housNoName) {
		this.housNoName = housNoName;
	}
	@Override
	public String toString() {
		return "Address [aId=" + aId + ", country=" + country + ", state=" + state + ", district=" + district
				+ ", city=" + city + ", area=" + area + ", villegeName=" + villegeName + ", pin=" + pin + ", landmark="
				+ landmark + ", roadName=" + roadName + ", housNoName=" + housNoName + "]";
	}
	
}
