package com.market.model;

import java.io.Serializable;

public class Branches implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3312083750385980965L;

	private String branchName;
	private int branchId;
	private String location;
	
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public int getBrancheId() {
		return branchId;
	}
	public void setBrancheId(int branchId) {
		this.branchId = branchId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Branches [brancheName=" + branchName + ", brancheId=" + branchId + ", location=" + location + "]";
	}
	
	
	
}
