package homework3;

import java.util.Scanner;

public class salary {

	public static void main(String[] args) {
		
		Scanner calculator= new Scanner(System.in);
		System.out.println("Enter the name of the employee");
		String employeeName = calculator.nextLine();
		System.out.println("Enter the gross salary");
		double grossSalary = calculator.nextDouble();
		
		
		double stateTaxes = 0.284 * grossSalary;
		double personalTax = 0;
		if(grossSalary - stateTaxes - 7000 > 0) {
			personalTax = 0.10 * (grossSalary - stateTaxes - 7000);
		}
		double netSalary = grossSalary - stateTaxes - personalTax;
		
		stateTaxes = Math.round(stateTaxes);
		personalTax = Math.round(personalTax);
		netSalary = Math.round(netSalary);
		
		System.out.println("Employee Name: " + employeeName);
        System.out.println("State Taxes: " + stateTaxes);
        System.out.println("Personal Tax: " + personalTax);
        System.out.println("Net Salary: " + netSalary);
	  
			
		

	}

}
