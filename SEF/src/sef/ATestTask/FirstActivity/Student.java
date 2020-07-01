package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person
/* Student class is the sub class of Person class*/
public class Student extends Person {
	//Attributes
	private int grade;
	private String school;
	
	//Behavior - default constructor
		public Student(){ 
		System.out.println("I'm Student constructor"); 
		}
	// getter for int grade
		public int getGrade() {
			return grade;
		}
		
	// setter for int grade
		public void setGrade(int grade) {
			this.grade = grade;
		}
		
	// getter for String school
		public String getSchool() {
			return school;
		}
		
	// setter for String school
		public void setSchool(String school) {
			this.school = school;
		}
	//method for introduce person ->
		public String announce() {
			return "Hey! my name is  " + getFirstName() + " and i study in " + getSchool();
		}
			
}