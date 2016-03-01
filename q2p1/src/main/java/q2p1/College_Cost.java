package q2p1;

import java.util.Scanner;

public class College_Cost {
	public static void main(String arg[]){
		Student person = new Student();
	
		Scanner user_input = new Scanner(System.in);
		
		//Get Student values
		System.out.print("Enter your yearly tution: ");
		Double tuition = user_input.nextDouble();
		person.setTuition(tuition);
		
		System.out.print("Enter your apr as a percentage (without %): ");
		Double apr = user_input.nextDouble();
		person.setApr(apr);
		
		System.out.print("Enter your time to pay off the loan: ");
		Double time_to_pay = user_input.nextDouble();
		person.setTime_to_pay(time_to_pay);
		
		System.out.print("Enter your percent increase in tuition per year as a decimal: ");
		Double perc_increase = user_input.nextDouble();
		person.setPerc_increase(perc_increase);
		
		System.out.print("Enter your total years in school. Round to nearest whole number: ");
		int years_in_school = user_input.nextInt();
		person.setYears_in_school(years_in_school);		
		
		user_input.close();
		
		calculate_cost(person);
	}
	public static void calculate_cost(Student person){
		//Calculate total tution, final cost of college, and monthly payment.
		Double total_tuition = (4 * person.getTuition() * ((person.getApr()/12)/Math.pow(1+ person.getApr()/12,  person.getTime_to_pay() * 12 -1)));
		person.setCost_of_college(total_tuition);
		Double final_cost_of_college = total_tuition + (person.getCost_of_college() * Math.pow(person.getPerc_increase(), person.getYears_in_school()));
		Double monthly_payment = (final_cost_of_college * (((person.getApr()/100)/12))/(1-(Math.pow(1+(person.getApr()/100)/12, (person.getTime_to_pay()* -12)))));
	}
	
}

