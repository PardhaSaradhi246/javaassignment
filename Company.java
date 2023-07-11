package com.pardha.model;

public class Company 
{
	private String companyNAme;
	private String location;
	Department[] departments;
	public Company()
	{
		super();
	}
	
	public Company(String companyNAme, String location, Department[] departments)
	{
		super();
		this.companyNAme = companyNAme;
		this.location = location;
		this.departments = departments;
	}
	public String getCompanyNAme()
	{
		return companyNAme;
	}
	public void setCompanyNAme(String companyNAme) 
	{
		this.companyNAme = companyNAme;
	}
	public String getLocation() 
	{
		return location;
	}
	public void setLocation(String location)
	{
		this.location = location;
	}
	public Department[] getDepartments() 
	{
		return departments;
	}
	public void setDepartments(Department[] departments) 
	{
		this.departments = departments;
	}
	

}
