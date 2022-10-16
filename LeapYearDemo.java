package Assigement2;

import java.util.*;

public class LeapYearDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Year ");
		int Year = sc.nextInt();
		if((Year%4==0) &&(Year%100!=0 ) || (Year%400==0)) {
			System.out.println(Year +"  is Leap Year ");
			
		}
		else {
			System.out.println(Year +" Not Leap Year ");
		}

		
	}

}
