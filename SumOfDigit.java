package Assigement2;
import java.util.Scanner;

public class SumOfDigit {
static int sum = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Integer to be Added:  ");
		int s = sc.nextInt();
		while(s>0) {
			
			int n = s%10;
			try {
				sum = sum+n;
				s=s/10;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Sum of Digits : " + sum);

	}

}
