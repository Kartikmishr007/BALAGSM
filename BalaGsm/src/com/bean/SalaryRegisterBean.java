package com.bean;

public class SalaryRegisterBean {
	private String employeename;
	private String designation;
	private int month;
	private int year;
	private double basicda;
	private double hra;
	private double conveyance;
	private double Providentfund;
	private double esi;
	private double loan;
	private double professiontax;
	private double tsdit;
	
	
	public SalaryRegisterBean(String employeename, String designation, int month, int year, double basicda, double hra,
			double conveyance, double providentfund, double esi, double loan, double professiontax, double tsdit) {
		super();
		this.employeename = employeename;
		this.designation = designation;
		this.month = month;
		this.year = year;
		this.basicda = basicda;
		this.hra = hra;
		this.conveyance = conveyance;
		this.Providentfund = providentfund;
		this.esi = esi;
		this.loan = loan;
		this.professiontax = professiontax;
		this.tsdit = tsdit;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getBasicda() {
		return basicda;
	}
	public void setBasicda(double basicda) {
		this.basicda = basicda;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getConveyance() {
		return conveyance;
	}
	public void setConveyance(double conveyance) {
		this.conveyance = conveyance;
	}
	public double getProvidentfund() {
		return Providentfund;
	}
	public void setProvidentfund(double providentfund) {
		Providentfund = providentfund;
	}
	public double getEsi() {
		return esi;
	}
	public void setEsi(double esi) {
		this.esi = esi;
	}
	public double getLoan() {
		return loan;
	}
	public void setLoan(double loan) {
		this.loan = loan;
	}
	public double getProfessiontax() {
		return professiontax;
	}
	public void setProfessiontax(double professiontax) {
		this.professiontax = professiontax;
	}
	public double getTsdit() {
		return tsdit;
	}
	public void setTsdit(double tsdit) {
		this.tsdit = tsdit;
	}
	@Override
	public String toString() {
		return "SalaryRegisterBean [employeename=" + employeename + ", designation=" + designation + ", month=" + month
				+ ", year=" + year + ", basicda=" + basicda + ", hra=" + hra + ", conveyance=" + conveyance
				+ ", Providentfund=" + Providentfund + ", esi=" + esi + ", loan=" + loan + ", professiontax="
				+ professiontax + ", tsdit=" + tsdit + "]";
	}
	

}
