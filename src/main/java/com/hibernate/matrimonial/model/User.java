package com.hibernate.matrimonial.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_tbl")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name = "User_id")
	private int uid;
	@Column(name = "User_name")
	private String uname;
	@Column(name = "AccountType")
	private String actype;
	@Column(name = "Payment_Plan")
	private String payment;
     @Column(name = "Age")
     private int age;
     @Column(name = "Profession")
     private String job;
     @Column(name = "Salary")
     private String sal;
     @Column(name = "Address")
     private String addr;
     @Column(name = "Religion")
     private String religion;
     @Column(name = "Maritial Status")
     private String sts;
     
     
     
     
     
     
     
 
	@ManyToOne(targetEntity = Matchmaker.class )
	@JoinColumn(name = "Match_Maker_id")
	private Matchmaker matchmaker;








	public User() {
		super();
		// TODO Auto-generated constructor stub
	}








	public User(int uid, String uname, String actype, String payment, int age, String job, String sal, String addr,
			String religion, String sts, Matchmaker matchmaker) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.actype = actype;
		this.payment = payment;
		this.age = age;
		this.job = job;
		this.sal = sal;
		this.addr = addr;
		this.religion = religion;
		this.sts = sts;
		this.matchmaker = matchmaker;
	}








	public int getUid() {
		return uid;
	}








	public void setUid(int uid) {
		this.uid = uid;
	}








	public String getUname() {
		return uname;
	}








	public void setUname(String uname) {
		this.uname = uname;
	}








	public String getActype() {
		return actype;
	}








	public void setActype(String actype) {
		this.actype = actype;
	}








	public String getPayment() {
		return payment;
	}








	public void setPayment(String payment) {
		this.payment = payment;
	}








	public int getAge() {
		return age;
	}








	public void setAge(int age) {
		this.age = age;
	}








	public String getJob() {
		return job;
	}








	public void setJob(String job) {
		this.job = job;
	}








	public String getSal() {
		return sal;
	}








	public void setSal(String sal) {
		this.sal = sal;
	}








	public String getAddr() {
		return addr;
	}








	public void setAddr(String addr) {
		this.addr = addr;
	}








	public String getReligion() {
		return religion;
	}








	public void setReligion(String religion) {
		this.religion = religion;
	}








	public String getSts() {
		return sts;
	}








	public void setSts(String sts) {
		this.sts = sts;
	}








	public Matchmaker getMatchmaker() {
		return matchmaker;
	}








	public void setMatchmaker(Matchmaker matchmaker) {
		this.matchmaker = matchmaker;
	}








	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", actype=" + actype + ", payment=" + payment + ", age=" + age
				+ ", job=" + job + ", sal=" + sal + ", addr=" + addr + ", religion=" + religion + ", sts=" + sts
				+ ", matchmaker=" + matchmaker + "]";
	}
	
	
}
