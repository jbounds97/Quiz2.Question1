package q2p1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Tuition_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		static Student object1 = new Student();
		object1.setApr(6.);
		object1.setCost_of_college(50000.);
		object1.setPerc_increase(.03);
		object1.setTime_to_pay(10.);
		object1.setTuition(12520.);
		object1.setYears_in_school(4);
	}
	
	@Test
	public void testIsCorrect(){
		System.out.println("Test isCorrect");
		Double bExpectedResult = 70456.29;
		Double bActualResult = College_Cost.calculate_cost(object1);
		assertEquals("test isCorrect() failed", bExpectewdResult, bActualResult);
	}
	
	

}