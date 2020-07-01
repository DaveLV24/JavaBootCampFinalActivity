package sef.ATestTask.FirstActivity;

public class FirstActivity {

	public static void main(String[] args) {

		// TODO 1 Create collection of employee (more than 5) list or map
		// System.out.println() result

		// Employee array which will hold employees
		Employee employee[] = new Employee[5];

		employee[0] = new Employee();
		employee[0].setAge(34);
		employee[0].setFirstName("John");
		employee[0].setSecondName("Builder");
		employee[0].setSalary(444);
		employee[0].setJobTitle("Asistent");

		employee[1] = new Employee();
		employee[1].setAge(66);
		employee[1].setFirstName("Janis");
		employee[1].setSecondName("Berzins");
		employee[1].setSalary(600);
		employee[1].setJobTitle("Director");

		employee[2] = new Employee();
		employee[2].setAge(29);
		employee[2].setFirstName("Dave");
		employee[2].setSecondName("Kronzo");
		employee[2].setSalary(1337);
		employee[2].setJobTitle("QA");

		employee[3] = new Employee();
		employee[3].setAge(19);
		employee[3].setFirstName("Little");
		employee[3].setSecondName("Jimmy");
		employee[3].setSalary(100);
		employee[3].setJobTitle("Medic");

		employee[4] = new Employee();
		employee[4].setAge(66);
		employee[4].setFirstName("Liga");
		employee[4].setSecondName("Berzina");
		employee[4].setSalary(200);
		employee[4].setJobTitle("Joker");

		// prints array as it is
		System.out.println("Order of employees before sorting is: ");

		for (int i = 0; i < employee.length; i++) {
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("Employee " + (i + 1) + "  FullName: " + employee[i].getFirstName() + " "
					+ employee[i].getSecondName() + ",  Age: " + employee[i].getAge() + ",  Salary = "
					+ employee[i].getSalary() + ", Title: " + employee[i].getJobTitle());
		}

		// TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		// System.out.println() result

		// TODO 3 create instance of a Student as a Person ->
		// than ask him introduce()
		// than make them Student reference casting sample?
		// than ask him introduce()
		// student as person
		Student s = new Student();
		s.setFirstName("Sara");
		s.setAge(20);
		s.setSchool("1st Gymnasium");
		s.setGrade(9);

		System.out.println("-----------------------------------------");
		System.out.println("Student's FirstName is   : " + s.getFirstName());
		System.out.println("Student's Age is    : " + s.getAge());
		System.out.println("Student's Grade is  : " + s.getGrade());
		System.out.println("Student's School is : " + s.getSchool());
		// introduce
		System.out.println(s.announce());

	}

	// TODO 4 Create method for full change of employee information
	// for example some employee change his work

}
