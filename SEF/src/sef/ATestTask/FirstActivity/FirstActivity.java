package sef.ATestTask.FirstActivity;

import java.util.Arrays;
public class FirstActivity {

	public static void main(String[] args) {

		// TODO 1 Create collection of employee (more than 5) list or map
		// System.out.println() result
		
		 //Employee array which will hold employees
		Employee employee[] = new Employee[3];

		employee[0] = new Employee();
		employee[0].setAge(34);
		employee[0].setFirstName("John");
		employee[0].setSecondName("Builder");
		

		employee[1] = new Employee();
		employee[1].setAge(66);
		employee[1].setFirstName("Janis");
		employee[1].setSecondName("Berzins");

		employee[2] = new Employee();
		employee[2].setAge(29);
		employee[2].setFirstName("Dave");
		employee[2].setSecondName("kronzo");
		

		System.out.println("Order of employees before sorting is: ");
		// print array as is.
		for (int i = 0; i < employee.length; i++) {
			System.out.println(
					"Employee " + (i + 1) + "  Name : " + employee[i].getFirstName() + " Surname: " + employee[i].getSecondName() + ", Age : " + employee[i].getAge());
		}

		// TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		// System.out.println() result

		// TODO 3 create instance of a Student as a Person ->
		// than ask him introduce()
		// than make them Student refference casting sample?
		// than ask him introduce()

		// TODO 4 Create method for full change of employee information
		// for example some employee change his work

	}

}
