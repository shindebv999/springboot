package com.rt.LoanEntity;

public class HomeLoanEntity {
 private int emp_id;
 private float income;
 private int age;
 private long loanAmount;
 private String EmpStatus;
 private int workExperiance;
 private String ResidentType;
 private String propertyType;
 
 public HomeLoanEntity(){}
 
public HomeLoanEntity(int emp_id,float income, int age, long loanAmount, String empStatus, int workExperiance, String residentType,
		String propertyType) {
	super();
	this.emp_id=emp_id;
	this.income = income;
	this.age = age;
	this.loanAmount = loanAmount;
	EmpStatus = empStatus;
	this.workExperiance = workExperiance;
	ResidentType = residentType;
	this.propertyType = propertyType;
}

public int getEmp_id() {
	return emp_id;
}

public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}

public float getIncome() {
	return income;
}

public void setIncome(float income) {
	this.income = income;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public long getLoanAmount() {
	return loanAmount;
}

public void setLoanAmount(long loanAmount) {
	this.loanAmount = loanAmount;
}

public String getEmpStatus() {
	return EmpStatus;
}

public void setEmpStatus(String empStatus) {
	EmpStatus = empStatus;
}

public int getWorkExperiance() {
	return workExperiance;
}

public void setWorkExperiance(int workExperiance) {
	this.workExperiance = workExperiance;
}

public String getResidentType() {
	return ResidentType;
}

public void setResidentType(String residentType) {
	ResidentType = residentType;
}

public String getPropertyType() {
	return propertyType;
}

public void setPropertyType(String propertyType) {
	this.propertyType = propertyType;
}
 
 
 
}
