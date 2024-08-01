package com.hibernate.matrimonial.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MatchMaker_tbl")
public class Matchmaker {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MatchMaker_id")
	private int mid;
	@Column(name = "MatchMaker_Name")
	private String mname;
	@Column(name = "MatchMaker_contact")
	private String mnum;
	@Column(name = "MatchMaker_Address")
	private String maddr;
	public Matchmaker() {
		super();
		
	}
	public Matchmaker(int mid, String mname, String mnum, String maddr) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.mnum = mnum;
		this.maddr = maddr;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMnum() {
		return mnum;
	}
	public void setMnum(String mnum) {
		this.mnum = mnum;
	}
	public String getMaddr() {
		return maddr;
	}
	public void setMaddr(String maddr) {
		this.maddr = maddr;
	}
	@Override
	public String toString() {
		return "Matchmaker [mid=" + mid + ", mname=" + mname + ", mnum=" + mnum + ", maddr=" + maddr + "]";
	}
	
	
	
}
