package sef.ATestTask.ThirdActivity.java;
//Needs to be completed

//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.
//9.1 create try-catch blocks
//9.2 handle the exceptions

public class ThirdActivity {
	public static void main(String[] args) {
		ThirdActivity ta = new ThirdActivity();
		// TODO handle exception on proper way
//		ta.validateUser("Ivan");
		ta.catchExeption();
		ta.catchMe(10, 0);
	}


	public void catchExeption() {
		try {
			int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

			for (int i = 0; i <= 10; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Ten or more is Out of array");
		} finally {
			System.out.println("This should get printed even if there is an exception");
		}
	}

//	public void validateUser(String name) {
//        String[] validUsers = {"John", "Mike", "Missi", "Peacy"};
//        boolean flag = false;
//        //TODO if name in a list -> set flag=true
//        // if at the end flag=0 -> throw the exeption
//        for (int i = 0; i < 4; i++) {
//  		 if (ta.validateUser("Ivan")) {
//  			 (flag ==0);
//        	throw new CustomExceptionActivity() {
//        	System.out.println("not a valid user");
//        } else (flag = 1) {
//        	System.out.println("Welcome to Payroll program");
//        }
        		

	public void catchMe(int num1, int num2) {
		try {
			int result = num1 / num2;
			System.out.println("The result is :" + result);
		} catch (ArithmeticException e) {
			System.out.println("You Shouldn't divide a number by zero");

		} finally {
			System.out.println("Thank you for using this program.");
		}
	}
}
