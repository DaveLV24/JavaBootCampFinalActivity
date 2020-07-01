package sef.ATestTask.FirstActivity;

import java.util.Comparator;

// this class is sub class of Person class
public class Employee extends Person implements Comparator<Employee> {

	//Attributes
    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee(){
//    	System.out.println("I'm Employee constructor");
    }

    //TODO 2 add getters and setters
    
//getter int empId
    public int getEmpId() {
    	return empId;
    }
//setter int empId;
    public void setEmpId() {
    	this.empId = empId;
    }
//getter String jobTitle
    public String getJobTitle(){
    	return jobTitle;
    }
//setter String jobTitle
    public void setJobTitle(String jobTitle) {
    	this.jobTitle = jobTitle;
    }
//getter String companyName
    public String getCompanyName() {
    	return companyName;
    }
 //setter String companyName
    public void setCompanyname(String companyName) {
    	this.companyName = companyName;
    }
 //getter double salary
    public double getSalary() {
    	return salary;
    }
  //setter double salary
    public void setSalary(double salary) {
    	this.salary = salary;
    }
    //TODO 3 override method announce()
	public void announce(){
		super.announce();  // calls announce() method of Person class
		System.out.println("My name is " + getFirstName() + " and i am " + getAge() + " years old " +
				   " I work as "+  getJobTitle() + " in " + getCompanyName());
	}
	//@Override


}