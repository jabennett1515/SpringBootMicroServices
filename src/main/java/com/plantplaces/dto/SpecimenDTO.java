package com.plantplaces.dto;

public class SpecimenDTO {

	private int specimenID;
	private String latitude;
	private String longititude;
	private String description;
	public int getSpecimenID() {
		return specimenID;
	}
	public void setSpecimenID(int specimenID) {
		this.specimenID = specimenID;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongititude() {
		return longititude;
	}
	public void setLongititude(String longititude) {
		this.longititude = longititude;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return specimenID + " " + latitude + " " + longititude + " " + description;
	}
}
